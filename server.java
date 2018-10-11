import java.net.*;  
import java.util.Scanner;
import java.io.*;  
class server{
	public static void main(String args[]){
		String servername="";
		int port=6666;
		try{
		ServerSocket serverSocket = new ServerSocket(port);
		Socket server = serverSocket.accept();
		DataInputStream in = new DataInputStream(server.getInputStream());
		String rec=in.readUTF();
		System.out.println("Received from client : "+rec);
		server.close();
		}catch(IOException e){
			System.out.println("Exception occured");
		}
	}
}