
package banco.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import banco.PedidoHospitalar;
import banco.Stock;

public interface Hospital extends Remote {
    /*metodos do hospital que vamos criar em hospital app
    fazer pedidos de sangue ao banco de sangue
    consultar estado dos pedidos feitos
    consultar historico de pedidos feitos
    */
PedidoHospitalar pedidoSangue(PedidoHospitalar pedido) throws RemoteException;
PedidoHospitalar cancelarPedido(PedidoHospitalar pedido) throws RemoteException;
PedidoHospitalar alterarPedido(PedidoHospitalar pedido) throws RemoteException;
Stock consultarStockHospital() throws RemoteException;
EstadoPedido consultarEstadoPedido(PedidoHospitalar id) throws RemoteException;
List<PedidoHospitalar> historicoPedidosHospital(Hospital hospital) throws RemoteException;
}
