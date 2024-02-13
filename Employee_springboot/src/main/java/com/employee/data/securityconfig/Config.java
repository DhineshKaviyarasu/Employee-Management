package com.employee.data.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.employee.data.service_impl.UserService;




@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfiguration {
	
	@Autowired
    private UserService userDetailsService;
	
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(userDetailsService);
	    }
	
	 @Bean
	    public PasswordEncoder passwordEncoder(){
	        return NoOpPasswordEncoder.getInstance();
	    }
	 
		/*
		 * @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http)
		 * throws Exception { return http.csrf().disable() .authorizeHttpRequests()
		 * .requestMatchers("/login").permitAll() .and()
		 * .authorizeHttpRequests().requestMatchers("/login/user/**").authenticated()
		 * .and()
		 * .authorizeHttpRequests().requestMatchers("/login/admin/**").authenticated()
		 * .and().formLogin() .and().build();     }
		 */
}