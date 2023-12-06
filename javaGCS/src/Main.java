// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("********** Hello and welcome! PUCPR - BANK ************** \n");

        Cliente cliente1 = new Cliente("Maria", 500.75);
        Cliente cliente2 = new Cliente("João", 2045.25);

        System.out.println(cliente1);
        System.out.println(cliente2);

        cliente1.depositar(200);
        cliente1.retirar(3000);

        System.out.println(cliente1);


    }
}