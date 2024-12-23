package com.shafiqistaken.xql.cli;

import com.github.freva.asciitable.AsciiTable;
import com.shafiqistaken.xql.data.SheetData;

public class TabularOutput {
    public static void show(SheetData data) {
        String out = AsciiTable.getTable(data.getHeadersArray(), data.getDataArray());
        System.out.println(out);
    }
}
