package org.tasks.task9;

public class CountStairSteps {
    int cubeCount;

    public CountStairSteps(int cubeCount) {
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
