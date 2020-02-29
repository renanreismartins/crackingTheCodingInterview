package stacksandqueues;

import java.util.HashMap;
import java.util.Map;

public class ThreeStackOneArray {

    private final int NUMBER_OF_STACKS = 3;
    private final int stackSize;
    private Integer[] values;

    private Map<Integer, Integer> stackUtilization;

    public ThreeStackOneArray(int stackSize) {
        this.stackSize = stackSize;
        values = new Integer[stackSize * NUMBER_OF_STACKS];

        stackUtilization = new HashMap<>();
        stackUtilization.put(0, 0);
        stackUtilization.put(1, 3);
        stackUtilization.put(2, 6);
    }

    public void push(int stackNum, int value) throws FullStackException {
        Integer position = stackUtilization.get(stackNum);

        if (position == null) {
            throw new FullStackException();
        }

        values[position] = value;
        stackUtilization.compute(stackNum, (key, oldValue) -> {
            Integer newPosition = oldValue + 1;

            return newPosition % stackSize == 0 ? null : newPosition;
        });
    }

    public int pop(int stackNum) throws EmptyStackException {
        Integer position = stackUtilization.get(stackNum);

        if (position == null || position == 0) {
            throw new EmptyStackException();
        }

        return 0;
    }

    public int peek(int stackNum) {
        return 0;
    }

    public boolean isEmpty(int stackNum) {
        return false;
    }

    public boolean isFull(int stackNum) {
        return false;
    }

    private int indexOfTop(int stackNum) {
        return 0;
    }

    // for testing purposes
    public Integer[] getValues() {
        return values;
    }
}
