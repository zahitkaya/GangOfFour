package com.example.gof.behavioral_patterns.observer.observer_classes;

import com.example.gof.behavioral_patterns.observer.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

