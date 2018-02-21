package com.akamai.csi.paralel3;

public class MyUnit {

    public String concatenate(String one, String two){
        return one + two;
    }
    public String[] getTheStringArray(String one, String two, String three) { return new String[] { one, two, three }; }
    public Boolean getTheBoolean() { return true; }
    public MyUnit getTheObject() { return this; }
    public MyUnit getTheSameObject() { return this; }
}