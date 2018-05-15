package figura;

public class Stozek extends FiguraPrzestrzenna {

    private double wysokosc;
    private double promien;
    private double tworzaca;

    public Stozek(double wysokosc, double promien) {
        this.wysokosc = wysokosc;
        this.promien = promien;
        this.tworzaca = Math.pow(Math.pow(wysokosc, 2) + Math.pow(promien, 2), 1 / 2);
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
        return (1 / 3) * Math.PI * Math.pow(promien, 2) * wysokosc;
    }

    @Override
    public double obliczPole() {
        return (Math.PI * Math.pow(promien, 2)) + (Math.PI * promien * tworzaca);
    }

    @Override
    public String toString() {
        return super.toString() + " Prostopadloscian{" + "Wysokosc=" + wysokosc + " Promien=" + promien + " Tworzaca=" + tworzaca + " Pole=" + this.obliczPole() + " Objetosc=" + this.obliczObjetosc() + '}';
    }
}
