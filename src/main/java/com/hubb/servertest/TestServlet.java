//27.1.17 23:47 v0.3
package com.hubb.servertest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Richard Strauss
 */
@WebServlet(name = "TestServlet", urlPatterns = {"/TestServlet"})
public class TestServlet extends HttpServlet {
   

//-------------------------------------------------------------------------------------------------------------------
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out;
        Enumeration<String> parameterNames;
        ArrayList<ParamList> paramList;
        
        try {
            out = response.getWriter();
            paramList = new ArrayList<>();
            parameterNames = request.getParameterNames();

            while (parameterNames.hasMoreElements()) {
                String paramName = parameterNames.nextElement();
                ParamList p = new ParamList();
                p.addName(paramName);
                
                String[] paramValues = request.getParameterValues(paramName);
                for (String paramValue : paramValues) {
                    p.addValue(paramValue);
                }
                paramList.add(p);
            }
            
            String jsn = toJson(paramList, "9");
            out.write(jsn);

        } catch(IOException ex){
            ex.printStackTrace(System.err);
        }
    }
      
//-------------------------------------------------------------------------------------------------------------------
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out;
        Enumeration<String> parameterNames;
        ArrayList<ParamList> paramList;
        
        try {
            out = response.getWriter();
            paramList = new ArrayList<>();
            parameterNames = request.getParameterNames();

            while (parameterNames.hasMoreElements()) {
                String paramName = parameterNames.nextElement();
                ParamList p = new ParamList();
                p.addName(paramName);
                
                String[] paramValues = request.getParameterValues(paramName);
                for (String paramValue : paramValues) {
                    p.addValue(paramValue);
                }
                paramList.add(p);
            }
            
            String jsn = toJson(paramList, "9");
            out.write(jsn);
            
        }catch(IOException ex){
            ex.printStackTrace(System.err);
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
