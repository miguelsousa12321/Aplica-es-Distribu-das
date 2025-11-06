package banco;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public   class Doacao implements java.io.Serializable {
    private String id;
    private Dador dador;
    private LocalDateTime data_recolha;
    private double quantidade;
    private TipoSangue tipo_sanguineo;
    private ComponentesSangue componentes;
    private PostoClass posto_recolha;



    public Doacao(Dador dador, LocalDateTime data_recolha, double quantidade, TipoSangue tipo_sanguineo,ComponentesSangue componentes, PostoClass posto_recolha) {
        
        this.id = UUID.randomUUID().toString();
    
        if (data_recolha == null) {
            this.data_recolha = LocalDateTime.now();
        }else{
            this.data_recolha = data_recolha;
        }
        this.dador = dador;
        this.quantidade = quantidade;
        this.tipo_sanguineo = tipo_sanguineo;
        this.componentes = componentes;
        this.posto_recolha = posto_recolha;
    }

//getters and setters
    
    public String getId() {
        return id;
    }
    public Dador getDador() {
        return dador;
    }
    public LocalDateTime getDataRecolha() {
        return data_recolha;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public TipoSangue getTipoSanguineo() {
        return tipo_sanguineo;
    }
    public ComponentesSangue getComponentes() {
        return componentes;
    }
    public PostoClass getPostoRecolha() {
        return posto_recolha;
    }

//setters

    public void setId(String id) {
        this.id = id;
    }
    public void setDador(Dador dador) {
        this.dador = dador;
    }
    public void setDataRecolha(LocalDateTime data_recolha) {
        this.data_recolha = data_recolha;
    }
    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
    }
    public void setTipoSanguineo(TipoSangue tipo_sanguineo){
        this.tipo_sanguineo = tipo_sanguineo;
    }
    public void setComponentes(ComponentesSangue componentes) {
        this.componentes = componentes;
    }
    public void setPostoRecolha(PostoClass posto_recolha) {
        this.posto_recolha = posto_recolha;
    }
    
    @Override
    public String toString() {
        return "Doacao{" +
                "id='" + id + '\'' +
                ", dador=" + dador +
                ", data_recolha=" + data_recolha +
                ", quantidade=" + quantidade +
                ", tipo_sanguineo=" + tipo_sanguineo +
                ", componentes=" + componentes +
                ", posto_recolha=" + posto_recolha +
                '}';
    }
}