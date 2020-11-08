package com.example.gof.behavioral_patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }//Stateleri depolamak için

    public Memento get(int index){
        return mementoList.get(index);
    }
}

