package SecondTry.Lessons_Java.pt6_WEB.Lessons179_WEB_Sockets_Server_side;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by user on 23.09.2018.
 */
public class SocketLesson {
    public static void main(String[] args) throws IOException {
        try(ServerSocket serverSocket=new ServerSocket(8888)){
            while (true){
                Socket socket=serverSocket.accept();
                new Thread(new MyServer(socket)).start();
            }
        }
    }
}
class MyServer implements Runnable{

        Socket socket;

    public MyServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(Scanner scanner=new Scanner(socket.getInputStream());
            PrintWriter printWriter=new PrintWriter(socket.getOutputStream(),true)
        ){
            if(scanner.hasNextLine()) printWriter.println("you write: "+scanner.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}