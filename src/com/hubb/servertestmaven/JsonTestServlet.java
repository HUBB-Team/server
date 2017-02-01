//1.2.17 16:06 v0.9
package com.hubb.servertestmaven;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hubb.manager.TestJSON;

/**
 *
 * @author Richard Strauss
 */
@WebServlet(name = "JsonTestServlet", urlPatterns = {"/JsonTestServlet"})
public class JsonTestServlet extends HttpServlet {
    private TestJSON tt;
    
//-------------------------------------------------------------------------------------------------------------------
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        PrintWriter out = response.getWriter();
        String str;
        StringBuilder sb = new StringBuilder();
        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            str = br.readLine();
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            tt = gson.fromJson(str, TestJSON.class);

            
            sb.append(tt.getAuthor()).append(" is a naughty boy.");
            sb.append("\n").append(tt.toString());
            sb.append("\n").append("POST method used");
            
            out.write(toJson(sb.toString(), "1"));
            
        }catch(JsonSyntaxException ex){
            Logger.getLogger(JsonTestServlet.class.getName()).log(Level.SEVERE, null, ex);
            out.write("Some Error Happened: " + ex.toString());
        }
    }
      
//-------------------------------------------------------------------------------------------------------------------
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        PrintWriter out = response.getWriter();
        String str;
        StringBuilder sb = new StringBuilder();
        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            str = br.readLine();
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            tt = gson.fromJson(str, TestJSON.class);

            
            sb.append(tt.getAuthor()).append(" is a naughty boy.");
            sb.append("\n").append(tt.toString());
            sb.append("\n").append("GET method used");
            
            out.write(toJson(sb.toString(), "1"));
            
        }catch(JsonSyntaxException ex){
            Logger.getLogger(JsonTestServlet.class.getName()).log(Level.SEVERE, null, ex);
            out.write("Some Error Happened: " + ex.toString());
        }
    }

//-------------------------------------------------------------------------------------------------------------------    
    public String toJson(Object obj, String dfString) {
        try{
            Gson gson = new GsonBuilder().setDateFormat(dfString).create();
            return gson.toJson(obj);
        } catch(Exception ex){
            ex.printStackTrace(System.err);
            return "-1";
        }
    }
    
    
    public <T> T fromJson(String json, Class<T> obj, String dfString) {
        try{
            Gson gson = new GsonBuilder().setDateFormat(dfString).create();
            return gson.fromJson(json, obj);
        } catch(JsonSyntaxException ex){
            ex.printStackTrace(System.err);
            return null;
        }
    }
    
//-------------------------------------------------------------------------------------------------------------------
    @Override
    public String getServletInfo() {
        return "This is a Test Servlet, which is returning nothing but a bag full of json D's.";
    }
}
