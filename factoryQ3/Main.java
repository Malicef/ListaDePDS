import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.xml.sax.ContentHandler;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream arquivoXML1 = new FileInputStream("factoryQ3/XML/exemplo1.xml");

            System.out.println("\n\nUmaXMLReader:\n\n");
            XMLReaderFactory fabrica1 = new UmaXMLReaderFactory();
            XMLReader leitor1 = fabrica1.createXMLReader();
            ContentHandler handler1 = new CustomContentHandler();
            leitor1.setContentHandler(handler1);
            leitor1.parse(arquivoXML1);
            System.out.println("------------------------------");

            InputStream arquivoXML2 = new FileInputStream("factoryQ3/XML/exemplo1.xml");

            System.out.println("\n\nOutraXMLReader:\n\n");
            XMLReaderFactory fabrica2 = new OutraXMLReaderFactory();
            XMLReader leitor2 = fabrica2.createXMLReader();
            ContentHandler handler2 = new CustomContentHandler();
            leitor2.setContentHandler(handler2);
            leitor2.parse(arquivoXML2);
            System.out.println("------------------------------");

            InputStream arquivoXML3 = new FileInputStream("factoryQ3/XML/exemplo2.xml");

            System.out.println("\n\nUmaXMLReader:\n\n");
            XMLReaderFactory fabrica3 = new UmaXMLReaderFactory();
            XMLReader leitor3 = fabrica3.createXMLReader();
            ContentHandler handler3 = new CustomContentHandler();
            leitor3.setContentHandler(handler3);
            leitor3.parse(arquivoXML3);
            System.out.println("------------------------------");

            InputStream arquivoXML4 = new FileInputStream("factoryQ3/XML/exemplo2.xml");

            System.out.println("\n\nOutraXMLReader:\n\n");
            XMLReaderFactory fabrica4 = new OutraXMLReaderFactory();
            XMLReader leitor4 = fabrica4.createXMLReader();
            ContentHandler handler4 = new CustomContentHandler();
            leitor4.setContentHandler(handler4);
            leitor4.parse(arquivoXML4);
            System.out.println("------------------------------");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo XML não encontrado: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
