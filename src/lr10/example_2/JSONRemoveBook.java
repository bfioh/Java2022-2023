package lr10.example_2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class JSONRemoveBook {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите название книги, которую требуется удалить: ");
        String title = in.nextLine();


        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/example_2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (title.equals(book.get("title"))) {
                    iterator.remove();
                }
            }

            try (FileWriter file = new FileWriter("src/lr10/example_2/example-json.json");) {
                file.write(jsonObject.toJSONString());
                System.out.println("Книга " +"'"+ title +"'"+ " успешно удалена!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}