package com.example.gof.structural_patterns.adapter_pattern.csv_adapter;

import com.example.gof.structural_patterns.adapter_pattern.TextFormattable;
import com.example.gof.structural_patterns.adapter_pattern.adaptee.CsvFormattable;

public class CsvAdapterImpl implements TextFormattable {
    CsvFormattable csvFormatter;
    public CsvAdapterImpl(CsvFormattable csvFormatter){
        this.csvFormatter=csvFormatter;
    }
    @Override
    public String formatText(String text)
    {
        String formattedText=csvFormatter.formatCsvText(text);
        return formattedText;
    }
}
