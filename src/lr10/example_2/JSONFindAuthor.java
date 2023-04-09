package lr10.example_2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;

public class JSONFindAuthor {
    public static void main(String[] args) {

        System.out.println("Введите автора книги");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/example_2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            for (Object o : jsonArray) {
                    JSONObject book = (JSONObject) o;
                    if (str.equals(book.get("author"))){
                    System.out.println("\nТекущий элемент: book");
                    System.out.println("Название книги: " + book.get("title"));
                    System.out.println("Автор: " + book.get("author"));
                    System.out.println("Год издания: " + book.get("year"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
