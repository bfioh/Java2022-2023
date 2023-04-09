package lr10.example_3;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Node;

import java.io.FileWriter;
import java.io.IOException;
import java.net.http.HttpConnectTimeoutException;
import java.util.List;

public class NewsParser {
    public static void main(String[] args) {

        //куда всё записываем
        String filePath = "src/lr10/example_3/UrfuNews.txt";

        try {
            //получаем хтмл код страницы
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            //извлекаем список новостей
            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");

            // выводим последние 10 новостей и записываем их
            try (FileWriter fileWriter = new FileWriter(filePath)) {
                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        fileWriter.append("Тема: " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blocktitle")
                                        .get(0).childNodes().get(0) + " ");

                        fileWriter.append("Дата: " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blockdate")
                                        .get(0).childNodes().get(0) + "\n");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (HttpStatusException e) {
            System.out.println("Страница не существует");
        } catch (HttpConnectTimeoutException e) {
            System.out.println("Страница не отвечает");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
