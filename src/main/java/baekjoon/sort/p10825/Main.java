package baekjoon.sort.p10825;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Student> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().trim().split(" ");
            list.add(new Student(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3])));
        }
        br.close();

        Collections.sort(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Student student : list) {
            bw.write(student.getName() + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int kor;
    private int eng;
    private int math;

    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        if (kor != o.kor) {
            return o.kor - kor;
        } else {
            if (eng != o.eng) {
                return eng - o.eng;
            } else {
                if (math != o.math) {
                    return o.math - math;
                }
            }
        }
        return name.compareTo(o.name);
    }
}