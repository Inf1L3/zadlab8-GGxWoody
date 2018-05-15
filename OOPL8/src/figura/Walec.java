package figura;

public class Walec extends FiguraPrzestrzenna {

    private double wysokosc;
    private double promien;

    public Walec(double wysokosc, double promien) {
        this.wysokosc = wysokosc;
        this.promien = promien;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczObjetosc() {
        return Math.PI * Math.pow(promien, 2) * wysokosc;
    }

    @Override
    public double obliczPole() {
        return (2 * Math.PI * Math.pow(promien, 2)) + (2 * Math.PI * promien * wysokosc);
    }

    @Override
    public String toString() {
        return super.toString() + " Prostopadloscian{" + "Wysokosc=" + wysokosc + " Promien=" + promien + " Pole=" + this.obliczPole() + " Objetosc=" + this.obliczObjetosc() + '}';
    }

}
