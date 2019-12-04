package com.aleechan.adventofcode2019.task;

import com.aleechan.adventofcode2019.util.Processor;
import com.aleechan.adventofcode2019.util.Reader;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.aleechan.adventofcode2019.util.Processor.readFromString;
import static com.aleechan.adventofcode2019.util.Processor.runProgram;

public class Day2 extends AbstractTask {

    private static final Logger LOGGER = Logger.getLogger(Day2.class);

    private final List<String> data;

    public Day2() throws IOException {
        this.data = Reader.readFile("src/main/resources/input/day_2.txt");
    }

    @Override
    protected void part1() {
        int[] memory = readFromString(data.get(0));
        memory = runProgram(memory);
        LOGGER.info(Arrays.toString(memory));
        LOGGER.info("The result is " + memory[0]);
    }

    @Override
    protected void part2() {
        final int target = 19690720;
        int[] memory = readFromString(data.get(0));
        int[] mem = new int[]{0};
        for (int p1 = 0; mem[0] != target; p1++) {
            for (int p2 = 0; p2 < 99 && mem[0] != target; p2++) {
                mem = Arrays.copyOf(memory, memory.length);
                mem[1] = p1;
                mem[2] = p2;
                mem = Processor.runProgram(mem);
                LOGGER.info(String.format("P1: %d P2: %d Result: %d", p1, p2, mem[0]));
            }
        }
    }
}
