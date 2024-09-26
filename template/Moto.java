public class Moto extends Fabrica {

    public Moto(){
        super();
    }

    @Override
    public void montar(){
        System.out.println("Adicionando 2 rodas");
    }
}
