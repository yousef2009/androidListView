package com.example.listviewinterface.Model;

public class Country {
    private int id;
    private int ivFlag;
    private String tvName;
    private String tvPop;
    private String tvArea;

    public Country(int id, int ivFlag, String tvName, String tvPop, String tvArea) {
        this.id = id;
        this.ivFlag = ivFlag;
        this.tvName = tvName;
        this.tvPop = tvPop;
        this.tvArea = tvArea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIvFlag() {
        return ivFlag;
    }

    public void setIvFlag(int ivFlag) {
        this.ivFlag = ivFlag;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvPop() {
        return tvPop;
    }

    public void setTvPop(String tvPop) {
        this.tvPop = tvPop;
    }

    public String getTvArea() {
        return tvArea;
    }

    public void setTvArea(String tvArea) {
        this.tvArea = tvArea;
    }


}
