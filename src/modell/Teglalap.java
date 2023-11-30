package modell;

public class Teglalap {
    private int a, b;

    public Teglalap() {
        this(1,2);
    }

    public Teglalap(int a, int b) {
        setA(a);
        setB(b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(a <= 0){ a = 1; }
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if(b <= 0){ b = 1; }
        this.b = b;
    }
    
    public double terulet(){
        return a*b;
    }
    
    public double kerulet(){
        return 2*(a+b);
    }

    @Override
    public String toString() {
        return "Teglalap{" + "a=" + a + ", b=" + b + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Double.hashCode(this.terulet());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teglalap other = (Teglalap) obj;
        if (this.terulet() != other.terulet()) {
            return false;
        }else{
            return true;
        }
    }

    
}
