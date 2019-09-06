import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		//Socket cliente = new Socket("127.0.0.1", 12345);
		Socket cliente = new Socket("localhost", 12345);
		System.out.println("Cliente conectado");
		
		PrintStream saida = new PrintStream(cliente.getOutputStream()); 
		
		Scanner teclado = new Scanner(System.in);
		//Scanner teclado = new Scanner(new FileInputStream("arquivo.txt"));
		
		while (teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}
		
		teclado.close();
		saida.close();
		cliente.close();
		
	}

}
