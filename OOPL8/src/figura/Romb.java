package figura;

public class Romb extends FiguraPlaska {

    private double bok;
    private double wysokosc;

    public Romb(double bok, double wysokosc) {
        this.bok = bok;
        this.wysokosc = wysokosc;
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    @Override
    public double obliczObwod() {
        return bok * 4;
    }

    @Override
    public double obliczPole() {
        return bok * wysokosc;
    }

    @Override
    public String toString() {
        return super.toString() + " Romb{" + " Bok=" + bok + " Wysokosc=" + wysokosc + " Obwod=" + this.obliczObwod() + " Pole=" + this.obliczPole() + '}';
    }

}
