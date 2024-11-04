package LapTrinhMang.TinhTong2So;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String serverIp = "127.0.0.1";
        int serverPort = 6868;

        try {
            Socket socket = new Socket(serverIp, serverPort);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println(10);

            out.println(9);
            System.out.println("Total: " + in.readLine());

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
