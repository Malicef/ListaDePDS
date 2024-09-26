public class Main {
    public static void main(String[] args){
        Carro c = new Carro();
        Moto m = new Moto();

        c.montar();
        c.pintar();
        c.testar();

        m.montar();
        m.pintar();
        m.testar();
    }
}
