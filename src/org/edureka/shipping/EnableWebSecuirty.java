package com.javatpoint;  
  
import org.springframework.context.annotation.*;  
//import org.springframework.security.config.annotation.authentication.builders.*;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.config.annotation.web.configuration.*;  
import org.springframework.security.core.userdetails.User;  
import org.springframework.security.core.userdetails.UserDetailsService;  
import org.springframework.security.provisioning.InMemoryUserDetailsManager;  
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;  
  
@EnableWebSecurity  
@ComponentScan("com.javatpoint")  
public class WebSecurityConfig implements WebMvcConfigurer {  
      
    @Bean  
    public UserDetailsService userDetailsService() throws Exception {  
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();  
        manager.createUser(User.withDefaultPasswordEncoder().username("javatpoint").  
        password("java123").roles("USER").build());  
        return manager;  
    }  
      
    protected void configure(HttpSecurity http) throws Exception {  
                  
        http  
        .antMatcher("/")                                 
        .authorizeRequests()  
            .anyRequest().hasRole("ADMIN")  
            .and()  
        .httpBasic();  
    }  
}  
