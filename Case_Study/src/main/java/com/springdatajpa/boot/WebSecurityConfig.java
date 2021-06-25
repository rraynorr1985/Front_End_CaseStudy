package com.springdatajpa.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//Class implementing Spring Security feature
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Qualifier("userDetailsServiceImpl")
	@Autowired
	private UserDetailsService userDetailsService;
	
	//This encoding password for security purpose
	 @Bean
	    public BCryptPasswordEncoder bCryptPasswordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	//That Method giving different permission for different roles
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/", "/reg", "/resources/**", "/static/**", "/styles/**", "/scripts/**", "/css/**", "/js/**",
						"/images/**").permitAll()
				.antMatchers("/doctorsuser","/uploadForm","/files").hasAnyRole("ADMIN","USER")		
				.antMatchers("/doctors","/newdoc", "/savedoc","/editdoc",
						"/delete","/assigninsurance","/addinsurance","/newins","/saveins","/assignins","/deleteins")
				.hasAnyRole("ADMIN")				
				.and().formLogin()	
				.loginPage("/login")
				.permitAll()
				.and()
			.logout()
				.permitAll();
		
	}
	//Part of Spring security implementation
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	} 
	//Part of Spring security implementation
	@Bean
    public AuthenticationManager customAuthenticationManager() throws Exception {
		
        return authenticationManager();
    }

}


