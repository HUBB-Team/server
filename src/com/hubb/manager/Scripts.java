package com.hubb.manager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Scripts {
    @SerializedName("test")
    @Expose
    private String test;

//------------------------------------------------------------------------    
    @Override
    public String toString() {
        return getTest();
    }
//------------------------------------------------------------------------  
    
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }  
}
