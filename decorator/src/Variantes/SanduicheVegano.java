
import src.Presunto.IPresunto;
import src.Queijo.IQueijo;

public class SanduicheVegano extends SanduicheDecorator{
    public SanduicheVegano(SanduicheIngredientsFactory si){
        super(si);
    }

     IQueijo criarQueijo(){
        system.out.println("retirando queijo");
        return si.criarQueijo();
    }
    IPresunto criarPresunto(){
        system.out.println("retirando presunto");
        return si.criarPresunto();
    }
}
