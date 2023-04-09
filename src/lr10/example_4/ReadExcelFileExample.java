package lr10.example_4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NoSuchFileException;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        try {
            //открываем файл эксель для чтения
            String filePath = "src/lr10/example_4/example.xlsx";
            FileInputStream inputStream = new FileInputStream(filePath);

            //создаём экземпляр книги эксель из файла
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            //получаем лист из книги по его имени
            XSSFSheet sheet = workbook.getSheet("Товары");

            //перебираем строки и ячейки листа
            for (Row row : sheet) {
                for (Cell cell : row) {
                    //выводим значения ячейки на экран
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            //Закрываем файл и освобождаем ресуры
            workbook.close();
            inputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден!");
        } catch (FileAlreadyExistsException e){
            System.out.println("Такой файл или каталог уже существует!");
        } catch (NoSuchFileException e){
            System.out.println("Файла не существует!");
        }
    }
}
