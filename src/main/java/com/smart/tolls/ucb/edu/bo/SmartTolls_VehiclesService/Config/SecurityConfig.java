package com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Config;

import com.smart.tolls.ucb.edu.bo.SmartTolls_VehiclesService.Auth.JwtAuthFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final JwtAuthFilter jwtAuthFilter;

    public SecurityConfig(JwtAuthFilter jwtAuthFilter) {
        this.jwtAuthFilter = jwtAuthFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/vehicles/**",
                                "/api/vehicleType/**",
                                "/api/models/**",
                                "/api/brands/**",
                                "/api/fuel/types/**").authenticated() // SOLO ESTOS ENDPOINTS REQUIEREN AUTENTICACIÓN
                        .anyRequest().permitAll() // TODOS LOS DEMÁS ENDPOINTS ESTÁN PERMITIDOS
                )
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
