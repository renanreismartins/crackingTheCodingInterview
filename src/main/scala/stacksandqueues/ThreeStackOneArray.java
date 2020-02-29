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
        stackUtilization.put(1, 0);
        stackUtilization.put(2, 0);
    }

    public void push(int stackNum, int value) throws FullStackException {
        if (isFull(stackNum)) {
            throw new FullStackException();
        }

        Integer positionInsideStack = stackUtilization.get(stackNum);
        Integer positionInsideGeneralArray = (stackNum * stackSize) + positionInsideStack;
        values[positionInsideGeneralArray] = value;
        stackUtilization.compute(stackNum, (key, oldValue) -> oldValue + 1);
    }

    public int pop(int stackNum) throws EmptyStackException {
        if (isEmpty(stackNum)) {
            throw new EmptyStackException();
        }

        Integer positionInsideStack = stackUtilization.get(stackNum);
        Integer positionInsideGeneralArray = (stackNum * stackSize) + positionInsideStack - 1;

        Integer value = values[positionInsideGeneralArray];
        values[positionInsideGeneralArray] = null;

        stackUtilization.compute(stackNum, (key, oldValue) -> oldValue - 1);

        return value;
    }

    public int peek(int stackNum) throws EmptyStackException {
        if (isEmpty(stackNum)) {
            throw new EmptyStackException();
        }

        Integer positionInsideStack = stackUtilization.get(stackNum);
        Integer positionInsideGeneralArray = (stackNum * stackSize) + positionInsideStack - 1;

        return values[positionInsideGeneralArray];
    }

    public boolean isEmpty(int stackNum) {
        return stackUtilization.get(stackNum) == 0;
    }

    public boolean isFull(int stackNum) {
        return stackUtilization.get(stackNum) == stackSize;
    }

    public int indexOfTop(int stackNum) {
        Integer positionInsideStack = stackUtilization.get(stackNum);
        Integer positionInsideGeneralArray = (stackNum * stackSize) + positionInsideStack - 1;

        return positionInsideGeneralArray;
    }

    // for testing purposes
    public Integer[] getValues() {
        return values;
    }
}
