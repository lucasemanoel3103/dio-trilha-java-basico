import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite a Agencia: ");
        String Agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        //imprimindo os dados obtidos pelo usuario
        System.out.println(" Olá, Lucas! " sua Agencia é o itau, seu número de conta é 001 e seu saldo é 200,00R$");



        


    }
}