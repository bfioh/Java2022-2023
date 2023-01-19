package lr8;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\1.txt")));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\2.txt")));
            String s;

            int lineCount = 0;
            List<String> arrayList;
            while ((s = br.readLine()) != null) {
                int wordCount = 0;
                lineCount++;
                arrayList = Arrays.asList(s.split("[ ,:;-]"));
                for (String str : arrayList) {
                    boolean test = str.matches("^(?ui:[аеёиоуыэюя]).*");
                    if (!test) {

                        bw.write(str + ": в строке номер - " + lineCount + "\n");
                        wordCount++;
                    }

                }
                bw.write("В " + lineCount + " строке находится: " + wordCount + " cлов на согласную \n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            System.out.println("Ошибка!");
        }
    }
}
