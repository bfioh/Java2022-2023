package lr6;

public class Example_7 {

    static void GetCodeSymbols( char [] mass){
        int [] mass_int = new int [mass.length];
        System.out.println("Ссылка на целочиленный массив, " +
                "состоящий из кодов-символов из массива-аргумента:");
        for (int i = 0; i < mass_int.length; i++){
            mass_int[i] = (int) mass[i];
            System.out.print(mass_int[i]+", ");
        }
    }

    public static void main(String[] args) {
        char [] mass = {'g', '0', 's', 'ф', 'а', '4'};
        GetCodeSymbols(mass);
    }
}
