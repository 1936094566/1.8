package system;

public class TestClass {
    public static void main(String[] args) {
        OutClass.Inner inner1 = new OutClass.Inner();
        inner1.username = "1111";
        OutClass.Inner inner2 = new OutClass.Inner();
        inner2.username = "2222";
        System.out.println(inner1.username);
    }
}
