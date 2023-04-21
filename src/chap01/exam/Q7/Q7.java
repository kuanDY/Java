package src.chap01.exam.Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 7까지의 합을 구합니다.");
        System.out.println("n의 값:");
        int n =stdIn.nextInt();

        int sum = 0;
        String equation = "";

        for (int i = 0; i <= n ; i++) {
            sum += i;
            equation += i;
            if(i != n){
                equation += "+";
            }

        }
        System.out.println(equation + "=" + sum);

    }

}
