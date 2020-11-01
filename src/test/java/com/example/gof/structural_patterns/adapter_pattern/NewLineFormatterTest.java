package com.example.gof.structural_patterns.adapter_pattern;

import com.example.gof.structural_patterns.adapter_pattern.adaptee.CsvFormattable;
import com.example.gof.structural_patterns.adapter_pattern.adaptee.CsvFormatter;
import com.example.gof.structural_patterns.adapter_pattern.csv_adapter.CsvAdapterImpl;
import org.junit.Test;
public class NewLineFormatterTest {
    @Test
    public void testFormatText() throws Exception {
        String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable newLineFormatter=new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);
        CsvFormattable csvFormatter=new CsvFormatter();
        TextFormattable csvAdapter=new CsvAdapterImpl(csvFormatter);
        String resultCsvString=csvAdapter.formatText(testString);
        System.out.println(resultCsvString);
    }
}