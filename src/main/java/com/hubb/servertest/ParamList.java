package com.hubb.servertest;

import java.util.ArrayList;
import java.util.Arrays;

class ParamList {
    private String parName;
    private ArrayList<String> parVal;

    
    public ParamList(){
        this.parName = "-1";
        this.parVal = new ArrayList<>();
    }
    
    public ParamList(String name, String value){
        if(name == null){
            name = "-1";
        } 
        if(value == null){
            value = "-1";
        }
        this.parName = name;
        this.parVal.add(value);
    }
    
    public ParamList(String name, String[] values){
        if(name == null){
            name = "-1";
        }
        this.parName = name;
        if(values != null){
            this.parVal.addAll(Arrays.asList(values));
        }
    }
    
    public void addName(String name){
        if(name == null){
            name = "-1";
        }
        this.parName = name;
    }
    
    public void addValue(String value){
        if(value == null){
            value = "-1";
        }
        this.parVal.add(value);
    }
    
}
