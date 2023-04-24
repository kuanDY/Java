package src.chap03.seqSearch;

import java.util.Scanner;

public class SeqSearchFor {
    static int SeqSearchFor(int[] a, int n, int key){
        for (int i = 0; i < n; i++) {
            if (a[i] == key)
                return i;  // 검색 성공!(인덱스를 반환)

        }
        return -1;           // 검색 실패!(-1을 반환)
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

        int idx = SeqSearchFor(x, num, ky); // 베열 x에서 키값이 ky인 요소를 검색

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        }else{
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }

}

