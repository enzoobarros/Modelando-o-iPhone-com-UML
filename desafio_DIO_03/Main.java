import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU iPhone =====");
            System.out.println("1 - Tocar música");
            System.out.println("2 - Ligar para alguém");
            System.out.println("3 - Navegar na internet");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    iphone.selecionarMusica(musica);
                    iphone.tocar();
                    iphone.pausar();
                    break;
                case 2:
                    System.out.print("Digite o número para ligar: ");
                    String numero = scanner.nextLine();
                    iphone.ligar(numero);
                    iphone.atender();
                    iphone.iniciarCorreioVoz();
                    break;
                case 3:
                    System.out.print("Digite a URL da página: ");
                    String url = scanner.nextLine();
                    iphone.exibirPagina(url);
                    iphone.adicionarNovaAba();
                    iphone.atualizarPagina();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
