package курсовая;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;


public class Parser {

    private static Document doc;

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        parser.getCourceCurrency("F://Парсинг валют.xls");
    }


    private void getCourceCurrency(String File) throws IOException {

        try {
            doc = Jsoup.connect("https://www.cbr.ru/currency_base/daily/")
                    .userAgent("Chrome/4.0.249.0 Safari/532.5")
                    .referrer("http://www.google.com")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements allTables = doc.getElementsByTag("tbody");
        Element table1 = allTables.get(0);
        Elements table2 = table1.children();

        String str = new String(String.valueOf(table2));
        str = str.replaceAll("<tr>", "");
        str = str.replaceAll("</tr>", "");
        str = str.replaceAll("<td>", "");
        str = str.replaceAll("</td>", "");
        str = str.replaceAll("<th>", "");
        str = str.replaceAll("</th>", "");

        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet();
        String[] words = str.split("\n");
        for (int i = 1; i <= words.length;) {
            for (int k = 0; k < 44; ) {
                sheet.autoSizeColumn(k);
                Row row = sheet.createRow(k);
                for (int j = 0; j <= 4; ) {
                        Cell цифровойКод = row.createCell(j);
                    цифровойКод.setCellValue(words[i]);
                    j++;
                    i++;
                    Cell буквенныйКод = row.createCell(j);
                    буквенныйКод.setCellValue(words[i]);
                    j++;
                    i++;
                    Cell единиц = row.createCell(j);
                    единиц.setCellValue(words[i]);
                    j++;
                    i++;
                    Cell валюта = row.createCell(j);
                    валюта.setCellValue(words[i]);
                    j++;
                    i++;
                    Cell курс = row.createCell(j);
                    курс.setCellValue(words[i]);
                    i++;
                    i++;
                    i++;
                    k++;
                    j++;
                }
            }
        }
        book.write(new FileOutputStream(File));
        book.close();
        System.out.println("файл успешно создан в: "+"F://Парсинг валют.xls");

        new SendMessage(File);
    }
}
