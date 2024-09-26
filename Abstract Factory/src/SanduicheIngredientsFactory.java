import Pao.IPao;
import Presunto.IPresunto;
import Queijo.IQueijo;
import Salada.ISalada;

interface SanduicheIngredientsFactory {
    IPao criarPao();
    IQueijo criarQueijo();
    IPresunto criarPresunto();
    ISalada criarSalada();
}