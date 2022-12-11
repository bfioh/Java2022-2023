package lr3;

public class example_8 {

    public static void main(String[] args) {

        char [] mass = new char [10];
        char a='A';
        for (int i = 0; i < mass.length; ){
            if (a != 'A' && a!='E' && a!= 'I' && a!= 'O' && a!= 'U' && a!= 'Y' )
            {
                mass[i] = a;
                System.out.print(mass[i]);
                i++;
            }
            a++;
        }
    }
}
