package dispositivo.telefone;

import dispositivo.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

    @Override
    public void ligar(){
        System.out.println("ligando");
    }

    @Override
    public void atender(){
        System.out.println("atendendo 968476662");
    }

    @Override
    public void correioVoz(){
        System.out.println("a claro informa: voce tem uma nova mensagem");
    }
}
