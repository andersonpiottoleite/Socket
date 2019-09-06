import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		
		
		 
		Socket cliente = servidor.accept();
		System.out.println("Cliente Conectado: " + cliente.getInetAddress().getHostAddress());
		
		Scanner entrada = new Scanner(cliente.getInputStream());
		//PrintStream saida = new PrintStream("Saida.txt");
		
		while (entrada.hasNext()) {
			System.out.println(entrada.nextLine());
			//saida.println(entrada.nextLine());
		}
		
		//saida.close();
		entrada.close();
		
	}
	

}
