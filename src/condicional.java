public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.5;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2000) {
            System.out.println("Filme do século 21!");
        } else if (anoDeLancamento <= 1990) {
            System.out.println("Filme do século 20");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado para acesso");
        } else {
            System.out.println("Alugue por apenas R$ 9,99.");
        }
    }
}
