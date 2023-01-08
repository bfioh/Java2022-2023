package lr6;

public class Example_4 {
     static void GetDoubleFactorial_NoRecursion (int n){
        int x = 1;
        if (n % 2 == 0 | n % 2 == 1) {
            for (int i = n; i > 0; i = i - 2){

                x = x * i;

            }
            System.out.println(x);
        }
    }

    static int GetDoubleFactorial_WithRec (int n){
         int result = 1;
         if (n == 1 || n == 0) {
             return result;
         }
         result = n * GetDoubleFactorial_WithRec(n-2);
         return result;
    }

    public static void main(String[] args) {

        Example_4.GetDoubleFactorial_NoRecursion(5);
        Example_4.GetDoubleFactorial_NoRecursion(6);
        System.out.println(Example_4.GetDoubleFactorial_WithRec(5));
        System.out.println(Example_4.GetDoubleFactorial_WithRec(6));

    }
}
