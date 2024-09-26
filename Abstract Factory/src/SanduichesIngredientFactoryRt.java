import Pao.IPao;
import Presunto.IPresunto;
import Queijo.IQueijo;
import Salada.ISalada;

import Queijo.Cheddar;
import Pao.Bola;
import Presunto.Peru;
import Salada.SemSalada;

public class SanduichesIngredientFactoryRt implements SanduicheIngredientsFactory {
    public IPao criarPao(){
        return new Bola();
    }

    public IQueijo criarQueijo(){
        return new Cheddar();
    }

    public IPresunto criarPresunto(){
        return new Peru();
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
