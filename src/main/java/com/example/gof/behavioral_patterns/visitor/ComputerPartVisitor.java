package com.example.gof.behavioral_patterns.visitor;

import com.example.gof.behavioral_patterns.visitor.computer_part.Computer;
import com.example.gof.behavioral_patterns.visitor.computer_part.Keyboard;
import com.example.gof.behavioral_patterns.visitor.computer_part.Monitor;
import com.example.gof.behavioral_patterns.visitor.computer_part.Mouse;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
