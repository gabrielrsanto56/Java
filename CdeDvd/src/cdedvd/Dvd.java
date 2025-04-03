
package cdedvd;
import java.util.Scanner;
public class Dvd extends Midia {
    private int nFaixas;

    public Dvd() {
        super();
        this.nFaixas = 0;
    }

    public Dvd(int c, double p, String s, int f) {
        super(c, p, s);
        this.nFaixas = f;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + nFaixas;
    }

    public void setFaixas(int f) {
        this.nFaixas = f;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de faixas: ");
        this.nFaixas = entrada.nextInt();
    }
}
