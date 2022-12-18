package lr4;

public class example_4 {
    public static void main(String[] args) {
        System.out.println("Прямоугольный треугольник:");
        char[][] triangle = new char[11][11];
        int a = 9;
        int b = 0;
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {

                if (j == 10) {
                    triangle[i][j] = '|';
                    System.out.print(triangle[i][j]);
                }

                else if (i == 10) {
                    triangle[i][j] = '_';
                    System.out.print(triangle[i][j]);
                }

                else if (j == a && i ==b ){
                    triangle[i][j] = '/';
                    System.out.print(triangle[i][j]);
                    a = a-1;
                    b = b+1;

                }
                else {
                    System.out.print(" ");
                }

            }

            System.out.println("");
        }
    }
}
