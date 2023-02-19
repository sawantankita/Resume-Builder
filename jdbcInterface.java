package test;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface jdbcInterface extends Remote {
	public String Delete (int id) throws RemoteException;
	public String Insert (String uname, String email, String pass) throws RemoteException;
	public String Update (int id, String name, int age) throws RemoteException;
	public ArrayList<String> Search (String id) throws RemoteException;
}
