
package banco;    

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import banco.TipoSangue;
import banco.Doacao;

    

public final class Dador implements java.io.Serializable {
    private String idDador;
    private String nif;
    private String nome;
    private LocalDateTime data_nascimento;
    private String genero;
    private TipoSangue tipo_sanguineo;
    private String contacto;
    private List<Doacao> doacoes = new ArrayList<>();


//adicionar data de nascimento e elegivel em boolean
    public Dador(String nif, String nome, LocalDateTime data_nascimento, String genero, TipoSangue tipo_sanguineo, String contacto) {
        this.idDador = java.util.UUID.randomUUID().toString();
        if (nif == null || nif.isBlank()) throw new IllegalArgumentException("nif vazio");
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("nome vazio");
        this.nif = nif;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.genero = genero;
        this.tipo_sanguineo = tipo_sanguineo;
        this.contacto = contacto == null ? "" : contacto;
        this.doacoes = new ArrayList<>();
    }



    public int getIdade() {
    if (this.data_nascimento == null) {
        throw new IllegalStateException("Data de nascimento inválida");
    }
    LocalDate data_nascimento = this.data_nascimento.toLocalDate();
    return Period.between(dataNasc, LocalDate.now()).getYears();
    }

    
    public void setIdDador(String idDador){
        this.idDador = idDador;
    }

    public String getIdDador() {
        return this.idDador;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return this.nif;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDateTime getData_nascimento() {
        return this.data_nascimento;
    }
    public void setData_nascimento(LocalDateTime data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public TipoSangue getTipoSanguineo() {
        return this.tipo_sanguineo;
    }

    public void setTipoSanguineo(TipoSangue tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public String getContacto() {
        return this.contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public List<Doacao> getDoacoes() {
        return this.doacoes.stream().collect(Collectors.toList());
    }
    public void addDoacao(Doacao doacao) {
        if (doacao == null) throw new IllegalArgumentException("Erro ao adicionar doação");
        this.doacoes.add(doacao);
    }
    @Override
    public String toString() {
        return "Dador{" +
            "id='" + id + '\'' +
            ", nome='" + nome + '\'' +
            ", genero='" + genero + '\'' +
            ", data_nascimento=" + data_nascimento +
            ", tipoSanguineo=" + tipo_sanguineo +
            ", contacto='" + contacto + '\'' +
            '}';
    }

}

