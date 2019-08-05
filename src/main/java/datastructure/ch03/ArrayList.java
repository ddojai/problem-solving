package datastructure.ch03;

public class ArrayList {
    private static final int LENGTH = 100;

    private int[] arr;
    private int numOfData;
    private int curPosition;

    ArrayList() {
        arr = new int[LENGTH];
        numOfData = 0;
        curPosition = -1;
    }

    void insert(int data) {
        if (numOfData >= LENGTH) {
            System.out.println("저장이 불가능 합니다.");
        }
        arr[numOfData] = data;
        numOfData++;
    }

    int get()
    {
        return arr[curPosition];
    }

    boolean first() {
        if (numOfData == 0) {
            return false;
        }
        curPosition = 0;
        return true;
    }

    boolean next() {
        if (curPosition >= numOfData - 1) {
            return false;
        }

        curPosition++;
        return true;
    }

    int remove() {
        int rpos = curPosition;
        int num = numOfData;
        int temp = arr[rpos];

        for (int i = rpos; i < num - 1; i++) {
            arr[i] = arr[i+1];
        }
        numOfData--;
        curPosition--;
        return temp;
    }

    int count() {
        return numOfData;
    }
}
