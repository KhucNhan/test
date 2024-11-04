package LapTrinhMang.PhanTichIP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        int serverPot = 8888;
        try {
            ServerSocket serverSocket = new ServerSocket(serverPot);
            Socket socket = serverSocket.accept();
            System.out.println("Connected");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String ip = in.readLine();
            ArrayList<String> ips = new ArrayList<>();
            for (int i = 0; i < ip.length(); i++) {
                ips.add(String.valueOf(ip.charAt(i)));
            }

            ArrayList<Integer> number = new ArrayList<>();
            String num = "";
            for (int i = 0; i < ip.length(); i++) {
                if (!ips.get(i).equals(".")) {
                    num += ips.get(i);
                    continue;
                }
                number.add(Integer.parseInt(num));
                num = "";
            }
            number.add(Integer.parseInt(num));

            boolean value = true;
            for (Integer integer : number) {
                if (integer < 0 || integer > 255) {
                    value = false;
                    break;
                }
            }

            out.println(value);

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
