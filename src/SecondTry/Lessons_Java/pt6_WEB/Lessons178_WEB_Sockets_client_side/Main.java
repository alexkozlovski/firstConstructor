package SecondTry.Lessons_Java.pt6_WEB.Lessons178_WEB_Sockets_client_side;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by user on 23.09.2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try(Socket socket=new Socket()){
            socket.connect(new InetSocketAddress("india.colorado.edu",13),2000);
            Scanner sc=new Scanner(socket.getInputStream());
            while (sc.hasNext()) System.out.println(sc.nextLine());

        }
    }
}
