
//FEITO E FUNCIONAL


package banco;

import java.io.Serializable;

//Estados possíveis de um pedido hospitalar.

public enum EstadoPedido implements Serializable{
    PENDENTE,
    APROVADO,
    REJEITADO
}