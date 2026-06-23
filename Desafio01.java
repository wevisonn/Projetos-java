import java.util.Scanner;

public class DesafioBootcamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.print("Qual seu saldo? ");
        int saldo = scanner.nextInt();
      System.out.print("Qual o valor da transação? ");  
        int valorTransacao = scanner.nextInt();

        System.out.println((saldo >= valorTransacao) ? "Transacao aprovada" : "Saldo insuficiente" );
        scanner.close();
    }
}