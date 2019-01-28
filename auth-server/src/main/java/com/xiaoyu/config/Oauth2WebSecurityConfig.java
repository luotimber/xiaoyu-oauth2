package com.xiaoyu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author xiaoyu
 * @date 2019/1/22 16:26
 */
@Order(1)
@Configuration
public class Oauth2WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/authentication/**","/css/**").permitAll()
                .anyRequest().authenticated();

        http.formLogin().loginPage("/authentication/require")
                .loginProcessingUrl("/authentication/form").permitAll()
                .and()
                .csrf().disable();
    }


//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/authentication/**","/css/**");
//    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
