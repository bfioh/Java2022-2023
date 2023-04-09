package lr10.example_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class XMLDeleteElements {
    public static void main(String[] args) {
        System.out.println("Введите название книги, которую требуется удалить");
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
                    String title = element.getElementsByTagName("title")
                            .item(0).getTextContent();

                    if (title.equals(str)) {          // удаление
                        Node delNode = element.getParentNode();
                        delNode.removeChild(element);
                        System.out.println(element);
                    }
                }
                Transformer transformer =
                        TransformerFactory.newInstance().newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("src/lr10/example_1/example.xml"));
                transformer.transform(source, result);
            }


        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }
}
