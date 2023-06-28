package codility;

import java.util.Arrays;

/**
 * class Solution { public int[] solution(int[] A, int K); }
 *
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 *
 * For example, given
 *
 * A = [3, 8, 9, 7, 6] K = 3
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 *
 * [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7] [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9] [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 *
 * For another example, given
 *
 * A = [0, 0, 0] K = 1
 *
 * the function should return [0, 0, 0]
 *
 * Given
 *
 * A = [1, 2, 3, 4] K = 4
 *
 * the function should return [1, 2, 3, 4]
 *
 * Assume that:
 */
public class Reverse {

  public static void main(String[] args) {
    int[] arrayA = {3, 8, 9, 7, 6};
    int K = 3;
    int[] rotatedArray = rotateArray(arrayA, K);
    System.out.println(Arrays.toString(rotatedArray));
    // Output: [9, 7, 6, 3, 8]

//    int[] arrayB = {0, 0, 0};
//    K = 1;
//    rotatedArray = rotateArray(arrayB, K);
//    System.out.println(Arrays.toString(rotatedArray));
//    // Output: [0, 0, 0]
//
//    int[] arrayC = {1, 2, 3, 4};
//    K = 4;
//    rotatedArray = rotateArray(arrayC, K);
//    System.out.println(Arrays.toString(rotatedArray));


  }

  /**
   *
   * @param :배열
   * @param : 몇번째에서 돌릴건지 Index
   * @return
   */
  public static int[] rotateArray(int[] array, int startIdx) {
    int arrayLength = array.length;

    //배열이 1개일때 or index가 0일때, or 마지막 배열을 돌릴때
    if (arrayLength < 2 || startIdx == 0 || startIdx % arrayLength == 0) {
      return array;
    }

    int endIdx = startIdx % arrayLength;

    int[] rotated = new int[arrayLength];


    // 원본 array, 시작지점, 복사할 array, 복사할 array 시작지점, end idx
    System.arraycopy(array, arrayLength - endIdx, rotated, 0, endIdx);
    System.arraycopy(array, 0, rotated, endIdx, arrayLength - endIdx);

    return rotated;
  }


}
