import java.util.Scanner;
public class Banco {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Bem vindo ao Banco ItsTimeIsCome! Digite seu nome completo para cadástro: ");
    String clientName = scan.nextLine();

    int accountType = 0;
    String accountTypetitle = "";
    double accountValues = 0.0;
    boolean exit = false;

    while (accountType != 1 && accountType != 2) {
      System.out.println("Digite 1 para conta corrente, 2 para conta universitária: ");
      int input = scan.nextInt();

      if(input == 1) {
        accountType = 1;
      } else if (input ==2) {
        accountType = 2;
      } else {
        System.out.println("Digite um valor válido!");
      }
    }

    if(accountType == 1) {
      accountTypetitle = "Corrente";
    } else {
      accountTypetitle = "Universitária";
    }

    while (!exit) {
      String message = """
            ************************************************************************
            ** Dados Iniciais do cliente:                                         **
                                                                                
            Nome:                    %s
            Tipo de conta:           %s
            Saldo inicial:           %.2f
            ************************************************************************
            ** Operações                                                          **
            1 - Consultar saldos        3 - Transferir valor
            2-  Receber valor           4 - Sair
            *************************************************************************
            """.formatted(clientName, accountTypetitle, accountValues);

      System.out.println(message);
      int input = scan.nextInt();

      if(input == 4) {
        System.out.println("Obrigado por utilizar nossos serviços!!");
        exit = true;
      } else if (input == 1) {
        System.out.println("Saldo: " + accountValues);
      } else if (input == 2) {
        System.out.println("Informe o valor a adicionar: ");
        accountValues = scan.nextDouble();
        System.out.println("Novo Saldo: " + accountValues);
      } else if (input == 3) {
        System.out.println("Informe o Valor para Transferência: ");
        double transferValue = scan.nextDouble();

        if(accountValues == 0) {
          System.out.println("Saldo insuficiente");
        } else if (accountValues < transferValue) {
          System.out.println("Valor informado maior que o saldo de conta");
        } else {
          accountValues = accountValues - transferValue;
          System.out.println("Novo Saldo: " + accountValues);
        }
        }
      }
    }
}
