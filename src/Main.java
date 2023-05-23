public class Main {
  public static void main(String[] args) {
    //Comentário de linha
    /*
      Comentário de block
    */

    String nomeAplicacao = "Esse é o Screen Match";
    String nomeDoFilme = "Filme: Eu sou a lenda.";

    int anoLancamento = 2002;
    //System.out.printf("Ano de lançamento: " + anoLancamento + ".");
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.1;
    double media = (9.0 + 8.5 + 10.0) / 3;
    String sinopse = "O ultimo homem na terra não está sozinho";


    String mensagem = """
            %s!!
            Nome do filme: %s;
            Ano do lançamento: %d;
            média: %.2f;
            sinopse: %s;
            Incluso no plano: %b.
            """.formatted(nomeAplicacao, nomeDoFilme, anoLancamento, media, sinopse, incluidoNoPlano);

    System.out.println(mensagem);

    double celcius = 21;
    int fahrenheit = (int) (celcius * 1.8) + 32;

    System.out.println("Temrepatura convertida e com conversão do tipo double para int: " + fahrenheit);
  }
}