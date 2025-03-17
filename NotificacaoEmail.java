public class NotificacaoEmail implements Notificacao {

  @Override
  public void enviar(String msg) {
      System.out.println("Enviando email com: " + msg);
  }
}