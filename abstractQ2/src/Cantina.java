
public abstract class Cantina {
    private SanduicheIngredientsFactory ingredientFactory;

    public Cantina(SanduicheIngredientsFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public SanduicheIngredientsFactory pedirSanduiche(String tipo) {
        if (tipo.equals("CG")) {
            return new SanduichesIngredientFactoryCg();
        } else if (tipo.equals("JP")) {
            return new SanduichesIngredientFactoryJp();
        } else if (tipo.equals("RT")) {
            return new SanduichesIngredientFactoryRt();
        } else {
            throw new IllegalArgumentException("Tipo de sanduíche desconhecido: " + tipo);
        }
    }
}
