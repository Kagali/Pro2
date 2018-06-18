package Messenger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {
	private static int a;

	public static void main(String[] args) {
		a = 0;

		new Thread(new Client()).start();
		new Thread(new Client()).start();
		new Thread(new Client()).start();
		new Thread(new Client()).start();
	}

	@Override
	public void run() {
		try {
			@SuppressWarnings("resource")
			Socket client = new Socket("localhost", 8888);
			System.out.println("Client gestart");

			// ------
			OutputStream out = client.getOutputStream();
			PrintWriter writer = new PrintWriter(out);

			InputStream in = client.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			// ------
			a++;
			writer.write("Hallo vom " + a + ". Client \n");
			writer.flush();

			String s = null;

			while ((s = reader.readLine()) != null) {
				System.out.println("Emfangen vom Client: " + s);

			}

			reader.close();
			writer.close();

		} catch (IOException e) {

		}
	}
}
