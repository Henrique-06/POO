package impressoraOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Impressora impressora = new Impressora();
        String opcao = "";

        while (!opcao.equals("4")) {
            System.out.println("\nEscolha uma opção:"
                    + "\n1 – imprimir"
                    + "\n2 – carregar papel na impressora"
                    + "\n3 – trocar o toner da impressora"
                    + "\n4 – sair"
                    + "\n->");
            opcao = scanner.nextLine().trim();

            switch (opcao) {
            case "1":
                System.out.println("Digite quantas folhas deseja imprimir:");
                int papeis = Integer.parseInt(scanner.nextLine());
                try {
                    impressora.imprimir(papeis);
                    System.out.println("Folhas impressas com sucesso!");
                } catch (FaltouPapelException | FaltouTintaException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "2":
                System.out.println("Digite quantas folhas deseja adicionar:");
                int carregar = Integer.parseInt(scanner.nextLine());
                impressora.carregarPapeis(carregar);
                System.out.println("Papéis carregados com sucesso! Quantidade atual: "
                        + impressora.getQtdPapeis());
                break;
            case "3":
                impressora.recarregarToner();
                System.out.println("Toner recarregado com sucesso!");
                break;
            case "4":
                System.out.println("Programa encerrado"
                        + "\nQuantidade de folhas impressas: " + impressora.getTotalImpresso());
                break;
            default:
                System.out.println("Opção inválida, tente outra vez.");
                break;
            }
        }
        scanner.close();
    }
}
