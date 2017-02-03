package com.hubb.manager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dependencies {
    @SerializedName("body-parser")
    @Expose
    private String bodyParser;
    @SerializedName("cookie-parser")
    @Expose
    private String cookieParser;
    @SerializedName("express")
    @Expose
    private String express;
    @SerializedName("express-session")
    @Expose
    private String expressSession;
    @SerializedName("moment")
    @Expose
    private String moment;
    @SerializedName("multer")
    @Expose
    private String multer;
    @SerializedName("mysql")
    @Expose
    private String mysql;
    @SerializedName("serve-favicon")
    @Expose
    private String serveFavicon;
    @SerializedName("validator")
    @Expose
    private String validator;

//------------------------------------------------------------------------    
    @Override
    public String toString() {
        return "\n\u0009body-parser: " + getBodyParser() + ", \n\u0009cookie-parser: " +getCookieParser() + ", \n\u0009express: " + getExpress() + ", \n\u0009express-session: "
                + getExpressSession() + ", \n\u0009moment: " +getMoment() + ", \n\u0009multer: " +getMulter() + ", \n\u0009mysql: " +getMysql() + ", \n\u0009serve-favicon: "
                + getServeFavicon() + ", \n\u0009validator: " + getValidator();
    } 
//------------------------------------------------------------------------          
    
    
    public String getBodyParser() {
        return bodyParser;
    }

    public void setBodyParser(String bodyParser) {
        this.bodyParser = bodyParser;
    }

    public String getCookieParser() {
        return cookieParser;
    }

    public void setCookieParser(String cookieParser) {
        this.cookieParser = cookieParser;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    public String getExpressSession() {
        return expressSession;
    }

    public void setExpressSession(String expressSession) {
        this.expressSession = expressSession;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public String getMulter() {
        return multer;
    }

    public void setMulter(String multer) {
        this.multer = multer;
    }

    public String getMysql() {
        return mysql;
    }

    public void setMysql(String mysql) {
        this.mysql = mysql;
    }

    public String getServeFavicon() {
        return serveFavicon;
    }

    public void setServeFavicon(String serveFavicon) {
        this.serveFavicon = serveFavicon;
    }

    public String getValidator() {
        return validator;
    }

    public void setValidator(String validator) {
        this.validator = validator;
    }

}
