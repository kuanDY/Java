package src.chap03.BinSearch;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //Java에서 사용하는 키워드 입니다.
        String [] x={
                "abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else",
                "enum", "extends", "final" , "finally", "float",
                "for", "goto", "if", "implements", "import",
                "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws",
                "transient", "try", "void", "volatile", "while"
        };
        System.out.println("원하는 키워드를 입력하세요: "); //키 값을 입력

        String ky = stdIn.next();

        int idx = Arrays.binarySearch(x,ky);

        if (idx<0){
            System.out.println("해당 키워드가 없습니다.");
        }else {
            System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");
        }
    }
}
