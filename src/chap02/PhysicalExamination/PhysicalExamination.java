package src.chap02.PhysicalExamination;

import java.util.Scanner;

public class PhysicalExamination {
    static final int VMAX = 21; //시력 분포(0.0에서 0.1 단위로 21개)

    static class PhyscData{
        String name;
        int height;
        double vision;

        //생성자

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값을 구하는 코드
    static double aveHeight(PhyscData[] data){
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i].height;
        }
        return sum/ data.length;
    }

    static void distVison(PhyscData[] data, int[] dist){
        int i = 0;

        dist[i]=0;
        for (i = 0; i < data.length; i++) {
            if(data[i].vision >= 0.0 && data[i].vision <= VMAX/10.0)
                dist[(int)(data[i].vision*10)]++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("박현규",162,0.3),
                new PhyscData("함진아",173,0.7),
                new PhyscData("최윤미", 175,2.0),
                new PhyscData("홍연의",171,1.5),
                new PhyscData("이수진",168,0.4),
                new PhyscData("김영준",174,1.2),
                new PhyscData("박용규", 169,0.8)
        };
        int[] vdist = new int[VMAX];

        System.out.println("신체검사 리스트");
        System.out.println("이름      키    시력" );
        System.out.println("-------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name,x[i].height,x[i].vision);
        }
        System.out.printf("평균 키: %5.1fcm", aveHeight(x));

        distVison(x,vdist);

        System.out.println("\n시력분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~: %2d명\n", i/ 10.0,vdist[i]);
        }
    }
}
