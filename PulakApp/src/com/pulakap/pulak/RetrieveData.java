package com.pulakap.pulak;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.google.appengine.api.datastore.Query.CompositeFilterOperator;
import com.google.appengine.api.datastore.Query.CompositeFilter;
import org.codehaus.jackson.map.ObjectMapper;

//import org.json.simple.JSONObject;
//import org.json.JSONObject;




@SuppressWarnings("serial")
public class RetrieveData extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                   throws ServletException, IOException {

    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    
   //resp.setContentType("text/html");
    //resp.getWriter().println("<table style='margin-top:5%;height:80%; width:60%;border:3px solid #9ea498;text-align:center;font-size:20px;color:#612931;' align='center'><th colspan=2 style='color:#522961;'><strong>User Profile");
    
    String nameo=null;
    Cookie cookies[]=req.getCookies();
    for (int i = 0; i < cookies.length; i++) {
    	 nameo = cookies[i].getValue();
    }
    
    Filter f1=new FilterPredicate("Name", FilterOperator.EQUAL, nameo);
  Query q = new Query("Register").setFilter(f1);
    
    PreparedQuery pq = datastore.prepare(q);

    StringBuffer json = new StringBuffer();
    
    for (Entity entity : pq.asIterable()) {
    
    String nm=(String)entity.getProperty("Name");
    String em=(String)entity.getProperty("E-Mail");
    String mob=(String)entity.getProperty("Mobile");
    String gen=(String)entity.getProperty("Gender");
    String add1=(String)entity.getProperty("address1");
    String add2=(String)entity.getProperty("address2");
    String st=(String)entity.getProperty("State");
    String pin=(String)entity.getProperty("Pin");
    resp.setContentType("application/json");
    
    json.append("  {");
    json.append("    \"name\": \""+nm+"\",");
    //json.append(nm);
    
    //json.append("\",");
    json.append("    \"email\": \"");
    json.append(em);
    
    json.append("\",");
    json.append("    \"mobile\": \"");
    json.append(mob);
    
    json.append("\",");
    json.append("    \"gender\": \"");
    json.append(gen);
    json.append("\",");
    
    json.append("    \"address1\": \"");
    json.append(add1);
    json.append("\",");
    
    json.append("    \"address2\": \"");
    json.append(add2);
    json.append("\",");
    
    json.append("    \"state\": \"");
    json.append(st);
    json.append("\",");
    
    json.append("    \"pin\": \"");
    json.append(pin);
    json.append("\"}");
    
	
    }
    resp.getWriter().write(json.toString());
    
    //ObjectMapper mapper = new ObjectMapper();
   // mapper.writeValue("val", nm);

    
   // resp.setContentType("application/json");
    
    //int size = 15;
   // FetchOptions fetchOptions = FetchOptions.Builder.withLimit(size);
 /*  
  
  */
       
           //obj.put("name", "pulak");
            //obj.put("age", new Integer(100));
          // resp.getWriter().write(obj.toString());
            //RequestDispatcher dispatcher = req.getRequestDispatcher("retrieve.jsp");
            //dispatcher.forward(req, resp);
            //JSONArray list = new JSONArray();
           // list.put("e");
            //list.put("monday");

           // obj.put("messages", list);
           // req.setAttribute("objkey", obj);

            
       // }catch (Exception e) {
            //e.printStackTrace();

        //}
       /*
        //obj.put("A", (String)entity.getProperty("Name"));
                //String name=(String)obj.get("A");
        //String name=(String)entity.getProperty("Name");
        //resp.getWriter().println((String)obj.get("A"));
               // HttpSession session=req.getSession(true);
               // session.setAttribute("jsonObject", obj);
               RequestDispatcher dispatcher = req.getRequestDispatcher("retrieve.jsp");
                dispatcher.forward(req, resp);
*/
               
     /* resp.getWriter().println("<tr>");	
      resp.getWriter().println("<td>Name: </td><td> " + (String)entity.getProperty("Name") + "</td><tr>");

      resp.getWriter().println("<td>Email: </td><td> " + (String)entity.getProperty("E-Mail") + "</td><tr>");
      resp.getWriter().println("<td>Gender:  </td><td>" + (String)entity.getProperty("Gender") + "</td><tr>");
      resp.getWriter().println("<td>Contact:  </td><td>" + entity.getProperty("Mobile") + "</td><tr>");
      resp.getWriter().println("<td>Address1:  </td><td>" + (String)entity.getProperty("address1") + "</td><tr>");
      resp.getWriter().println("<td>Address2: </td><td> " + (String)entity.getProperty("address2") + "</td><tr>");
      resp.getWriter().println("<td>State: </td><td> " + (String)entity.getProperty("State") + "</td><tr>");
      resp.getWriter().println("<td>Pin: </td><td> " + entity.getProperty("Pin") + "</td><tr></strong></table>");
    	*/
    	//}
    //resp.getWriter().println("</center>");
   
    
  }
  

  /*public String generatJSON(String nm)
  {
  StringBuffer returndata=null;
  returndata=new StringBuffer("{\"topic\":{");
  returndata.append("\"name\":\"Pulak\",");
  returndata.append("\"address\":[");
  returndata.append("{\"name\":\"hailakandi\"}]");

  return returndata.toString();
  }*/
  
}