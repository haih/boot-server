package com.haih.server.boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/**
 * Security configuration.
 *
 */
@Configuration
@Order(Ordered.LOWEST_PRECEDENCE-3)
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user1").password("secret1").roles("USER")
                .and()
                .withUser("user2").password("secret2").roles("USER");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().fullyAuthenticated();
        http.httpBasic();
        http.csrf().disable();
    }
    
    @Override
    public void configure(WebSecurity web) throws Exception {
        web
        // Define public access resources white list
        .ignoring()
        	.antMatchers("/**")
            .antMatchers("/css/**")
            .antMatchers("/fonts/**")
            .antMatchers("/html/**")
            .antMatchers("/i18n/**")
            .antMatchers("/img/**")
            .antMatchers("/js/**")
            .antMatchers("/libs/**");
    }
    
}
