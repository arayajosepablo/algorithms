package com.jpac.algorithms;

public class FindMaxElementInUnimodalArray {

  public static void main(String[] args) {
    final int increasingAndDecreasing[] = {2, 3, 4, 21, 43, 52, 51, 18, 11, 9, 6, 1};
    final int increasing[] = {2, 3, 4, 21, 43, 52, 67, 101, 211};
    final int decreasing[] = {73, 52, 51, 18, 11, 9, 6, 1};

    System.out.println("Increasing and decreasing unimodal array: " + find(increasingAndDecreasing));
    System.out.println("Increasing unimodal array: " + find(increasing));
    System.out.println("Decreasing unimodal array: " + find(decreasing));

  }

  public static int find(final int[] array) {
    int left = 0;
    int right = array.length-1;
    int midPosition;

    while (left < right) {
      midPosition = (left + right) / 2;
      if (array[midPosition] < array[midPosition + 1]) {
        left = midPosition + 1; // the biggest element is from (midPosition + 1) to R
      } else if (array[midPosition] > array[midPosition + 1]) {
        right = midPosition; // the biggest element is from left to midPosition
      }
    }

    return array[left];
  }

}
