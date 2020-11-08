package com.example.gof.behavioral_patterns.visitor;

import com.example.gof.behavioral_patterns.visitor.computer_part.Computer;
import com.example.gof.behavioral_patterns.visitor.computer_part.Keyboard;
import com.example.gof.behavioral_patterns.visitor.computer_part.Monitor;
import com.example.gof.behavioral_patterns.visitor.computer_part.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
