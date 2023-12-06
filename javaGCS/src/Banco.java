public class Banco {
	
    public static  void main(String args[]){
    	
        System.out.printf("********** Hello and welcome! PUCPR - BANK ************** \n");

        Cliente cliente1 = new Cliente("Jandira Silva", 2500.00);
        Cliente cliente2 = new Cliente("Sandra Rodrigues", 1800.00);
        Cliente cliente3 = new Cliente("Luciana Teixeira", 5000.00);
        Cliente cliente4 = new Cliente("Juleska Pereira", 8000.00);
        Cliente cliente5 = new Cliente("Juma Marruá", 200.00);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);

        cliente1.retirar(1000);
        System.out.println(cliente1);

        cliente2.retirar(2000);
        cliente2.depositar(500);
        System.out.println(cliente2);

        cliente2.retirar(2000);
        System.out.println(cliente2);

        cliente3.depositar(1000);
        System.out.println(cliente3);
        
        cliente4.depositar(300);
        System.out.println(cliente4);
        
        cliente5.depositar(1000);
        System.out.println(cliente5);

        /* Teste adicional de tentativa de retirada além do saldo em conta*/
        cliente3.retirar(15000.65);
        System.out.println(cliente3);
		
		Cliente arrayCliente[] = new array Cliente[];
		arrayCliente[] = cliente1;
		arrayCliente[] = cliente2;
		arrayCliente[] = cliente3;
		arrayCliente[] = cliente4;
    }
}
