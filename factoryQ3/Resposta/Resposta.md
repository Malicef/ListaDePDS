### 3. Template Method:

#### a. Explique porque o código abaixo não implementa o Factory Method Pattern.
Modifique o código para que ele passe a implementar esse padrão.

public class XMLReaderFactory {<br>
// Esse método retorna uma instância de uma classe // que implementa a interface<br>
XMLReader.<br>
// A classe específica que ele cria e retorna<br>
// é baseada em uma propriedade do sistema. public static XMLReader<br>
createXMLReader();<br>
}<br>
public interface XMLReader {<br>
public void setContentHandler(ContentHandler handler):<br>
public void parse(InputStream is); }<br>

---

### Resposta:

3. O código não implementa o Factory Method Pattern, pois ele requer que a criação de objetos seja delegada as subclasses. 
No código da questão a criação dos objetos está sendo feita diretamente na classe XMLReaderFactory por meio de um método estático, 
portanto, não pode ser sobrecarregado ou alterado por outras subclasses. 
O objetivo do FactoryMethod é permitir que as subclasses possoam decidir qual classe concreta será instaciada.
