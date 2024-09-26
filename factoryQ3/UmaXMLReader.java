import java.io.InputStream;
import java.io.IOException;
import org.xml.sax.*;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class UmaXMLReader implements XMLReader {
    private org.xml.sax.XMLReader saxReader;
    private ContentHandler handler;

    public UmaXMLReader() throws SAXException {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxReader = saxParser.getXMLReader();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setContentHandler(ContentHandler handler) {
        this.handler = handler;
        saxReader.setContentHandler(handler);
    }

    @Override
    public void parse(InputStream is) throws IOException, SAXException {
        System.out.println("UmaXMLReader: Leitura do documento XML iniciada.");
        saxReader.parse(new InputSource(is));
        System.out.println("UmaXMLReader: Leitura do documento XML concluída.");
    }
}
