package figura;

public class Kula extends FiguraPrzestrzenna {

    private double promien;

    public Kula(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczObjetosc() {
        return (4 / 3) * Math.PI * Math.pow(promien, 3);
    }

    @Override
    public double obliczPole() {
        return 4 * Math.PI * Math.pow(promien, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " Kula{" + "Promien=" + promien + " Objetosc=" + this.obliczObjetosc() + " Pole=" + this.obliczPole() + '}';
    }
}
