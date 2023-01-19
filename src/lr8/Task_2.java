package lr8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        String file = "sc.nextLine()";
        File f1 = new File(file);
        f1.createNewFile();
        File f2 = new File("secFile");
        f2.createNewFile();
        try {
            Writer bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(f1), StandardCharsets.UTF_8));
            String s;
            for (int i = 0; i < 3; i++) {
                s = (i + 1) + "-ая строчка \n";
                bw.write(s);
            }
            Double[] doubles = new Double[]{23.456, 234.43434, -545.45, -987.4, 5.0};
            for (int i = 0; i < doubles.length; i++) {
                Double d = doubles[i];
                String q = d.toString() + " ";
                bw.write(q);
            }
            bw.flush();
            bw.close();
            br = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2)));
            for (int i = 0; i < 4; i++) {
                s = br.readLine();
                if (i == 1) {
                    writer.write(s + "\n");
                }
                if (i == 3) {

                    String[] items;
                    items = s.split(" ");

                    for (int j = 0; j < items.length; j++) {
                        System.out.println(Double.parseDouble(items[j]));
                        try {

                            if (Double.parseDouble(items[j]) > 0) {
                                double z = Double.parseDouble(items[j]);
                                String x = Double.toString(z) + " ";
                                writer.write(x);
                            }
                            writer.flush();
                        } catch (NumberFormatException nfe) {
                            System.out.println("Ошибка v arr");
                        }

                    }

                }
            }

        } catch (Exception e) {
            System.out.println("Ошибка !!!!!!!!");
        }

    }
}

