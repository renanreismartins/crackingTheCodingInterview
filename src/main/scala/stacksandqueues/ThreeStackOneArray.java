package stacksandqueues;

public class ThreeStackOneArray {

    private final int NUMBER_OF_STACKS = 3;
    private final int stackSize;
    private int[] values;

    public ThreeStackOneArray(int stackSize) {
        this.stackSize = stackSize;
        values = new int[stackSize * NUMBER_OF_STACKS];
    }

    public void push(int stackNum, int value) throws FullStackException {
        values[0] = 1;

    }

    public int pop(int stackNum) {
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
    public int[] getValues() {
        return values;
    }
}
