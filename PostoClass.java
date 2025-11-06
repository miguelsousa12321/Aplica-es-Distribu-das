package banco;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Representa um posto de recolha de sangue.
 * Pode registar dadores, receber doações e controlar componentes sanguíneos antes de enviar para o banco.
 */
public class PostoClass implements Serializable {
    private String id;
    private String nome;
    private String morada;
    private String contacto;
    private List<Dador> dadores;      
    private List<Doacao> doacoes;        

    public PostoClass(String nome, String morada, String contacto) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.morada = morada;
        this.contacto = contacto;
        this.dadores = new ArrayList<>();
        this.doacoes = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getMorada() { return morada; }
    public String getContacto() { return contacto; }
    public List<Dador> getDadores() { return new ArrayList<>(dadores); }
    public List<Doacao> getDoacoes() { return new ArrayList<>(doacoes);}

    @Override
    public String toString() {
        return "PostoClass{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", morada='" + morada + '\'' +
                ", contacto='" + contacto + '\'' +
                ", numero de dadores=" + dadores.size() +
                ", numero de doacoes=" + doacoes.size() +
                '}';  
    }
}

