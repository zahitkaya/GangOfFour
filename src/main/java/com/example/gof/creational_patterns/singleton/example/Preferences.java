package com.example.gof.creational_patterns.singleton.example;

public class Preferences {
    // static değişkenimiz singleton class’ımızın instance’ı
    private static Preferences instance = null;
    protected Preferences() {
    }
    // synchronized anahtarını ekleyerek her thread’in bir sonrakini beklemesini sağladık , aynı anda 2 thread bu methodu kullanamaz.
    private synchronized static void createInstance() {
        if (instance == null)
            instance = new Preferences();
    }
    public static Preferences getInstance() {
        if (instance == null)
            createInstance();
        return instance;
    }
    public void helloSingleton() {
        System.out.println("Hello i'm a singleton");
    }
}
