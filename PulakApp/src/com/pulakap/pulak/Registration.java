package com.pulakap.pulak;
import java.io.*;
import java.util.*;

import javax.servlet.*;

import java.io.IOException;

import javax.servlet.http.*;

import java.io.PrintWriter;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.QueryResultList;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.jsp.ah.datastoreViewerBody_jsp;

	@SuppressWarnings("serial")
	public class Registration extends HttpServlet {
		public void doGett(HttpServletRequest req, HttpServletResponse resp)
				throws IOException,ServletException {
			resp.setContentType("text/html;charset=UTF-8");
			//resp.getWriter().println("Hello, world");
			
		}
		public void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws IOException,ServletException {
			resp.setContentType("text/html;charset=UTF-8");
			
			PrintWriter out=resp.getWriter();
			int flag=0;
			int flag1=0;
			final String un=req.getParameter("username");
			final String pas=req.getParameter("pas");
			
			String mob=req.getParameter("mobile");
			String em=req.getParameter("email");
			String sx=req.getParameter("sex");
			String ad1=req.getParameter("add1");
			String ad2=req.getParameter("add2");
			String st=req.getParameter("state");
			String pin=req.getParameter("pin");
			
			Cookie cks=new Cookie("cook", un);
			resp.addCookie(cks);
			
DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
//Filter ft=new FilterPredicate("Name", FilterOperator.EQUAL, un);
Query qr=new Query("Register");
PreparedQuery pq=ds.prepare(qr);
for(Entity ent: pq.asIterable())
{
if((ent.getProperty("Name").toString().equalsIgnoreCase(un)) || (ent.getProperty("E-Mail").toString().equalsIgnoreCase(em)))
{
	flag=1;
}
}
if(flag==1)
{
	out.print("<script>alert('User already exist with this name or E-Mail ID')</script>");
	

}
else
{
			
			Entity e=new Entity("Register");
		
			e.setProperty("Name", un);
			e.setProperty("Password",pas);
			e.setProperty("E-Mail", em);
			e.setProperty("Gender", sx);
			e.setProperty("Mobile", mob);
			e.setProperty("address1", ad1);
			e.setProperty("address2", ad2);
			e.setProperty("State",st );
			e.setProperty("Pin",pin );
			ds.put(e);
			
			
			Properties props = new Properties();
	        Session session = Session.getDefaultInstance(props, null);

	        String msgBody = "Thank you for registering to pulak@pp.\n"
	        		+"Your account has been activated.\n"
	        		+ "Here is your account information for your future reference:\n"
	        		+ "UserName: "+un
	        		+ "\n Password: "+pas
	        		+"\nFor further information you can contact us by sending an email to pulak.pijush@a-cti.com";

	        try {
	            Message msg = new MimeMessage(session);
	            msg.setFrom(new InternetAddress("pulak.pijush@a-cti.com", "pulak@pp Registration confirmation"));
	            msg.addRecipient(Message.RecipientType.TO,
	                             new InternetAddress(em, "Hello, "+un));
	            msg.setSubject("Registration Confirmation");
	            msg.setText(msgBody);
	            Transport.send(msg);
	           
	        } catch (AddressException xe) {
	           
	        } catch (MessagingException fe) {
	            
	        }

	        	
	        //out.print("<script>alert('Registration Successfull')</script>");
	        resp.sendRedirect("/MainPage.jsp");
	       
			
		}

		}
}
