package com.pulakap.pulak;
import javax.servlet.*;

import java.io.IOException;

import javax.servlet.http.*;

import java.io.PrintWriter;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.QueryResultList;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.google.appengine.api.datastore.Query.CompositeFilterOperator;


@SuppressWarnings("serial")
public class PulakAppServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException,ServletException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().println("Hello, world");
		
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException,ServletException {
		resp.setContentType("text/html;charset=UTF-8");
		process(req,resp);
	}
	
	 public void process(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html;charset=UTF-8");
	
		PrintWriter out=res.getWriter();
		int flag=0;
	    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		// int size = 15;
		   // FetchOptions fetchOptions = FetchOptions.Builder.withLimit(size);
		    
		String name=req.getParameter("user");
		
		Cookie ck=new Cookie("cook", name);
		ck.setMaxAge(24*60*60);
		res.addCookie(ck);
		    
		    String nam=req.getParameter("user");
		    String pas=req.getParameter("pass");
		  
		    /*Filter filt1 =new FilterPredicate("Name",
		    		FilterOperator.EQUAL, nam);
		   Filter filt2 =new FilterPredicate("Password",
		    		FilterOperator.EQUAL, pas);

		    		Filter SearchFilter =
		    		  CompositeFilterOperator.and(filt1,filt2);*/
		    
		    Query qu = new Query("Register");
		    PreparedQuery pqu = datastore.prepare(qu);
		    
		  //  QueryResultList<Entity> results = pqu.asQueryResultList(fetchOptions);
		    
		    java.lang.Iterable<com.google.appengine.api.datastore.Entity> entities;
		    //java.util.Iterator<com.google.appengine.api.datastore.Entity> entityIterator;
		    //Entity entity;
		    
		    entities=pqu.asIterable();
		    //entityIterator = entities.iterator();
		   // while (entityIterator.hasNext()) 
		    //{
		      //  entity = entityIterator.next();
		        
		   for (Entity entit : entities)
		    {
		    	
		     if((entit.getProperty("Name").toString().equalsIgnoreCase(nam)) && entit.getProperty("Password").toString().equalsIgnoreCase(pas))
		     {
		    	 
		    	flag=1;
		     }
		    
		    }
		   if(flag==1)
		   {
			   res.sendRedirect("/MainPage.jsp");
		   }
		   else
		   {
			   res.sendRedirect("/Login.html");
		   }
	}
}
