
package cdedvd;
import java.util.Scanner;
public class Cd extends Midia {
    private int nMusicas;

    public Cd() {
        super();
        this.nMusicas = 0;
    }

    public Cd(int c, double p, String s, int m) {
        super(c, p, s);
        this.nMusicas = m;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Músicas: " + nMusicas;
    }

    public void setMusica(int m) {
        this.nMusicas = m;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de músicas: ");
        this.nMusicas = entrada.nextInt();
    }
}