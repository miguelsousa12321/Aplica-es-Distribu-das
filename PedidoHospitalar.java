package banco;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
//Representa um pedido hospitalar de componentes sanguíneos.

public final class PedidoHospitalar implements Serializable {
    private String id;
    private HospitalClass hospital;
    private LocalDateTime data_pedido;
    private TipoSangue tipo_sanguineo;
    private double quantidade_total;
    private ComponentesSangue componentes;
    private EstadoPedido estado;


    public PedidoHospitalar(HospitalClass hospital,LocalDateTime data_pedido, TipoSangue tipo_sanguineo, double quantidade_total, ComponentesSangue componentes,EstadoPedido estado) {
        this.id = UUID.randomUUID().toString();
        this.hospital = hospital;
        this.data_pedido = LocalDateTime.now();
        this.tipo_sanguineo = tipo_sanguineo;
        this.quantidade_total = quantidade_total;
        this.componentes = componentes;
        this.estado = EstadoPedido.PENDENTE; //ao inicio o estado é sempre pendente
    }

    public String getId() { return id; }
    public HospitalClass getHospital() { return hospital; }
    public LocalDateTime getDataPedido() { return data_pedido; }
    public TipoSangue getTipoSanguineo() { return tipo_sanguineo; }
    public double getQuantidadeTotal() { return quantidade_total; }
    public ComponentesSangue getComponentes() { return componentes; }
    public EstadoPedido getEstado() { return estado; }

    public void setId(String id){this.id = id;}
    public void setHospital(HospitalClass hospital) { this.hospital = hospital; }
    public void setDataPedido(LocalDateTime data_pedido) { this.data_pedido = data_pedido; }
    public void setTipoSanguineo(TipoSangue tipo_sanguineo) { this.tipo_sanguineo = tipo_sanguineo; }
    public void setQuantidadeTotal(double quantidade_total) { this.quantidade_total = quantidade_total; }
    public void setComponentes(ComponentesSangue componentes) { this.componentes = componentes; }
    public void setEstado(EstadoPedido estado) { this.estado = estado; }


    @Override
    public String toString() {
        return "Pedido ID: " + id + ", Hospital: " + hospital.getNome() + ", Data do Pedido: " + data_pedido +
               ", Tipo Sanguíneo: " + tipo_sanguineo + ", Quantidade Total: " + quantidade_total +
               ", Componentes: " + componentes + ", Estado: " + estado;
    }

}