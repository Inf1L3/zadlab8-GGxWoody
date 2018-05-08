package figura;

public class Trapez extends FiguraPlaska {

    private double Podstawa1;
    private double Podstawa2;
    private double Wysokosc;

    public Trapez(double Podstawa1, double Podstawa2, double Bok) {
        this.Podstawa1 = Podstawa1;
        this.Podstawa2 = Podstawa2;
        this.Wysokosc = Bok;
    }

    public double getPodstawa1() {
        return Podstawa1;
    }

    public void setPodstawa1(double Podstawa1) {
        this.Podstawa1 = Podstawa1;
    }

    public double getPodstawa2() {
        return Podstawa2;
    }

    public void setPodstawa2(double Podstawa2) {
        this.Podstawa2 = Podstawa2;
    }

    public double getBok() {
        return Wysokosc;
    }

    public void setBok(double Bok) {
        this.Wysokosc = Bok;
    }

    @Override
    public String toString() {
        return super.toString() + " Trapez{" + "Podstawa1=" + Podstawa1 + ", Podstawa2=" + Podstawa2 + ", Wysokosc=" + Wysokosc + " Pole=" + this.obliczPole() + " Obwod=" + this.obliczObwod() + '}';
    }

    @Override
    public double obliczObwod() {
        return Wysokosc * 2 + Podstawa1 + Podstawa2;
    }

    @Override
    public double obliczPole() {
        return ((Podstawa1+Podstawa2)/2)*Wysokosc;
    }

}
