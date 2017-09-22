package by.kr.connection;

import javax.net.ServerSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnection {
    private ServerSocket server = null;

    public void setConnection() {
        try {
            server = new ServerSocket(3332);
            System.out.println("Инициализация прошла успешно");
            while (true) {
                Socket socket = server.accept();
                System.out.println(socket.getInetAddress().getHostName() + " подключен");
                ThreadHandler thread = new ThreadHandler(socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
