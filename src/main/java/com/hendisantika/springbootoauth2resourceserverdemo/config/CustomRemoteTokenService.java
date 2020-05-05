package com.hendisantika.springbootoauth2resourceserverdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-oauth2-resource-server-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/05/20
 * Time: 06.26
 */
public class CustomRemoteTokenService implements ResourceServerTokenServices {

    private final RestOperations restTemplate;

    private final AccessTokenConverter tokenConverter = new DefaultAccessTokenConverter();

    @Autowired
    public CustomRemoteTokenService() {
        restTemplate = new RestTemplate();
        ((RestTemplate) restTemplate).setErrorHandler(new DefaultResponseErrorHandler() {
            @Override
            // Ignore 400
            public void handleError(ClientHttpResponse response) throws IOException {
                if (response.getRawStatusCode() != 400) {
                    super.handleError(response);
                }
            }
        });
    }
}
