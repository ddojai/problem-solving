package leetcode.easy.pascalsTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<>();
    if (numRows == 0) {
      return list;
    }
    List<Integer> first = Collections.singletonList(1);
    list.add(first);
    if (numRows == 1) {
      return list;
    }
    List<Integer> second = Arrays.asList(1,1);
    list.add(second);
    if (numRows == 2) {
      return list;
    }

    addRow(list, second, numRows, 3);

    return list;
  }

  private void addRow(List<List<Integer>> list, List<Integer> prevRow, int numRows, int curr) {
    List<Integer> row = new ArrayList<>();
    for (int i = 0; i < curr; i++) {
      if (i == 0) {
        row.add(1);
      } else if (i == curr - 1) {
        row.add(1);
      } else {
        row.add(prevRow.get(i - 1) + prevRow.get(i));
      }
    }
    list.add(row);

    if (numRows == curr) {
      return;
    }

    addRow(list, row, numRows, curr + 1);
  }
}
