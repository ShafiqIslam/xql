package com.shafiqistaken.xql.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Callable;

import org.apache.commons.lang3.StringUtils;

import com.shafiqistaken.xql.data.SheetData;
import com.shafiqistaken.xql.evaluator.Evaluator;
import com.shafiqistaken.xql.excel.ExcelReader;

@Command(name = "xql", version = "1.0", mixinStandardHelpOptions = true,
         description = "Command line interface to query excel files.")
public class XqlCli implements Callable<Integer> {

    @Parameters(index = "0", description = "The file to load.")
    private File file;

    @Override
    public Integer call() throws IOException {
        SheetData data = ExcelReader.load(file);

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("> ");
            String expression = scanner.nextLine();
            expression = StringUtils.stripEnd(expression.trim(), ";").trim();

            if (expression.equalsIgnoreCase("exit")) {
                break;
            }

            SheetData output = Evaluator.eval(data, expression);
            // TabularOutput.show(output);
        }

        scanner.close();
        return 0;
    }
}