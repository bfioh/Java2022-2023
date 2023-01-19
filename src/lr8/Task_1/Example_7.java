package lr8.Task_1;

import java.io.*;

public class Example_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
// Создание файловых символьных потоков для чтения и записи br = new BufferedReader(new FileReader("E:\\MyFile1.txt"), 1024); out = new Buffered Writer(new FileWriter( "E:\\MyFile2.txt"));
            int lineCount = 0;
// счетчик строк
            String s;
// Переписывание информации из одного файла в другой while ((sbr.readLine()) != null) { System.out.println(lineCount + ": " + s); out.write(s);
            lineCount++;
            out.newLine(); // Переход на новую строку
        } catch (IOException e) {
            System.out.println("Oшибкa!!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
