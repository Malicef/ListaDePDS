import Pao.IPao;
import Presunto.IPresunto;
import Queijo.IQueijo;
import Salada.ISalada;

import Queijo.Mussarela;
import Pao.Frances;
import Presunto.Frango;
import Salada.ComSalada;

public class SanduichesIngredientFactoryJp implements SanduicheIngredientsFactory {
    public IPao criarPao(){
        return new Frances();
    }

    public IQueijo criarQueijo(){
        return new Mussarela();
    }

    public IPresunto criarPresunto(){
        return new Frango();
    }

    public ISalada criarSalada(){
        return new ComSalada();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ingredientes do sanduíche: Pão: " + criarPao().getIngrediente() + ", Queijo: " + criarQueijo().getIngrediente() + ", Presunto: " + criarPresunto().getIngrediente() + ", Salada: " + criarSalada().getIngrediente();
    }
}
