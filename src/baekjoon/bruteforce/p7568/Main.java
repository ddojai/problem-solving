package baekjoon.bruteforce.p7568;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/7568
 */
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Person person = new Person(x, y);
            list.add(person);
        }

        for (int i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            int rank = 1;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                Person comparePerson = list.get(j);

                if (person.getWeight() < comparePerson.getWeight()
                        && person.getHeight() < comparePerson.getHeight()) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}

class Person {
    private int weight;
    private int height;

    Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}