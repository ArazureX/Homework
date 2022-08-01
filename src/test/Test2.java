package test;

import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        String str = null;
        String str1 = "   ";
        System.out.println(str1.equals(str));
        System.out.println(Objects.isNull(str));
        System.out.println(Objects.equals(str,str1));
    }
}
