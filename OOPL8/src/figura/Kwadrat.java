package figura;

public class Kwadrat extends FiguraPlaska {

    private double Bok;

    public Kwadrat(double Bok) {
        this.Bok = Bok;
    }

    public double getBok() {
        return Bok;
    }

    public void setBok(double Bok) {
        this.Bok = Bok;
    }

    @Override
    public double obliczObwod() {
        return Bok * 4;
    }

    @Override
    public double obliczPole() {
        return Math.pow(Bok, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " Kwadrat{" + "Bok=" + Bok + " Obwod=" + this.obliczObwod() + " Pole=" + this.obliczPole() + '}';
    }

}
