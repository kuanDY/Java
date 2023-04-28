package src.chap03.GenericClassTester;

public class GenericClassTester {
    //제네릭 클래스의 파라미터를 T라고 작성합니다.
    static class GenericClass<T>{
        private T xyz;
        GenericClass(T t){ //생성자
            this.xyz = t;
        }
        T getXyz(){
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
