package src.chap03.seqSearch;

import java.util.Scanner;

public class seqSearch {
    // 선형 검색
    static int seqSearch(int[] a, int n, int key){
        int i = 0;

        while(true){
            if(i == n)
                return -1;
            if(a[i] == key)
                return i;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소의 수:");
        int num =stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값:"); // 키 값을 입력
        int ky =stdIn.nextInt();

        int idx = seqSearch(x, num, ky); // 베열 x에서 키값이 ky인 요소를 검색

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        }else{
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }

}
