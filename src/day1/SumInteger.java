package day1;

/**
* 문제: 두 정수 a와 b가 주어졌을 때, a부터 b까지의 합을 구하세요. 예를 들어, a = 1, b = 5인 경우 1 + 2 + 3 + 4 + 5 = 15이므로 15를 반환합니다.
예시 입력: a = 1, b = 5
예시 출력: 15
* */
public class SumInteger {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int result  = sumingInteger(a,b);
        System.out.println(result);
    }

    private static int sumingInteger(int a, int b) {
        int sum = 0;
        for (int x = a; x<= b; x++){
            sum += x;
        }
        return sum;
    }
}