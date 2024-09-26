import java.io.InputStream;
import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.ContentHandler;

public interface XMLReader {
    void setContentHandler(ContentHandler handler);
    void parse(InputStream is) throws IOException, SAXException;
}
