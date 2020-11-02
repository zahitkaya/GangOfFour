package com.example.gof.creational_patterns.prototype_pattern;

import com.example.gof.creational_patterns.prototype_pattern.guru.DocumentPrototypeManager;
import com.example.gof.creational_patterns.prototype_pattern.guru.PrototypeCapableDocument;
import org.junit.jupiter.api.Test;

class DocumentPrototypeManagerTest {

    @Test
    void getClonedDocument() {
        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);
        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);

    }
}