public class FabricaNotificacao {
  public static Notificacao criar(String tipo) {
      if (tipo.equalsIgnoreCase("EMAIL")) {
          return new NotificacaoEmail();
      } else if (tipo.equalsIgnoreCase("SMS")) {
          return new NotificacaoSMS();
      } else if (tipo.equalsIgnoreCase("PUSH")) {
          return new NotificacaoPush();
      } else {
          throw new IllegalArgumentException("Tipo inválido: " + tipo);
      }
  }
}
