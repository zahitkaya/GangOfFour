package com.example.gof.creational_patterns.prototype_pattern.simple_example;

public class DatabasePrototype implements Cloneable {


    private String corporate;
    private String name;
    private int port;

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "DatabasePrototype{" +
                "corporate='" + corporate + '\'' +
                ", name='" + name + '\'' +
                ", port=" + port +
                '}';
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
