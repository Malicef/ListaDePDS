import org.xml.sax.SAXException;

public class UmaXMLReaderFactory extends XMLReaderFactory {
    @Override
    public XMLReader createXMLReader() throws SAXException {
        return new UmaXMLReader();
    }
}
