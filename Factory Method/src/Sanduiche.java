public abstract class Sanduiche {
    private String pao;
    private String queijo;
    private String presunto;
    private String salada;

    public void setIngredientes(String pao, String queijo, String presunto, String salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
    }

    @Override
    public String toString() {
        return String.format("Sanduíche com duas fatias de pão %s, uma fatia de queijo %s, uma fatia de presunto %s e salada %s.", pao, queijo, presunto, salada);
    }
}
