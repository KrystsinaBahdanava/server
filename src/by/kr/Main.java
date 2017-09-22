package by.kr;

import by.kr.connection.ServerConnection;

public class Main {
    public static void main(String[] args) {
        ServerConnection servCon = new ServerConnection();
        servCon.setConnection();
    }
}
