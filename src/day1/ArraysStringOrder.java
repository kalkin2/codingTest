package day1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysStringOrder {

    /**
     * 문제: 문자열로 구성된 리스트 strings와 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순으로 정렬하세요. 예를 들어, strings = ["sun", "bed", "car"], n = 1인 경우 ["car", "bed", "sun"]을 반환합니다.
     * 예시 입력: strings = ["sun", "bed", "car"], n = 1
     * 예시 출력: ["car", "bed", "sun"]
     */
    public static void main(String[] args) {
        List<String > list = List.of("sun", "bed", "car");
        int index  = 2;


        List<String> collect = list.stream()
                .sorted(Comparator.comparing(s -> s.substring(index)))
                .collect(Collectors.toList());

        System.out.printf("collect"+collect);
    }

    //다른사람답안?
//        public static void main(String[] args) {
//            String[] strings = {"sun", "bed", "car"};
//            int n = 2;
//            Arrays.sort(strings, new Comparator<String>() {
//                @Override
//                public int compare(String s1, String s2) {
//                    return Character.compare(s1.charAt(n), s2.charAt(n));
//                }
//            });
//            System.out.println(Arrays.toString(strings)); // 출력: [car, bed, sun]
//        }
}
