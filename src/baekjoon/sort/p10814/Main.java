package baekjoon.sort.p10814;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().trim().split(" ");
            list.add(new Person(Integer.parseInt(split[0]), split[1]));
        }
        br.close();

        // object type TimSort(Stable Sorting)
        Collections.sort(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Person person : list) {
            bw.write(person.getAge() + " " + person.getName() + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class Person implements Comparable<Person> {
    private int age;
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}