import java.util.Scanner;

public class Desafio02Boot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome e seu tipo de conta? ");
        String frase = scanner.nextLine();
        String[] partes = frase.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1];

        switch (tipoConta) {
            case "corrente":
                System.out.println("Bem-vindo(a), " + nome + "! Sua conta " + tipoConta + " esta pronta para uso.");
                break;
        
            case "poupança":
                System.out.println("Bem-vindo(a), " + nome + "! Sua conta " + tipoConta + " esta pronta para uso.");
                break;
            case "investimento":
                System.out.println("Bem-vindo(a), " + nome + "! Sua conta " + tipoConta + " esta pronta para uso.");
                break;    
            default:
                System.out.println("Tipo de conta Invalido");
                break;
        }
        scanner.close();
    }
}