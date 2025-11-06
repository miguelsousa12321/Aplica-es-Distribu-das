
//FEITO E FUNCIONAL

package banco;

import java.io.Serializable;

//Representa as diferentes opções de tipos sanguíneos disponíveis.

public enum TipoSangue implements Serializable {
    A_POS("A+"), A_NEG("A-"),
    B_POS("B+"), B_NEG("B-"),
    AB_POS("AB+"), AB_NEG("AB-"),
    O_POS("O+"), O_NEG("O-");

    private final String label;

    TipoSangue(String label) { this.label = label; }

    @Override
    public String toString() { return label; }
}

//A label serve para mostrar o tipo sanguineo de forma mais amigavel, e, vez de nome da vaariavel.
//exemplo: A_POS em vez de A+.