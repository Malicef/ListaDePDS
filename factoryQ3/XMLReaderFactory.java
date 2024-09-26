import org.xml.sax.SAXException;

public abstract class XMLReaderFactory {
    public abstract XMLReader createXMLReader() throws SAXException;
}
