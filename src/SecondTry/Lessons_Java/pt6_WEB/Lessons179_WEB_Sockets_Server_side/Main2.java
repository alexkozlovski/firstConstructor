package SecondTry.Lessons_Java.pt6_WEB.Lessons179_WEB_Sockets_Server_side;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by user on 23.09.2018.
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
       try (ServerSocket serverSocket=new ServerSocket(8888);
            Socket socket=serverSocket.accept()){
           Scanner scanner=new Scanner (socket.getInputStream());
           PrintWriter writer=new PrintWriter(socket.getOutputStream(),true);
           writer.println("hello");
            while (scanner.hasNextLine()){
                String str=scanner.nextLine();
                System.out.println("you've sendMessage: "+str);
                System.out.println(str);
                if(str.equals("exit")){
                    break;
                }
            }
       }

    }
}
