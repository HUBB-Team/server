package com.hubb.manager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DevDependencies {
    @SerializedName("mocha")
    @Expose
    private String mocha;
    @SerializedName("prettyjson")
    @Expose
    private String prettyjson;
    @SerializedName("request")
    @Expose
    private String request;
    @SerializedName("supertest")
    @Expose
    private String supertest;
    @SerializedName("supervisor")
    @Expose
    private String supervisor;

    
//------------------------------------------------------------------------    
    @Override
    public String toString() {
        return "\n\u0009mocha: " + getMocha() + ", \n\u0009" + "prettyjson: " +getPrettyjson() + ", \n\u0009" + "request: "+ getRequest() + ", \n\u0009"
                + "supertest: " + getSupertest() + ", \n\u0009" + "supervisor: " +getSupervisor();
    }
//------------------------------------------------------------------------      
    
    
    public String getMocha() {
        return mocha;
    }

    public void setMocha(String mocha) {
        this.mocha = mocha;
    }

    public String getPrettyjson() {
        return prettyjson;
    }

    public void setPrettyjson(String prettyjson) {
        this.prettyjson = prettyjson;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getSupertest() {
        return supertest;
    }

    public void setSupertest(String supertest) {
        this.supertest = supertest;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

}
