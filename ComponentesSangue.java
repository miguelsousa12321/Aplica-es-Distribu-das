//FEITO E FUNCIONAL
//ver se não faz sentido ter em enum
package banco;

import java.io.Serializable;

public final class ComponentesSangue implements Serializable {
    private double globulos; // mL
    private double plasma;             // mL
    private double plaquetas;          // mL

    public ComponentesSangue(double globulos, double plasma, double plaquetas) {
        this.globulos = globulos;
        this.plasma = plasma;
        this.plaquetas = plaquetas;
    }

    // Getters
    public double getGlobulos() { return globulos; }
    public double getPlasma() { return plasma; }
    public double getPlaquetas() { return plaquetas; }
    // Setters
    public void setGlobulos(double globulos) { this.globulos = globulos; }
    public void setPlasma(double plasma) { this.plasma = plasma; }
    public void setPlaquetas(double plaquetas) { this.plaquetas = plaquetas; }

    @Override
    public String toString() {
        return "Componentes{" +
                "globulos=" + globulos +
                ", plasma=" + plasma +
                ", plaquetas=" + plaquetas +
                '}';
    }
}
