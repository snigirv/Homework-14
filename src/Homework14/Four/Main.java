package Homework14.Four;

public class Main {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String word1 = string.split(",")[0];
        String word2 = string.split(" ")[1];
        String word3 = string.split(" ")[2];
        String word4 = string.split(" ")[3];
        String word5 = string.split(" ")[4];
        int lenght1 = word1.length();
        int lenght2 = word2.length();
        int lenght3 = word3.length();
        int lenght4 = word4.length();
        int lenght5 = word5.length();
        boolean x=lenght1>lenght2&&lenght1>lenght3&&lenght1>lenght4&&lenght1>lenght5;
        System.out.println("Слово1 = "+word1+", "+"Длина этого слова = "+lenght1);
        System.out.println("Слово1 = "+word2+", "+"Длина этого слова = "+lenght2);
        System.out.println("Слово1 = "+word3+", "+"Длина этого слова = "+lenght3);
        System.out.println("Слово1 = "+word4+", "+"Длина этого слова = "+lenght4);
        System.out.println("Слово1 = "+word5+", "+"Длина этого слова = "+lenght5);
        System.out.println(x);
    }
}
