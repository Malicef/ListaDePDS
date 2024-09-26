import org.xml.sax.SAXException;

public class OutraXMLReaderFactory extends XMLReaderFactory {
    @Override
    public XMLReader createXMLReader() throws SAXException {
        return new OutraXMLReader();
    }
}
