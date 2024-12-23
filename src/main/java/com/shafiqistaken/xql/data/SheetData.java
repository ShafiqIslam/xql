package com.shafiqistaken.xql.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class SheetData {
    private List<String> headers = new ArrayList<>();
    private List<Map<String, String>> data = new ArrayList<>();

    public void addHeader(String name) {
        headers.add(name);
    }

    public void addRow(Function<Integer, String> fn) {
        Map<String, String> rowData = new HashMap<>();
        for (int j = 0; j < headers.size(); j++) {
            rowData.put(headers.get(j), fn.apply(j));
        }
        data.add(rowData);
    }

    public String[] getHeadersArray() {
        return headers.stream().toArray(String[]::new);
    }

    public String[][] getDataArray() {
        List<String[]> cells = new ArrayList<String[]>();

        for (Map<String, String> row : data) {
            List<String> rowData = new ArrayList<String>();
            for (String head: headers) {
                rowData.add(row.get(head));
            }

            cells.add(rowData.stream().toArray(String[]::new));
        }

        return cells.stream().toArray(String[][]::new);
    }
}
