public class Carro extends Fabrica {

    public Carro(){
        super();
    }

    @Override
    public void montar(){
        System.out.println("Adicionando 4 rodas");
    }
}
