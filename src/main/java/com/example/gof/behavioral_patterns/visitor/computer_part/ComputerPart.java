package com.example.gof.behavioral_patterns.visitor.computer_part;

import com.example.gof.behavioral_patterns.visitor.ComputerPartVisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}