package baekjoon.p9012;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 9012번 괄호
 * 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다.
 * 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다.
 * 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다.
 * 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다.
 * 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다.
 * 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다.
 * 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int count = Integer.parseInt(br.readLine());
            List<String> inputList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                inputList.add(br.readLine());
            }

            Deque<Character> stk = new ArrayDeque<>();
            for (String input : inputList) {
                boolean isVPS = true;
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (c == '(') {
                        stk.offerFirst(c);
                    } else {
                        // 닫는 기호일 때
                        if (stk.pollFirst() == null) {
                            // 남은 여는 기호가 없으면
                            isVPS = false;
                            break;
                        }
                    }
                }
                // 여는 기호가 남았으면
                if (!stk.isEmpty()) {
                    isVPS = false;
                }
                if (isVPS) {
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
                stk.clear();
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}