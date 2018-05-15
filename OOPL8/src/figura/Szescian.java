package figura;

public class Szescian extends FiguraPrzestrzenna {

    private double bok;

    public Szescian(double bok) {
        this.bok = bok;
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }

    @Override
    public double obliczObjetosc() {
        return Math.pow(bok, 3);
    }

    @Override
    public double obliczPole() {
        return Math.pow(bok, 2) * 6;
    }

    @Override
    public String toString() {
        return super.toString() + " Prostopadloscian{" + "Bok=" + bok + " Pole=" + this.obliczPole() + " Objetosc=" + this.obliczObjetosc() + '}';
    }
}
