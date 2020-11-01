package com.example.gof.structural_patterns.adapter_pattern.adaptee;

public class CsvFormatter implements CsvFormattable{
    @Override
    public String formatCsvText(String text){
        String formattedText=text.replace(".",",");
        return formattedText;
    }
}