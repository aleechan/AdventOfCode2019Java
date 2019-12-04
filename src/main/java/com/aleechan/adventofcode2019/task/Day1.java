package com.aleechan.adventofcode2019.task;

import com.aleechan.adventofcode2019.util.Reader;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class Day1 extends AbstractTask {
    private static final Logger LOGGER = Logger.getLogger(Day1.class);

    private final List<String> data;

    public Day1() throws IOException {
        this.data = Reader.readFile("src/main/resources/input/day_1.txt");
    }

    @Override
    protected void part1() {
        int total = data.stream().mapToInt(Integer::valueOf).map(mass -> (int) (Math.floor(mass / 3.d)) - 2).sum();
        LOGGER.info("The total mass is: " + total);
    }

    @Override
    protected void part2() {
        int total = data.stream().mapToInt(Integer::valueOf).map(this::calcFuel).sum();
        LOGGER.info("The total mass is: " + total);
    }

    private int calcFuel(int mass) {
        int fuel = (int)((Math.floor(mass / 3.d)));
        if(fuel <= 2){
            return 0;
        }
        fuel -= 2;
        return fuel + calcFuel(fuel);
    }
}
