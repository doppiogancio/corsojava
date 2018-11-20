/* 
HelloWorld.java
 */

public class Prodotto
{
    int quantita;
    int prezzo;

    Prodotto (int new_quantita, int new_prezzo) {  
        this.quantita = new_quantita;
        this.prezzo = new_prezzo;
    }

    public int getQuantita() {
        return this.quantita;
    }

    public int getPrezzoTotale() {
        return this.quantita * this.prezzo;
    }

    public int applicaIva(int iva) {
        return this.getPrezzoTotale() * iva / 100;
    }
}