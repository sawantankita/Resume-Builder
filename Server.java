package test;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Server extends UnicastRemoteObject implements jdbcInterface {

	public Server() throws RemoteException {
		super();
	}
	
	public static void main(String[] args) throws RemoteException {
		Registry reg = LocateRegistry.createRegistry(1099);
		Server s = new Server();
		reg.rebind("db", s);
		System.out.println("SERVER is running.");
	}

	@Override
	public String Delete(int id) throws RemoteException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root" , "");
			Statement stmt = conn.createStatement();
			String sql = "DELETE FROM data WHERE id='"+id+"'";
			stmt.executeUpdate(sql);
			return "Record Deleted Successfully";
		} catch (Exception e) {
			return (e.toString());
		}
	}

	public String Insert(String uname, String email, String pass) throws RemoteException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root" , "");
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO registerDetails VALUES('"+uname+"', '"+email+"', '"+pass+"')";
			stmt.executeUpdate(sql);
			return "Record Inserted Successfully";
		} catch (Exception e) {
			return (e.toString());
		}
	}

	@Override
	public String Update(int id, String name, int age) throws RemoteException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root" , "");
			Statement stmt = conn.createStatement();
			String sql = "UPDATE data SET name='"+name+"', age='"+age+"' WHERE id='"+id+"'";
			stmt.executeUpdate(sql);
			return "Record Updated Successfully";
		} catch (Exception e) {
			return (e.toString());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<String> Search(String id) throws RemoteException {
		ArrayList<String> al = new ArrayList<String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root" , "");
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM registerdetails WHERE r_uname='"+id+"'";
			ResultSet rs;
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				al.add("r_uname: " + rs.getString("r_uname"));
				al.add("r_email: " + rs.getString("r_email"));
				al.add("r_pass: " + rs.getString("r_pass"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
