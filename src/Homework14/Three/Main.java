package Homework14.Three;

public class Main {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0,35);
        String string3 = string2+" it is perfect";
        int x = string1.length();
        int y = string2.length();
        int z = string3.length();
        System.out.println(string1+" - "+x);
        System.out.println(string2+" - "+y);
        System.out.println(string3+" - "+z);
    }
}
