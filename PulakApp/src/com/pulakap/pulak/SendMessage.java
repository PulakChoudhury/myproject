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
public class SendMessage extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException,ServletException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().println("Hello, world");
		
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException,ServletException {
		resp.setContentType("text/html;charset=UTF-8");
	
		

		String email = "pulak.pijush@a-cti.com"; //http://www.indyarocks.com/ 
		String user = "Pulakdj89";    
		String pass = "sbu11smc";
		String number ="8939263911"; //no on which sms is to be send   
		String msg = "hello pulak";//message to be send
		try{
		       try {
		                String mURL;
		                mURL = "http://www.onl9class.com/smsapi/smsir.php?email=" + email + "&user=" + user + "&pass=" + pass + "&number=" + number + "&msg=" + URLEncoder.encode(msg, "UTF-8");
		                URL url = new URL(mURL);
		                BufferedReader reader = null;            
		                reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
		                String aline;
		                aline = reader.readLine();
		                while (aline != "") 
		                {     
		                	System.out.print(aline);
		                   //JOptionPane.showMessageDialog(null,""+aline);
		                    break;
		                }
		                if (reader != null) 
		                {
		                    try 
		                    {                    
		                        reader.close();                    
		                    } finally  
		                    {
		                        System.out.println("its working");
		                    }
		                }            
		            } catch (Exception ex) 
		                {
		                    System.out.println("Error "+ex);
		                }
		        } catch(Exception ex){
		            }
		
	}
	
	}


