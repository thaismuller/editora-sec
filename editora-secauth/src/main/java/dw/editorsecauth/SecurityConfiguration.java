package dw.editorsecauth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{ /*aula 2*/
    private final String clientId;
    private final String logoutURL;
    private final String redirectURI;

    public SecurityConfiguration(
        @Value("${spring.security.oauth2.client.registration.cognito.clientId}") String clientId,
        @Value("${app.cognito.logoutURL}") String logoutURL,
        @Value("${app.cognito.redirectURI}") String redirectURI
    ) {
        this.clientId = clientId;
        this.logoutURL = logoutURL;
        this.redirectURI = redirectURI;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
            .and()
            .authorizeRequests(
                authz -> authz.mvcMatchers("/")
                    .permitAll()
                    .anyRequest()
                    .authenticated() //toda solicitacao deve ser autenticada 
            )
            .oauth2Login() //o processo de login pega o oauth2
            .and()
            .logout()
            .logoutSuccessHandler(new CognitoOidcLogoutSuccessHandler(logoutURL, clientId, redirectURI)) //descricao processo de logout
            .invalidateHttpSession(true) //invalida a sessao do usuario 
            .clearAuthentication(true) //limpa a autenticação 
            .deleteCookies("JSESSIONID"); //aula 2 
    }
}
