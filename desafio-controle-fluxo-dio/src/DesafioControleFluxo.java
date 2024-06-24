import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) throws   ParametrosInvalidosException {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parametro");
        int parametroDois = terminal.nextInt();
        terminal.close();
        if(parametroUm <= parametroDois){
            throw new
        ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");

        }

          contar(parametroUm, parametroDois);





    }
     static void contar(int parametroUm, int parametroDois){

        for(int i = parametroUm; i < parametroDois; i++){
            System.out.println("Contagem: " + i);
        }
     }

}


