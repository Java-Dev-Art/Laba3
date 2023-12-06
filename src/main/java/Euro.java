import java.util.Objects;

public class Euro implements Comparable<Euro> {
    private double cents;

    public Euro() {
    }

    public Euro(double cents) {
        this.cents = cents;
    }

    public double getCents() {
        return cents;
    }

    public void setCents(double cents) {
        this.cents = cents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Euro)) return false;
        Euro euro = (Euro) o;
        return Double.compare(euro.cents, cents) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cents);
    }

    @Override
    public int compareTo(Euro o) {
        return (int) (this.getCents() - o.getCents());
    }

    @Override
    public String toString() {
        return String.format("%f.%f2", getCents() / 100, getCents() % 100);
    }
}
