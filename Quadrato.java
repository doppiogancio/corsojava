public class Quadrato
{
    int lato;

    Quadrato (int lato) {  
        this.lato = lato;
    }

    public int getArea() {
        return this.lato * this.lato;
    }

    public int getPerimetro() {
        return this.lato * 4;
    }
}