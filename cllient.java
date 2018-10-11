import java.net.*;  
import java.util.Scanner;
import java.io.*;  
class cllient{
	public static void main(String args[]){
		String serverName="localhost";
		Scanner inp =new Scanner(System.in);
		String message=new String();
		int port=6666;
		DataInputStream in = null;
		int index=0;
		System.out.print("Enter a message : ");
		message=inp.nextLine();
		try{
		Socket client = new Socket(serverName, port);
		OutputStream outToServer = client.getOutputStream();
		DataOutputStream out = new DataOutputStream(outToServer);
		out.writeUTF(message);
		client.close();
		}catch(Exception e){}
	}
}