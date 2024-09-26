import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CustomContentHandler extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        System.out.println("Documento XML iniciado.");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Documento XML finalizado.");
    }

    @Override
    public void startElement(String uri, String nomeLocal, String nomeElemento, Attributes atributos) throws SAXException {
        System.out.println("Início do elemento: " + nomeElemento);
        for (int i = 0; i < atributos.getLength(); i++) {
            System.out.println("Atributo: " + atributos.getQName(i) + " = " + atributos.getValue(i));
        }
    }

    @Override
    public void endElement(String uri, String nomeLocal, String nomeElemento) throws SAXException {
        System.out.println("Fim do elemento: " + nomeElemento);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String content = new String(ch, start, length).trim();
        if (!content.isEmpty()) {
            System.out.println("Conteúdo: " + content);
        }
    }
}
