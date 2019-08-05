package datastructure.ch03;

public class ListMain {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.insert(11);
        arrayList.insert(11);
        arrayList.insert(22);
        arrayList.insert(22);
        arrayList.insert(33);

        System.out.printf("현재 데이터의 수: %d \n", arrayList.count());

        if (arrayList.first()) {
            System.out.printf("%d ", arrayList.get());

            while (arrayList.next()) {
                System.out.printf("%d ", arrayList.get());
            }
        }
        System.out.println();
        System.out.println();

        if (arrayList.first()) {
            if (arrayList.get() == 22) {
                arrayList.remove();
            }

            while (arrayList.next()) {
                if (arrayList.get() == 22) {
                    arrayList.remove();
                }
            }
        }

        System.out.printf("현재 데이터의 수: %d \n", arrayList.count());

        if (arrayList.first()) {
            System.out.printf("%d ", arrayList.get());

            while (arrayList.next()) {
                System.out.printf("%d ", arrayList.get());
            }
        }
        System.out.println();
        System.out.println();
    }
}
