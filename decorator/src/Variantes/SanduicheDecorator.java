package Variantes;

import src.Pao.IPao;
import src.Presunto.IPresunto;
import src.Queijo.IQueijo;

public abstract class SanduicheDecorator implements SanduicheIngredientsFactory {
    protected SanduicheIngredientsFactory si;

    public SanduicheDecorator(SanduicheIngredientsFactory si){
        this.si = si;
    }

    IQueijo criarQueijo(){
        return si.criarQueijo();
    }
    IPresunto criarPresunto(){
        return si.criarPresunto();
    }
}
