import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
  public static void main(String[] args) {
    int numeroSecreto = new Random().nextInt(100);
    Scanner scan = new Scanner(System.in);
    int numeroDigitado = 0;

    if(numeroSecreto == 0){
      numeroSecreto = new Random().nextInt(100);
    }

    while (numeroSecreto != numeroDigitado) {
      System.out.println("Digite um número entre 1 e 100: ");
      int valor = scan.nextInt();
      numeroDigitado = valor;
    }

    System.out.println("Acertou mizeravi! Número sorteado: " + numeroSecreto +" Número digitado: " + numeroDigitado);
  }
}
