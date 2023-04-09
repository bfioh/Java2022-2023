package lr10.example_1;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class XMLFindAuthorOrYear {
    public static void main(String[] args) {

        System.out.println("Введите автора или год издания книги");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        try {
            File inputFile = new File("src/lr10/example_1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("book");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String author = element.getElementsByTagName("author")
                            .item(0).getTextContent();
                    String year = element.getElementsByTagName("year")
                            .item(0).getTextContent();

                    if (author.equals(str) || year.equals(str))
                        System.out.println("Книги, попадающие под критерии: "
                                + element.getElementsByTagName("title").item(0)
                                .getTextContent());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
