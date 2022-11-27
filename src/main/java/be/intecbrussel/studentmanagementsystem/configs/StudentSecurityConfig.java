package be.intecbrussel.studentmanagementsystem.configs;

import be.intecbrussel.studentmanagementsystem.entity.user_student.StudentUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Order(2)
public class StudentSecurityConfig {

    @Bean
    public UserDetailsService studentUserDetailsService(){
        return new StudentUserDetailsService();
    }

    @Bean
    public PasswordEncoder passwordEncoder2(){
        return NoOpPasswordEncoder.getInstance();
    }
    @Bean
    public DaoAuthenticationProvider authenticationProvider2(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(studentUserDetailsService());
        provider.setPasswordEncoder(passwordEncoder2());
        return provider;
    }

    @Bean
    public SecurityFilterChain filterChain2(HttpSecurity http) throws Exception {

        http.authenticationProvider(authenticationProvider2());


        http.antMatcher("/student/**")
                .authorizeRequests().anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/student/login")
                .usernameParameter("email")
                .loginProcessingUrl("/student/login")
                .defaultSuccessUrl("/student/home")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/student/logout")
                .logoutSuccessUrl("/");

        return http.build();
    }

}


