package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import banco.Dador;
import banco.TipoSangue;

public interface DadorInterface extends Remote {
/* Metodos dador:
ver o seu historico de doações
ver o seu tipo sanguineo
atualizar os seus dados pessoais
*/

Dador consultarDador(String id, String nif)  throws RemoteException;´
List<Doacao> historicoDoacoesPorDador(Dador id) throws RemoteException;
TipoSangue consultarTipoSanguineo(Dador id) throws RemoteException;
Dador atualizarDadosPessoais(Dador dador) throws RemoteException;
int totalDoacoes(Dador id) throws RemoteException;
double totalSangueDoado(Dador id) throws RemoteException;
double intervaloMedioEntreDoacoes(Dador id) throws RemoteException;
}
