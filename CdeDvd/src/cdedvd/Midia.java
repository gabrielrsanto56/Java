
package cdedvd;
import java.util.Scanner;
class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
        this.codigo = 0;
        this.preco = 0.0;
        this.nome = "";
    }

    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public String getTipo() {
        return "Mídia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: R$" + preco;
    }

    public void printDados() {
        System.out.println(getDetalhes());
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código: ");
        this.codigo = scanner.nextInt();
        System.out.print("Digite o preço: ");
        this.preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o nome: ");
        this.nome = scanner.nextLine();
    }
}