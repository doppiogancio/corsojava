public class Rettangolo
{
    int base;
    int altezza;

    Rettangolo (int base, int altezza) {  
        this.base = base;
        this.altezza = altezza;
    }

    public int getArea() {
        return this.base * this.altezza;
    }

    public int getPerimetro() {
        return (this.base + this.altezza) * 2;
    }
}