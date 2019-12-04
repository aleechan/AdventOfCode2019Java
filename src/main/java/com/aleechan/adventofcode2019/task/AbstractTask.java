package com.aleechan.adventofcode2019.task;

public abstract class AbstractTask {

    public void run(String part) {
        if ("1".equals(part)) {
            part1();
        } else if ("2".equals(part)) {
            part2();
        }
    }

    protected abstract void part1();

    protected abstract void part2();


}
