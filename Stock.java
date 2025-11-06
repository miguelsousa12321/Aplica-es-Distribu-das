package banco;

import java.io.Serializable;



/*
/O stock de um banco de sangue tem prazo de validade e é limitado
Globulos: 42 dias
plasma: 1 ano
plaquetas: 5 dias
saber a quantidade disponivel de cada componente e cada tipo sanguineo
*/

public final class Stock implements java.io.Serializable {
    private TipoSangue tipo_sanguineo;
    private double quantidade_globulos; //em ml
    private double quantidade_plasma;
    private double quantidade_plaquetas;

//valores de referencia de stock de cada componente
    private static final double stock_maximo_globulos = 63000;
    private static final double stock_minimo_globulos = 25000;
    private static final double stock_critico_globulos = 7500;

    private static final double stock_maximo_plaquetas = 4200;
    private static final double stock_minimo_plaquetas = 2100;
    private static final double stock_critico_plaquetas = 700;

    private final double stock_maximo_plasma = 37500;
    private final double stock_minimo_plasma = 12500;
    private final double stock_critico_plasma = 5000;
    //ver valores acima

    public Stock(TipoSangue tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
        this.quantidade_globulos = 0;  //stock inicial zero
        this.quantidade_plasma = 0;
        this.quantidade_plaquetas = 0;
    }


    // Getters
    public TipoSangue getTipoSanguineo() { return tipo_sanguineo; }
    public double getQuantidadeGlobulos() { return quantidade_globulos; }
    public double getQuantidadePlasma() { return quantidade_plasma; }
    public double getQuantidadePlaquetas() { return quantidade_plaquetas; }

    // Setters
    public void setQuantidadeGlobulos(double quantidade_globulos) { this.quantidade_globulos = quantidade_globulos; }
    public void setQuantidadePlasma(double quantidade_plasma) { this.quantidade_plasma = quantidade_plasma; }
    public void setQuantidadePlaquetas(double quantidade_plaquetas) { this.quantidade_plaquetas = quantidade_plaquetas; }

    @Override
    public String toString() {
        return "Stock{" +
                "tipo_sanguineo=" + tipo_sanguineo +
                ", quantidade_globulos=" + quantidade_globulos +
                ", quantidade_plasma=" + quantidade_plasma +
                ", quantidade_plaquetas=" + quantidade_plaquetas +
                '}';
    }
}