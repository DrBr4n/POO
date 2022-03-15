
import java.lang.StringBuilder;

public class Circulo {

    private double x, y, raio;

    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 1;
    }

    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo c) {
        this.x = c.getX();
        this.y = c.getY();
        this.raio = c.getRaio();
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public double getX() {return this.x;}

    public void setY(double y) {this.y = y;}
    
    public double getY() {return this.y;}

    public void setRaio(double raio) {this.raio = raio;}
    
    public double getRaio() {return this.raio;}

    public boolean equals(Object o) {
        if (this == o) return true;
        if((o == null) || (this.getClass() != o.getClass())) return false; 
        Circulo c = (Circulo) o;
        return this.raio == c.getRaio()
            && this.x == c.getX()
            && this.y == c.getY();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Circulo(x: ");
        sb.append(this.getX());
        sb.append(",y: ");
        sb.append(this.getY());
        sb.append(",raio: ");
        sb.append(this.getRaio());
        sb.append(")");

        return sb.toString();
    }

    public Circulo clone() {
        return new Circulo(this);
    }
    
    public void alteraCentro(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public double calculaArea() {
        return (3.14 * this.getRaio() * this.getRaio());
    }

    public double calculaPerimetro() {
        return (2*3.14*this.getRaio());
    }


}
