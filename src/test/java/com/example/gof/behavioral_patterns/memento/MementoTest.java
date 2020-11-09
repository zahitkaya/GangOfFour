package com.example.gof.behavioral_patterns.memento;

import org.junit.jupiter.api.Test;

class MementoTest {

    @Test
    void getState() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento()); //State 2 mementoya atıldı

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());//State 3 mementoya atıldı

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState()); //State 4

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());//State 2 döner
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());//State 3 döner.
    }

}
