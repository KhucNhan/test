package LapTrinhMang.PhanTichIP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String ipAddress = "127.0.0.1";
        int serverPot = 8888;

        try {
            Socket serverSocket = new Socket(ipAddress, serverPot);

            PrintWriter out = new PrintWriter(serverSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));

            String ip = "127.0.0.1";
            out.println(ip);
            System.out.println("Result of " + ip + ": " + in.readLine());
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
