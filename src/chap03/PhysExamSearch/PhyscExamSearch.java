package src.chap03.PhysExamSearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhyscExamSearch {
    // 신체검사 데이터를 정의합니다.
    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        //생성자

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        //문자열을 반환하는 메서드(정보 확인용)

        @Override
        public String toString() {
            return "PhysData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        //오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhyscData>HEIGHT_ORDER = new HeightOrder();

        private static class HeightOrder implements Comparator<PhyscData> {
            public int comapare(PhyscData d1, PhyscData d2){
                return (d1.height > d2.height) ? 1:
                        (d1.height < d2.height) ? -1: 0;
            }

            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x= {
                new PhyscData("이나영", 162,0.3),
                new PhyscData("유지훈", 168,0.4),
                new PhyscData("김한결", 171,0.8),
                new PhyscData("홍준기", 169,1.5),
                new PhyscData("전서현", 173,0.7),
                new PhyscData("이호연", 174,1.2),
                new PhyscData("이수민", 175,2.0)
        };


        System.out.println("몇 cm인 사람을 찾고 있나요?: ");
        int height =stdIn.nextInt();
        int idx = Arrays.binarySearch(
                x,
                new PhyscData("",height, 0.0),
                 PhyscData.HEIGHT_ORDER
        );

        if(idx< 0){
            System.out.println("요소가 없습니다.");
        }else {
            System.out.println("x[" +idx + "]에 있습니다.");
            System.out.println("찾은 데이터:" + x[idx]);
        }
    }

}
