package com.example.gof.structural_patterns.bridge;

public class Abstraction {
    Bridge bridge;

    public Abstraction(Bridge Implementation) {
        bridge = Implementation;
    }

    public String Operation() {
        return "Abstraction <> " + bridge.OperationImp();
    }
}
