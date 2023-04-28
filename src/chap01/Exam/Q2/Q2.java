package src.chap01.Exam.Q2;

import java.util.Scanner;

public class Q2 {
    static int min3(int a, int b, int c){
        int min = a;
        if (b<min)
            min = b;
        if (c < min)
            min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b, c;

        System.out.println("네 정수의 최소값을 구합니다.");
        System.out.print("a의 값 : ");  a = stdIn.nextInt();
        System.out.print("b의 값 : ");  b = stdIn.nextInt();
        System.out.print("c의 값 : ");  c = stdIn.nextInt();


        int min = min3(a, b, c);		// a, b, c, d의 최댓값

        System.out.println("최소값은 " + min + "입니다.");
    }



}
