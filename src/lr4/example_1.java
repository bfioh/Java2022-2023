package lr4;

public class example_1 {
    public static void main(String[] args) {

        char [] [] rectangle = new char [11][23];

        for (int i = 0; i< rectangle.length; i++){
            for (int j = 0; j< rectangle[i].length; j++){

                if (j==0 | j==22) {
                    rectangle[i][j] = '|';
                    System.out.print(rectangle[i][j]);
                }
                else if (i==0 | i==10) {rectangle [i][j] = '-'; System.out.print(rectangle[i][j]); }
                else {System.out.print(" ");}
            }
            System.out.println("");
        }
    }
}
