package com.example.demo.test;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
//    public UserDetails loadUserByUsername(String username)
//            throws UsernameNotFoundException {
//        List<UserDetails> users = loadUsersByUsername(username);
//        if (users.size() == 0) {
//            throw new UsernameNotFoundException(
//                    this.messages.getMessage("JdbcDaoImpl.notFound",
//                            new Object[] { username }, "Username {0} not found"));
//        }
//        UserDetails user = users.get(0);
//        Set<GrantedAuthority> dbAuthsSet = new HashSet<>();
//        if (this.enableAuthorities) {
//            dbAuthsSet.addAll(loadUserAuthorities(user.getUsername()));
//        }
//        if (this.enableGroups) {
//            dbAuthsSet.addAll(loadGroupAuthorities(user.getUsername()));
//        }
//        List<GrantedAuthority> dbAuths = new ArrayList<>(dbAuthsSet);
//        addCustomAuthorities(user.getUsername(), dbAuths);
//        if (dbAuths.size() == 0) {
//            throw new UsernameNotFoundException(this.messages.getMessage(
//                    "JdbcDaoImpl.noAuthority", new Object[] { username },
//                    "User {0} has no GrantedAuthority"));
//        }
//        return createUserDetails(username, user, dbAuths);
//    }
//    protected List<UserDetails> loadUsersByUsername(String username) {
//        return getJdbcTemplate().query(this.usersByUsernameQuery,
//                new String[] { username }, (rs, rowNum) -> {
//                    String username1 = rs.getString(1);
//                    String password = rs.getString(2);
//                    boolean enabled = rs.getBoolean(3);
//                    return new User(username1, password, enabled, true, true, true,
//                            AuthorityUtils.NO_AUTHORITIES);
//                });
//    }
}
