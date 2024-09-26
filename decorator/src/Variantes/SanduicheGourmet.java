
import src.Presunto.IPresunto;
import src.Queijo.IQueijo;

public class SanduicheGourmet extends SanduicheDecorator{
    public SanduicheGourmet(SanduicheIngredientsFactory si){
        super(si);
    }

     IQueijo criarQueijo(){
        system.out.println("Substituindo queijo");
        return si.criarQueijo();
    }
    IPresunto criarPresunto(){
        system.out.println("Substituindo presunto");
        return si.criarPresunto();
    }
}