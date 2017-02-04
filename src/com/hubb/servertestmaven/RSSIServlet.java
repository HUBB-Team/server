package com.hubb.servertestmaven;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.hubb.rssi.RSSIManager;
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

/**
 *
 * @author Richard Strauss
 */
@WebServlet(name = "RSSIServlet", urlPatterns = {"/RSSIServlet"})
public class RSSIServlet extends HttpServlet {
    private RSSIManager rsm = new RSSIManager();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "POST, GET");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        response.addHeader("Access-Control-Max-Age", "86400");

        PrintWriter out = response.getWriter();
        String str;
        StringBuilder sb = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            str = br.readLine();
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            rsm = gson.fromJson(str, RSSIManager.class);
            
           

            try{
                sb.append(toJson(rsm.toString(), "1"));
                
                //rsm. - object cu toate values, efectuam dofega calcule
                
            }catch(Exception exe){
                exe.printStackTrace(System.err);
                sb.append("Some err happened").append("\n");
            }
            out.write(toJson(sb.toString(), "1"));
            
        }catch(JsonSyntaxException ex){
            Logger.getLogger(CredentialsServlet.class.getName()).log(Level.SEVERE, null, ex);
            out.write("Some Error Happened: " + ex.toString());
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "No description for this servlet.";
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

}
