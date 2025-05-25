package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Auth.Config;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Auth.JwtAuthEntryPoint;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Auth.JwtAuthenticationFilter;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Auth.Service.JwtService;
import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Auth.Service.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    private final JwtAuthEntryPoint authEntryPoint;
    private final JwtService jwtService;
    private final UserDetailsService userDetailsService;

    public SecurityConfig(JwtAuthEntryPoint authEntryPoint,
                          JwtService jwtService,
                          UserDetailsService userDetailsService) {
        this.authEntryPoint = authEntryPoint;
        this.jwtService = jwtService;
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .exceptionHandling(exception -> exception
                        .authenticationEntryPoint(authEntryPoint))
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth -> auth
//                        for color
                                .requestMatchers(HttpMethod.GET,"/api/colors").permitAll()
                                .requestMatchers(HttpMethod.GET, "/api/colors/all").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/colors/{id}").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/colors/create").permitAll()
                                .requestMatchers(HttpMethod.PUT, "/api/colors/update/{id}").hasRole("ADMINISTRADOR")
                                .requestMatchers(HttpMethod.DELETE, "/api/colors/delete/{id}").hasRole("ADMINISTRADOR")
//                        for brands
                                .requestMatchers(HttpMethod.GET,"/api/brands").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/brands/all").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/brands/{id}").permitAll()
                                .requestMatchers(HttpMethod.POST,"/api/brands/create").permitAll()
                                .requestMatchers(HttpMethod.PUT,"/api/brands/update/{id}").hasRole("ADMINISTRADOR")
                                .requestMatchers(HttpMethod.DELETE,"/api/brands/delete/{id}").hasRole("ADMINISTRADOR")

//                        for models
                                .requestMatchers(HttpMethod.GET,"/api/models").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/models/all").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/models/{id}").permitAll()
                                .requestMatchers(HttpMethod.POST,"/api/models/create").permitAll()
                                .requestMatchers(HttpMethod.PUT,"/api/models/update/{id}").hasRole("ADMINISTRADOR")
                                .requestMatchers(HttpMethod.DELETE,"/api/models/delete/{id}").hasRole("ADMINISTRADOR")
//    For Models By Brands
                                .requestMatchers(HttpMethod.GET,"/api/models/byBrand/{id}").permitAll()
//                        For vehicles by person id
                                .requestMatchers(HttpMethod.GET,"/api/vehicles/person/{personId}").permitAll()
//                        for FuelTypes
                                .requestMatchers(HttpMethod.GET,"/api/fuelTypes").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/fuelTypes/all").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/fuelTypes/{id}").permitAll()
                                .requestMatchers(HttpMethod.POST,"/api/fuelTypes/create").permitAll()
                                .requestMatchers(HttpMethod.PUT,"/api/fuelTypes/update/{id}").hasRole("ADMINISTRADOR")
                                .requestMatchers(HttpMethod.DELETE,"/api/fuelTypes/delete/{id}").hasRole("ADMINISTRADOR")
//                        for VehiclesType
                                .requestMatchers(HttpMethod.GET,"/api/vehicleType").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/vehicleType/all").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/vehicleType/{id}").permitAll()
                                .requestMatchers(HttpMethod.POST,"/api/vehicleType/create").permitAll()
                                .requestMatchers(HttpMethod.PUT,"/api/vehicleType/update/{id}").hasRole("ADMINISTRADOR")
                                .requestMatchers(HttpMethod.DELETE,"/api/vehicleType/delete/{id}").hasRole("ADMINISTRADOR")
//                        for vehicles
                                .requestMatchers(HttpMethod.GET,"/api/vehicles").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/vehicles/all").permitAll()
                                .requestMatchers(HttpMethod.GET,"/api/vehicles/{id}").permitAll()
                                .requestMatchers(HttpMethod.POST,"/api/vehicles/create").permitAll()
                                .requestMatchers(HttpMethod.PUT,"/api/vehicles/update/{id}").permitAll()
                                .requestMatchers(HttpMethod.DELETE,"/api/vehicles/delete/{id}").hasRole( "CLIENTE")
//                      wallet
                                .requestMatchers(HttpMethod.GET,"/api/vehicles/{vehiclesId}/wallet").permitAll()
                                .requestMatchers(HttpMethod.PUT,"/api/wallets/{walletId}/balance").permitAll()
                                .anyRequest().denyAll()
                )
                .addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    @Bean
    public JwtAuthenticationFilter jwtAuthenticationFilter() {
        return new JwtAuthenticationFilter(jwtService, (UserDetailsServiceImpl) userDetailsService);
    }

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}