package lr6;

public class Example_9 {

    static void Get(char [] mass){
        System.out.println("\n Массив после перестановки: ");
        for (int i = 0, j = mass.length-1; i < mass.length/2; i++, j--) {
                char start = mass[i];
                mass[i] = mass[j];
                mass[j] = start;
        }
        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }

    }

    public static void main(String[] args) {
        char [] ggwp = {'a', 'b', 'c', 'd', '5'} ;
        Get(ggwp);
    }
}
