package com.pulakap.pulak;
import java.io.*;
import java.util.*;

import javax.servlet.*;

import java.io.IOException;

import javax.servlet.http.*;

import java.io.PrintWriter;
import java.net.*;

	@SuppressWarnings("serial")
	public class ResourceData extends HttpServlet {
		public void doGett(HttpServletRequest req, HttpServletResponse resp)
				throws IOException,ServletException {
			resp.setContentType("text/html;charset=UTF-8");
			//resp.getWriter().println("Hello, world");
			
		}
		public void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws IOException,ServletException {
			resp.setContentType("text/html;charset=UTF-8");
			
			//PrintWriter out=resp.getWriter();
			String str=req.getParameter("wb");
			URL page = new URL("http://"+str);
		    HttpURLConnection conn = (HttpURLConnection) page.openConnection();
		    conn.connect();
		    //InputStreamReader in = new InputStreamReader((InputStream) conn.getContent());
		    BufferedReader buff = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		 
		    String line;
		    do {
		      line = buff.readLine();
		      resp.getWriter().append(line + "\n");

		    } while (line != null);
		    
		    resp.getWriter().write(resp.getWriter().toString());

		    
		 }
			
		
		
		

		
}
