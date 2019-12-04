package com.aleechan.adventofcode2019.util;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Processor {
    private static final Logger LOGGER = Logger.getLogger(Processor.class);

    private Processor() {
    }

    public static int[] readFromString(String data){
        return Arrays.stream(data.split(",")).mapToInt(Integer::valueOf).toArray();
    }

    public static int[] runProgram(int[] memory) {
        try {
            int pc = 0;
            while (memory[pc] != 99) {
                //LOGGER.info(Arrays.toString(memory));
                int op = memory[pc];
                int a = memory[memory[pc + 1]];
                int b = memory[memory[pc + 2]];
                int out = memory[pc + 3];
                switch (op) {
                    case 1:
                        memory[out] = a + b;
                        break;
                    case 2:
                        memory[out] = a * b;
                        break;
                    default:
                        LOGGER.error(op + " is not an op code");
                        return new int[]{0};
                }
                pc += 4;
            }

            return memory;
        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
        return new int[]{0};
    }
}
