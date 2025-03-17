import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String tipo = "";

        System.out.println("Escolha a notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push");
        System.out.print("Opção: ");
        int op = leia.nextInt();
        leia.nextLine();

        System.out.print("Digite a mensagem: ");
        String msg = leia.nextLine();

        switch(op) {
            case 1:
                tipo = "EMAIL";
                break;
            case 2:
                tipo = "SMS";
                break;
            case 3:
                tipo = "PUSH";
                break;
            default:
                System.out.println("Opção inválida!");
                leia.close();
                return;
        }

        Notificacao not = FabricaNotificacao.criar(tipo);
        not.enviar(msg);
        leia.close();
    }
}
