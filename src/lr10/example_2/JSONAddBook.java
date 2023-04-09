package lr10.example_2;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;


public class JSONAddBook {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите название книги");
        String title = in.nextLine();
        System.out.println("Введите автора");
        String author = in.nextLine();
        System.out.println("Введите год выпуска книги");
        int year = in.nextInt();

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/example_2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);

            try (FileWriter file = new FileWriter("src/lr10/example_2/example-json.json");) {
                file.write(jsonObject.toJSONString());
                System.out.println("Json файл успешно создан!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

