package com.hubb.manager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repository {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;

//------------------------------------------------------------------------    
    @Override
    public String toString() {
        return "\n\u0009type: " + getType() + ", \n\u0009" + "url: " + getUrl();
    }
//------------------------------------------------------------------------
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
