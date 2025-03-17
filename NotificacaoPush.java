public class NotificacaoPush implements Notificacao {

  @Override
  public void enviar(String msg) {
      System.out.println("Enviando push com: " + msg);
  }
}