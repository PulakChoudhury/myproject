package com.pulakap.pulak;
import javax.servlet.*;
import java.io.IOException;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class SendEmail extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException,ServletException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().println("Hello, world");
		
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException,ServletException {
		resp.setContentType("text/html;charset=UTF-8");
	String email=(String)req.getParameter("emailid");
	String sub=(String)req.getParameter("subject");
	String mes=(String)req.getParameter("txt");
	
		  JavaEmailSender sen = new JavaEmailSender();
		     //Sending test email
		      sen.createAndSendEmail(email, sub, mes);
		
	}
	
	}


