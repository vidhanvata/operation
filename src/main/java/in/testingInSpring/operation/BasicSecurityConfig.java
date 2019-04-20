package in.testingInSpring.operation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter{
//	
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//	
//	@Autowired
//	private DataSource dataSource;
//	
//	@Value("${spring.queries.user-query}")
//	private String userQuery;
//	
//	@Value("${spring.queries.roles-query}")
//	private String roleQuery;
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception
	{
//		httpSecurity.authorizeRequests()
//		// URLs matching for access rights
//		.antMatchers("/student/**").hasRole("USER")
//		.antMatchers("/private/**").hasRole("ADMIN")
//		.antMatchers("/home").hasAnyRole("USER","ADMIN")
//		.antMatchers("/loginPage").permitAll()
//		.anyRequest().authenticated()
//		.and()
//		// form login
//		.csrf().disable().formLogin()
//		.loginPage("/loginPage")
//		.failureUrl("/loginPage?error=true")
//		.defaultSuccessUrl("/home.jsp")
//		.usernameParameter("email")
//		.passwordParameter("password")
//		.and()
//		// logout
//		.logout()
//		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		.logoutSuccessUrl("/").and()
//		.exceptionHandling()
//		.accessDeniedPage("/access-denied");
		httpSecurity
			.httpBasic()
			.and()
			.authorizeRequests()
			.antMatchers("/student/**").hasRole("USER")
			.antMatchers("/private/**").hasRole("ADMIN")
			.antMatchers("/home").hasAnyRole("USER","ADMIN")
			.anyRequest()
			.permitAll().and()
			.formLogin()
			.loginPage("/loginPage")
			.failureUrl("/loginPage?error=true")
			.defaultSuccessUrl("/home.jsp")
			.usernameParameter("email")
			.passwordParameter("password")
			.and()			
			.logout()
			.logoutSuccessUrl("/home.jsp")
			.and()
			.exceptionHandling()
			.accessDeniedPage("/access-denied");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder builder) throws Exception
	{
		builder
			.inMemoryAuthentication()
			.withUser("Vidhan")
			.password("{noop}12345")
			.roles("USER")
			.and()
			.withUser("vats")
			.password("{noop}1234567890")
			.roles("ADMIN");
		
//		builder
//			.jdbcAuthentication()
//			.usersByUsernameQuery(userQuery)
//			.authoritiesByUsernameQuery(roleQuery)
//			.dataSource(dataSource)
//			.passwordEncoder(bCryptPasswordEncoder);
	}
}
