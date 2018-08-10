package datastructure.ch09;

public class SimpleHeap {
    private static final int HEAP_LEN = 100;

    int numOfData;
    private HeapElem[] heapArr;

    SimpleHeap() {
        heapArr = new HeapElem[HEAP_LEN];
        numOfData = 0;
    }

    // 힙이 비었는지 확인
    boolean isEmpty() {
        return numOfData == 0;
    }

    // 부모 노드의 인덱스 값 반환
    int getParentIdx(int idx) {
        return idx / 2;
    }

    // 왼쪽 자식 노드의 인덱스 값 반환
    int getLChildIdx(int idx) {
        return idx * 2;
    }

    // 오른쪽 자식 노드의 인덱스 값 반환
    int getRChildIdx(int idx) {
        return getLChildIdx(idx) + 1;
    }

}

class HeapElem {
    int priority;   // 값이 작을수록 높은 우선순위
    char data;
}