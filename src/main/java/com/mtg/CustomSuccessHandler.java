package com.mtg;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by RyanLeno on 2017-05-30.
 */


public class CustomSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private final static Logger LOGGER = Logger.getLogger(CustomSuccessHandler.class.getName());
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

        LOGGER.info("authentication success");
        handle(httpServletRequest, httpServletResponse, authentication);

    }

    protected void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException {


        String targetUrl = determineTargetUrl(httpServletRequest, httpServletResponse);

        if (httpServletResponse.isCommitted()) {
            logger.debug(
                    "Response has already been committed. Unable to redirect to "
                            + targetUrl);
            return;
        }

        if (targetUrl.equals("/")) targetUrl = "/welcome";
        redirectStrategy.sendRedirect(httpServletRequest, httpServletResponse, targetUrl);

    }
}
