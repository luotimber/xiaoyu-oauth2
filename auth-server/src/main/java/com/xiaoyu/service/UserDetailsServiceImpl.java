package com.xiaoyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author xiaoyu
 * @date 2019/1/22 16:01
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        final String sql = "SELECT id,username,password FROM oauth_user WHERE username = ?";

        return jdbcTemplate.queryForObject(sql,(resultSet, i) -> {
            Long id = resultSet.getLong("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");

            UserDetailsImpl userDetails = new UserDetailsImpl();
            userDetails.setId(id);
            userDetails.setUsername(username);
            userDetails.setPassword(password);

            return userDetails;
        },s);

    }
}
