
package cdedvd;

public class CdeDvd {

    public static void main(String[] args) {
        Cd cd1 = new Cd();
        Dvd dvd1 = new Dvd();

        System.out.println("Cadastro de CD:");
        cd1.inserirDados();
        System.out.println();

        System.out.println("Cadastro de DVD:");
        dvd1.inserirDados();
        System.out.println();

        System.out.println("Produtos cadastrados:");
        cd1.printDados();
        System.out.println();
        dvd1.printDados();
    }
    
}
