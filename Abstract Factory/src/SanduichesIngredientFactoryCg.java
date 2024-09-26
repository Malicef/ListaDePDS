import Pao.IPao;
import Presunto.IPresunto;
import Queijo.IQueijo;
import Salada.ISalada;

import Queijo.Prato;
import Pao.Integral;
import Presunto.Frango;
import Salada.SemSalada;

public class SanduichesIngredientFactoryCg implements SanduicheIngredientsFactory {
    public IPao criarPao(){
        return new Integral();
    }

    public IQueijo criarQueijo(){
        return new Prato();
    }

    public IPresunto criarPresunto(){
        return new Frango();
    }

    public ISalada criarSalada(){
        return new SemSalada();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ingredientes do sanduíche: Pão: " + criarPao().getIngrediente() + ", Queijo: " + criarQueijo().getIngrediente() + ", Presunto: " + criarPresunto().getIngrediente() + ", Salada: " + criarSalada().getIngrediente();
    }
}
