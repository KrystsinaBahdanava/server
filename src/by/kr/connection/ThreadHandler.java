package by.kr.connection;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ThreadHandler extends Thread {
    private PrintStream out = null; //передача
    private BufferedReader is = null; //прием
    private InetAddress addr = null; //адрес клиента

    public ThreadHandler(Socket s) throws IOException {
        out = new PrintStream(s.getOutputStream()); //отправка клиенту
        is = new BufferedReader(new InputStreamReader(s.getInputStream())); //получение от клиента
        addr = s.getInetAddress();
        this.start(); //запускает метод run
    }

    public void run() {
        //просто проверка, работает ли передача данных
        System.out.println("Hello!");
        try {
            out.println("Hi from server");
            String fromClient = is.readLine();
            System.out.println(fromClient);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}