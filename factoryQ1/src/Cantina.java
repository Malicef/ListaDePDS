public class Cantina {
    public static void main(String[] args) throws Exception {
        Sanduiche lanche = new LanchoneteRt();
        System.out.println(lanche);

        Sanduiche lanche2 = new LanchoneteJp();
        System.out.println(lanche2);

        Sanduiche lanche3 = new LanchoneteCg();
        System.out.println(lanche3);
    }
}
