package com.savings.services;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class RequestLoggingFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("in destroy");

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		String path = ((HttpServletRequest) req).getRequestURI();
		if (path.startsWith("/1.0.2/login")) {
			req.getRequestDispatcher("/").forward(req, res);
		} else
			chain.doFilter(req, res);
		System.out.println("response");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("In Init of RequestLoggingFilter");

	}

}
