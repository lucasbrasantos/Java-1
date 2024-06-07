package module2.lesson4;

public class OtherStringMethods {


    public static void main(String[] args) {
        
        String funnyStr = "Computer!Science,!long!walks!on!the!beach";
        int a = funnyStr.indexOf(33);
        int b = funnyStr.indexOf('!'); //chars are converted to Unicode int value
        int c = funnyStr.indexOf("!");
        int d = funnyStr.indexOf("!Science");
        int e = funnyStr.indexOf("!Science,!long");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(funnyStr.indexOf("C")); // PRIMEIRA POSICAO
        System.out.println(funnyStr.indexOf("c")); // DECIMA PRIMEIRA POSICAO, indexOf("c") = 10, porque é <11-1>

    }
}
