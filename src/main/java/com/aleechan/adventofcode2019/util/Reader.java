package com.aleechan.adventofcode2019.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private Reader() {
    }

    public static List<String> readFile(String path) throws IOException {

        File f = new File(path);

        BufferedReader b = new BufferedReader(new FileReader(f));

        String readLine = "";

        List<String> lines = new ArrayList<>();
        while ((readLine = b.readLine()) != null) {
            lines.add(readLine);
        }
        return lines;
    }
}
