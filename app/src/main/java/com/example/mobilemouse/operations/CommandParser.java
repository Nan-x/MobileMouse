package com.example.mobilemouse.operations;

import com.google.gson.Gson;

public class CommandParser {

    public static String parseCommand(OperationData operation) {
        Gson gson = new Gson();
        return gson.toJson(operation, OperationData.class);
    }
}