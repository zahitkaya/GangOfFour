package com.example.gof.behavioral_patterns.visitor.computer_part;

import com.example.gof.behavioral_patterns.visitor.ComputerPartDisplayVisitor;
import org.junit.jupiter.api.Test;

class ComputerPartTest {

    @Test
    void accept() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}