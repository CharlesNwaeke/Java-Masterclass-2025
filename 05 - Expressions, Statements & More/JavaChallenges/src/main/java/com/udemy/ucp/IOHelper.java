package com.udemy.ucp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IOHelper {
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    public IOHelper() {
        originalOut = System.out;
        resetStdOut();
    }

    public void resetStdOut() {
        if (outputStream != null) {
            System.setOut(originalOut);
        }
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    public String getOutput() {
        return outputStream.toString();
    }

    public void restore() {
        System.setOut(originalOut);
    }
}