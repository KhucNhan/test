package LapTrinhMang.TinhTong2So;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int serverPort = 6868;
        try {
            ServerSocket serverSocket = new ServerSocket(serverPort);
            System.out.println("Server is running and waiting for connection...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            int first = Integer.parseInt(in.readLine());
            int second = Integer.parseInt(in.readLine());
            out.println(first + second);

            clientSocket.close();
            serverSocket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
