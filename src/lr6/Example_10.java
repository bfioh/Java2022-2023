package lr6;

public class Example_10 {
    static void GetMassMinAndMax(int... x) {
        int [] mass = new int [2];
        int min = mass[1], max = mass [0];
        min = 999999999;
        for (int i : x) {
            if (i > max) { max = i ; mass[0] = i;}
            if (i < min) { min = i ; mass[1] = i;}
        }
        System.out.print("Значение наибольшего из аргументов = " + mass[0]+ "\n" +
                "Значение наименьшего из аргументов " + mass[1]);
    }

    public static void main(String[] args) {
        GetMassMinAndMax(10,46879,4,7,5,1000035,23, -34567, -9, 35456);
    }
}
