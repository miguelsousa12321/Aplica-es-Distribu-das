package banco.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.time.LocalDate;
import banco.Doacao;
import banco.PedidoHospitalar;
import banco.Stock;
import banco.Dador;
import banco.Hospital;
import banco.TipoSangue;
import banco.EstadoPedido;

public interface BancoSangueInterface extends Remote {
/*metodos do banco de sangue:
Atualizar stock, consultar stock, listar pedidos, processar pedidos, listar dadores
Receber e gerir pedidos hospitalares consoante stock
Fornecer dados de stock
Registar as doaçoes que chegam dos postos de colheita
Gerar estatisticas

*/

//STOCK
int verificarStock(TipoSangue tipo_sanguineo) throws RemoteException;
void atualizarStock(TipoSangue tipo_sanguineo,double quantidade_globulos,double quantidade_plaquetas, double quantidade_plasma) throws RemoteException;
Stock ConsultarStock() throws RemoteException;
Stock consultarStockPorTipo(TipoSangue tipo_sanguineo) throws RemoteException;



// ---- PEDIDOS ----
boolean receberPedido(PedidoHospitalar pedido) throws RemoteException;
boolean validarDisponibilidade(PedidoHospitalar pedido) throws RemoteException;
PedidoHospitalar autorizarPedido(String id) throws RemoteException;
PedidoHospitalar rejeitarPedido(String id) throws RemoteException;
List<PedidoHospitalar> listarPedidos() throws RemoteException;
List<PedidoHospitalar> listarPedidosPorEstado(EstadoPedido estado) throws RemoteException;
List<PedidoHospitalar> listarPedidosPorHospital(Hospital hospital) throws RemoteException;


    // ---- ESTATÍSTICAS ----
List<Dador> listarDadoresPorTipo(TipoSangue tipo) throws RemoteException;
List<PedidoHospitalar> listarPedidosPorEstado(EstadoPedido estado) throws RemoteException;
int gerarEstatisticasDoacoes(LocalDate dataInicio, LocalDate dataFim) throws RemoteException;
List<Stock> gerarRelatorioStock() throws RemoteException;
}
