public class testa {
    public static void main(String[] args) {
        
        
        ReceberEnviar conta1 = new ReceberEnviar();
        ReceberEnviar conta2 = new ReceberEnviar();


        conta1.enviarMSG("Teste mensagem para conta2", conta2);
        conta2.receberMSG();
        conta2.enviarMSG("Teste mensagem para conta1", conta1);
        conta1.receberMSG();
    }
}
