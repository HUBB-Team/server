//3.2.16 18:49 v0.3
package com.hubb.credentials;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NameEmailCredential {
    @SerializedName("name")
    @Expose
    private String name;
    
    @SerializedName("email")
    @Expose
    private String email;

    public NameEmailCredential(){
        this.name = "";
        this.email = "";
    }
    
//------------------------------------------------------------------------------------    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name= ").append(getName()).append("\n");
        sb.append("Email= ").append(getEmail()).append("\n");
        return sb.toString();
    }
//------------------------------------------------------------------------------------
    
    public String getName() {
        return name;
    }

    public void setName(String inName) {
        this.name = inName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String inEmail) {
        this.email = inEmail;
    }
}
