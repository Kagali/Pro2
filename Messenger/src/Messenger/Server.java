package Messenger;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(30);

		ServerSocket server;
		try {
			server = new ServerSocket(8888);
			System.out.println("Server gestartet");

			while (true) {
				try {
					Socket client = server.accept();

					executor.execute(new Handler(client));

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
