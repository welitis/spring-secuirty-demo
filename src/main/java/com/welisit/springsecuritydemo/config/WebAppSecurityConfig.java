package com.welisit.springsecuritydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author welisit
 * @Description springsecurity的核心配置类
 * @create 2020-06-30 22:50
 */
@Configuration
@EnableWebSecurity // 启用Web 安全功能
public class WebAppSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 重写父类的认证方法，放行部分页面访问
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests() // 对请求进行授权
                .antMatchers("/") // 使用ANT风格匹配要授权的URL地址
                .permitAll() // 允许并放行上面匹配到的地址的请求
                .anyRequest() // 其他的请求
                .authenticated() // 需要被认证
                .and()
                .formLogin(); // 未被认证的页面自动重定向到登录页


    }
}
