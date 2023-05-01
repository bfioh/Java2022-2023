package lr5;

public class example_1 {

    private char private_field;

    public void set(char prosto){
        private_field = prosto;
    }

    public int getCode(){
        int Code_symbol = (int) private_field;
        return Code_symbol;
    }

    public void info () {
        System.out.print("Символ: " + private_field +"; Код символа: "+getCode());
    }

    public static void main(String[] args) {
        example_1 example_1 = new example_1();
        example_1.set('з');
        example_1.info();
    }
}
