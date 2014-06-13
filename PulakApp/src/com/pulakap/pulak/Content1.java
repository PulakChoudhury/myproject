package com.pulakap.pulak;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Content1 {
  public static void main(String[] argv) throws Exception {

    URL url = new URL("http://moz.com/top500");
    URLConnection conn = url.openConnection();
    conn.connect();
    BufferedReader buff = new BufferedReader(new InputStreamReader(conn.getInputStream()));  
    StringBuilder response = new StringBuilder();
    String inputLine;
    String line;
    
    do {
      line = buff.readLine();
     response.append(line + "\n");
    } while (line != null);

   
    Pattern p = Pattern.compile("(https://)+[a-z|A-Z]+(.)+[a-z]+.com");
    Matcher m = p.matcher(response.toString());
    while (m.find() == true) {
      System.out.println(m.group(0));
    }
  }
}