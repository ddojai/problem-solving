package leetcode.easy.pascalsTriangleII;

import java.util.*;

public class Solution {
  public List<Integer> getRow(int rowIndex) {
    if (rowIndex == 0)
      return new LinkedList<>(Collections.singletonList(1));

    List<Integer> prevRow = getRow(rowIndex - 1);
    List<Integer> currRow = new LinkedList<>(Collections.singletonList(1));

    for (int i = 0; i < prevRow.size() - 1; i++) {
      currRow.add(prevRow.get(i) + prevRow.get(i + 1));
    }
    currRow.add(1);

    return currRow;
  }
}
