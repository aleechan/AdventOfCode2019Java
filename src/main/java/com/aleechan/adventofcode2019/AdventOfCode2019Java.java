package com.aleechan.adventofcode2019;

import com.aleechan.adventofcode2019.task.Day1;
import org.apache.log4j.Logger;

import java.io.IOException;

public class AdventOfCode2019Java {
    private static final Logger LOGGER = Logger.getLogger(AdventOfCode2019Java.class);

    public static void main(String[] args) throws IOException {
        String task = args[0];
        String part = args[1];

        Day1 day1 = new Day1();

        switch (task) {
            case "day1":
                day1.run(part);
                break;
            default:
                LOGGER.info(String.format("%s is not a valid job name", task));
        }
    }
}
