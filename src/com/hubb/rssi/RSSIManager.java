package com.hubb.rssi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class RSSIManager {

    @SerializedName("dev_0")
    @Expose
    private String dev0;
    @SerializedName("dev_1")
    @Expose
    private String dev1;
    @SerializedName("dev_2")
    @Expose
    private String dev2;
    @SerializedName("dev_3")
    @Expose
    private String dev3;
    @SerializedName("dev_4")
    @Expose
    private String dev4;
    @SerializedName("dev_5")
    @Expose
    private String dev5;

    public String getDev0() {
        return dev0;
    }

    public void setDev0(String dev0) {
        this.dev0 = dev0;
    }

    public String getDev1() {
        return dev1;
    }

    public void setDev1(String dev1) {
        this.dev1 = dev1;
    }

    public String getDev2() {
        return dev2;
    }

    public void setDev2(String dev2) {
        this.dev2 = dev2;
    }

    public String getDev3() {
        return dev3;
    }

    public void setDev3(String dev3) {
        this.dev3 = dev3;
    }

    public String getDev4() {
        return dev4;
    }

    public void setDev4(String dev4) {
        this.dev4 = dev4;
    }

    public String getDev5() {
        return dev5;
    }

    public void setDev5(String dev5) {
        this.dev5 = dev5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDev0() + ", ").append(getDev1() + ", ").append(getDev2() + ", ").append(getDev3() + ", ").append(getDev4() + ", ").append(getDev5());
        return sb.toString();
    }

}
