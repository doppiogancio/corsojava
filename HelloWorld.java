/* 
HelloWorld.java
 */

 import com.sun.activation.registries.MailcapFile;

import Quadrato;

public class HelloWorld
{
	public static void main(String[] args) {
        Prodotto meredina = new Prodotto(10, 3);
        Prodotto latte = new Prodotto(3, 2);

        Quadrato q = new Quadrato(3);
        Rettangolo r = new Rettangolo(20, 10);
        Array<Prodotto> listaDellaSpesa = new Array<Prodotto>();
        listaDellaSpesa[0] = meredina;
        listaDellaSpesa[1] = latte;

        System.out.format("Quantita merendine: %d\n", meredina.getQuantita());
        System.out.format("Prezzo totale latte: %d\n", latte.applicaIva(2));
        System.out.format("Prezzo totale latte: %d\n", latte.applicaIva(4));
        System.out.format("totale speso: %d\n", meredina.getPrezzoTotale() + latte.getPrezzoTotale());
        
        Mail m = new MailcapFile()
        m.sendEmail("fan@or.it", "ciai", "asda sd asd a");
	}
}