
//FEITO E FUNCIONAL

package banco;

import java.io.Serializable;

/**
 * Representa um hospital que faz pedidos de sangue.
 */


public class HospitalClass implements Serializable {

    private String id;
    private String nome;
    private String localizacao;
    private String contacto;

    public HospitalClass(String id, String nome, String localizacao, String contacto) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.contacto = contacto;
    }

    //ver se faz sentido criar uma lista de pedidos de cada hospital

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getLocalizacao() { return localizacao; }
    public String getContacto() { return contacto; }

    public void setNome(String nome) { this.nome = nome; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
    public void setContacto(String contacto) { this.contacto = contacto; }

    @Override
    public String toString() {
        return nome + " (" + localizacao + "), contacto: " + contacto;
    }
}
