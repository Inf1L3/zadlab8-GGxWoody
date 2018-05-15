package figura;

public class Prostopadloscian extends FiguraPrzestrzenna {

    private double bokA;
    private double bokB;
    private double bokC;

    public Prostopadloscian(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }

    public double getBokC() {
        return bokC;
    }

    public void setBokC(double bokC) {
        this.bokC = bokC;
    }

    @Override
    public double obliczObjetosc() {
        return bokA * bokB * bokC;
    }

    @Override
    public double obliczPole() {
        return (bokA * bokB * 2) + (bokA * bokC * 2) + (bokB * bokC * 2);
    }

    @Override
    public String toString() {
        return super.toString() + " Prostopadloscian{" + "BokA=" + bokA + "BokB=" + bokB + "BokC=" + bokC + " Pole=" + this.obliczPole() + " Objetosc=" + this.obliczObjetosc() + '}';
    }
}
