package com.example.gof.structural_patterns.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractionTest {

    @Test
    void operation() {
        Bridge bridge=new ImplementationA();
        Abstraction abstraction=new Abstraction(bridge);
        System.out.println(abstraction.Operation());
        bridge=new ImplementationB();
        abstraction=new Abstraction(bridge);
        System.out.println(abstraction.Operation());
    }
}

/*
NE ZAMAN BRIDGE TASARIM DESENİ KULLANMALIYIM ?

  *  İmplementasyonları clienttan tamamen ayırmak istiyorsanız…
  *  İmplementasyonları direkt olarak clientla iletişime geçen abstractiona bağlamak istemiyorsanız…
  *  Abstraction classını rebuild dahi etmeden implementasyonlar içerisinde değişiklik yapmak istiyorsanız…
 */