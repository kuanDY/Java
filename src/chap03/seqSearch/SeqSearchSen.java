package src.chap03.seqSearch;

import java.util.Scanner;

public class SeqSearchSen {
    //요소의 수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
    static int seqSearchSen(int[] a, int n, int key){
        int i = 0;

        a[n] = key;     //검색할 값 key를 보초로a[n]에 대입합니다.

        while(true){            //배열 요소를 순서대로 검사합니다.
            if(a[i] == key)     //검색성공!
                break;
            i++;
        }
        return i == n ?-1: i;   //while문에 의한 반복인 완료되면 찾은 값이 배열의 원래 데이터인지 아니면 보초인지 판단 해야합니다.
                                // 변수 i 값이 n 이면 찾은 값이 보초이므로 검색 실패임을 나타내는 -1을 반환 해야합니다.
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소의 수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1]; //요소의 수 num + 1

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값: ");      //키 값을 검색
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);  //배열x에서 값이 ky인 요소를 검색

        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }else{
            System.out.println(ky+"은(는) x[" + idx + "] 에 있습니다.");
        }
    }
}
