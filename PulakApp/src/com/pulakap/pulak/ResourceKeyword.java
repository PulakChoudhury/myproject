package com.pulakap.pulak;
import java.io.*;
import java.util.*;

import javax.servlet.*;

import java.io.IOException;

import javax.servlet.http.*;

import java.io.PrintWriter;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	@SuppressWarnings("serial")
	public class ResourceKeyword extends HttpServlet {
		
		
		public void doGett(HttpServletRequest req, HttpServletResponse resp)
				throws IOException,ServletException {
			resp.setContentType("text/html;charset=UTF-8");
			//resp.getWriter().println("Hello, world");
		
			
		}
		public void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws IOException,ServletException {
			
				
			
			resp.setContentType("text/html;charset=UTF-8");
			//PrintWriter out=resp.getWriter();
			String str=req.getParameter("keyval");
			URL page = new URL("http://www.google.co.in/search?q="+URLEncoder.encode(str)+"&hl=en&start=00&sa=N");
		      System.out.print(str);

			HttpURLConnection conn = (HttpURLConnection) page.openConnection();
		    conn.connect();
		    BufferedReader buff = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		 StringBuilder br=new StringBuilder();

		 

		    String line;
		    do {
		      line = buff.readLine();
		      br.append(line + "\n");
		      
		   } while (line != null);
		   
		   
		    Pattern p = Pattern.compile("(https?://([-\\w\\.]+)+(:\\d+)?(/([\\w/_\\.]*(\\?\\S+)?)?)?)");

		    Matcher m = p.matcher(br.toString());
		    int i=1;
		    
		    while (m.find() == true) {
		    	if(i<25)
		    	{
		    		i++;
		    		continue;
		    	}
		    	resp.getWriter().write("<a href="+m.group(0).toString()+">"+m.group(0).toString()+"</a><br/>");
		      System.out.println(m.group(0));
		    
		      if(i>50){
		    	break;
		    	
		    }
		    else
		    {

		    	i++;
		    }
		    }
  
		    
		  // matcher.matches();
		   //Pattern p = Pattern.compile("<a +href=\"([a-zA-z0-9\\:\\-\\/\\.]+)\">");
		   //Matcher m = p.matcher(pge);


		   
		  //  while (matcher.find()) {
		    //System.out.println(matcher.group(1).toString());
		    //resp.getWriter().write(matcher.group(1).toString());

		    //}

		   // resp.getWriter().write(pge.toString());
		}		
}
