public class NotificacaoSMS implements Notificacao {

  @Override
  public void enviar(String msg) {
      System.out.println("Enviando SMS com: " + msg);
  }
}