package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Administrador extends Remote {
/*metodos do administrador:
registar,consultar, atualizar e remover dador

//DADOR
*/

//DADORES
Dador registarDador(Dador dador) throws RemoteException;
Dador consultarDador(String id, String nif) throws RemoteException;
Dador atualizarDador(Dador dador) throws RemoteException;
boolean removerDador(String id, String nif) throws RemoteException;
List<Dador> listarDadores() throws RemoteException;
List<Dador> listarDadoresPorTipo(TipoSangue tipo_sanguineo) throws RemoteException;

//HOSPITAIS
HospitalClass registarHospital(HospitalClass hospital) throws RemoteException;
HospitalClass consultarHospital(String id) throws RemoteException;
HospitalClass atualizarHospital(HospitalClass hospital) throws RemoteException;
boolean removerHospital(String id) throws RemoteException;
List<HospitalClass> listarHospitais() throws RemoteException;

//POSTOS
PostoClass registarPosto(PostoClass posto) throws RemoteException;
PostoClass consultarPosto(String id) throws RemoteException;
PostoClass atualizarPosto(PostoClass posto) throws RemoteException;
boolean removerPosto(String id) throws RemoteException;
List<PostoClass> listarPostos() throws RemoteException;

//RELATÓRIOS

}