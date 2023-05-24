package AssistedProjects;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code, if needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Pre-processing code

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURL = httpRequest.getRequestURL().toString();
        String remoteAddress = httpRequest.getRemoteAddr();

        System.out.println("Request URL: " + requestURL);
        System.out.println("Remote Address: " + remoteAddress);

        // Call the next filter in the chain, or the servlet if this is the last filter
        chain.doFilter(request, response);

        // Post-processing code
    }

    @Override
    public void destroy() {
        // Cleanup code, if needed
    }
}
