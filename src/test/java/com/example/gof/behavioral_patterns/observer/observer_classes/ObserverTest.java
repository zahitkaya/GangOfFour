package com.example.gof.behavioral_patterns.observer.observer_classes;

import com.example.gof.behavioral_patterns.observer.Subject;
import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    void update() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

    }
}