package org.tasks.task9;

import org.tasks.exceptions.WrongCountOfCubesException;

public class CountStairSteps {
    int cubeCount;

    public CountStairSteps(int cubeCount) throws WrongCountOfCubesException {
        if (cubeCount < 0) {
            throw new WrongCountOfCubesException("Such a number of cubes cannot exist");
        }
        this.cubeCount = cubeCount;
    }

    public int count() {
        int count = 0;

        for (int step = 0; ; step++) {
            if (cubeCount - step >= step + 1) {
                count++;
                cubeCount -= step;
            } else {
                break;
            }
        }
        return count;
    }
}
