package lr4;

import java.util.Scanner;

public class example_8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String value = in.nextLine();
        System.out.println("Введите ключ для шифрования: ");
        int key = in.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        System.out.println("Текст после шифрования: ");
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + key;
            chars[i] = (char) ints[i];
            System.out.print(chars[i]);
        }

        System.out.println("\n"+"Выполнить обратное преобразование?(y/n)");
        String o = in.next();
        switch (o){
            case "y" -> System.out.println(value);
            case "n" -> System.out.println("До свидания!");
            default -> System.out.println("Введите корректный ответ!");

        }
    }
}
