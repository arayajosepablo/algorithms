package com.jpac.algorithms;

import java.util.Arrays;

public class SumElementsOfArray {

  public static void main(String[] args) {
    final SumElementsOfArray sumElementsOfArray = new SumElementsOfArray();

    final int t[] = {3, 2, 7, 4, 5, 2, 8, 1, 3, 2, 6};
    final int k = 7;

    final int r[] = sumElementsOfArray.sumElementsOfArray(t, k);

    System.out.println(Arrays.toString(t));
    System.out.println(Arrays.toString(r));

  }

  public int[] sumElementsOfArray(final int[] arrayT, final int k) {
    final int arrayR[] = new int[arrayT.length];

    int activeRPosition = 0;
    arrayR[activeRPosition] = arrayT[activeRPosition];

    for (int i = 1; i < arrayT.length; i++) {
      if (arrayR[activeRPosition] + arrayT[i] <= k) {
        arrayR[activeRPosition] = arrayR[activeRPosition] + arrayT[i];
      } else {
        activeRPosition++;
        arrayR[activeRPosition] = arrayT[i];
      }
    }

    return arrayR;
  }

}
