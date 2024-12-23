package com.shafiqistaken.xql;

import picocli.CommandLine;

import com.shafiqistaken.xql.cli.XqlCli;

public class App {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new XqlCli()).execute(args);
        System.exit(exitCode);
    }
}