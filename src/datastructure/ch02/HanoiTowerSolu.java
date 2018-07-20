package datastructure.ch02;

public class HanoiTowerSolu {
    public static void main(String[] args) {
        hanoiTowerMove(3, 'A', 'B', 'C');
    }

    private static void hanoiTowerMove(int num, char from, char by, char to) {
        if (num == 1) {
            System.out.printf("원반 1을 %c에서 %c로 이동 \n", from, to);
        } else {
            hanoiTowerMove(num - 1, from, to, by);
            System.out.printf("원반 %d을(를) %c에서 %c로 이동 \n", num, from, to);
            hanoiTowerMove(num - 1, by, from, to);
        }
    }
}
