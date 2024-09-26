public class main {
    public static void main(String[] args) {
        SanduicheIngredientsFactory factoryCG = new SanduichesIngredientFactoryCg();
        Cantina cantinaCG = new Cantina(factoryCG) {};

        SanduicheIngredientsFactory sanduicheFrangoCG = cantinaCG.pedirSanduiche("CG");
        System.out.println(sanduicheFrangoCG);

        SanduicheIngredientsFactory  sanduicheVegano = new SanduicheVegano(sanduicheFrangoCG);
        System.out.println(sanduicheVegano);

        SanduicheIngredientsFactory sanduicheFrangoJp = cantinaCG.pedirSanduiche("JP");
        System.out.println(sanduicheFrangoJp);

        SanduicheIngredientsFactory sanduicheFrangoRt = cantinaCG.pedirSanduiche("RT");
        System.out.println(sanduicheFrangoRt);
    }
}
