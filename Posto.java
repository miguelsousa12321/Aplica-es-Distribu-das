package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import banco.Doacao;

public interface Posto extends Remote {

/* Registar novos dadores no posto de colheita,
registar doações, ver historio de doacoes feitas no posto,
 consultar stock de sangue disponivel no posto
 Consultar historico local de doações feitas no posto por dador

*/

boolean registrarDador(Dador dador) throws RemoteException;
boolean registrarDoacao(Doacao doacao) throws RemoteException;
List<Doacao> historicoDoacoesPorPosto(Doacao posto_recolha) throws RemoteException;
List<Doacao> historicoDoacoesPorDador(Dador id) throws RemoteException;
List<Doacao> listarDoacoesPorTipo(TipoSangue tipo_sanguineo) throws RemoteException;

}


