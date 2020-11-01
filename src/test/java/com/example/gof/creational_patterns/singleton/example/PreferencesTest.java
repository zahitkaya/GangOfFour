package com.example.gof.creational_patterns.singleton.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreferencesTest {

    @Test
    void helloSingleton() {
        Preferences.getInstance().helloSingleton();
        MyPreferences.getInstance().helloSingleton();
    }
}