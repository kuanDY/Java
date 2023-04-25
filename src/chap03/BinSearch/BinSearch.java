package src.chap03.BinSearch;

import java.util.Scanner;

// 이진검색
public class BinSearch {
    //요소의 수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
    static int binSearch(int[] a, int n, int key){
        int pl = 0;             //검색 범위의 첫 인덱스
        int pr = n - 1;         //검색 범위의 끝 인덱스

        do{
            int pc = (pl + pr) / 2; //중앙 요소의 인덱스
            if(a[pc] == key) {
                return pc;

            }else if (a[pc] < key){
                pl = pc +1;
            } else {
                pr = pc -1;
            }
    }while (pl <= pr);
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소의 수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num]; //요소의 수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.println("x[0]: "); //첫 요소 입력
        x[0] = stdIn.nextInt();

        for (int i = 0; i < num; i++) {
            do{
                System.out.println("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            }while(x[i] < x[i-1]);      //바로 앞의 요소보다 작으면 다시 입력
        }
        System.out.println("검색할 값:");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, num, ky);    //배열 x에서 키 값이 ky인 요소를 검색

        if (idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky +"은(는) x[" + idx + "] 에 있습니다.");
        }
    }
}
