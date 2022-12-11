package lr3;

public class example_7 {
    public static void main(String[] args) {
        char mass [] = new char[] {'a','c','e','g','i', 'k', 'm', 'o','q','s'};
        System.out.println("Массив в прямом порядке :");
        for (int i = 0; i < mass.length; i++ ){
            System.out.print(mass[i] + " ");
        }
        System.out.println("\n" +"Массив в обратном порядке: ");
        for (int i = mass.length-1; i >=0 ; i--){
            System.out.print(mass [i]+ " ");
        }
    }
}
