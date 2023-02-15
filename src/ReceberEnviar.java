public class ReceberEnviar {
    String nome;
    String mensagem;
    String caixaDeEntrada;
    
    //Metodo para enviar msg
    void enviarMSG(String texto, ReceberEnviar destino){
        this.mensagem = texto;
        destino.caixaDeEntrada = this.mensagem;
    }

    //Metodo de receber
    void receberMSG(){
        System.out.println("Mensagem recebida: " + this.caixaDeEntrada);
    }

    /*
     * Nota
     * APRENDER A MELHORAR ESTE CODIGO!!
    */
}
