package com.app.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;


public class CharacterEncodingFilter implements  Filter {
	private final Logger log = Logger.getLogger(CharacterEncodingFilter.class);
	private String charset = null;

	public void init(FilterConfig arg0) throws ServletException {
		String initParam = arg0.getInitParameter("charset");
		if (initParam != null && (initParam = initParam.trim()).length() != 0) {
			log.info("��CharacterEncodingFilter��charset����Ϊ" + initParam);
			charset = initParam;
		}
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chan) throws IOException, ServletException {
		log.info("����CharacterEncodingFilter��doFilter()����");

		if (charset != null) {
			request.setCharacterEncoding(charset); // �����������ݵ��ַ���
			response.setCharacterEncoding(charset); // ������Ӧ���ݵ��ַ���
		}
		chan.doFilter(request, response); // ��������������
		log.info("�˳�CharacterEncodingFilter��doFilter()����");
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}
}
