import java.io.*;  //PrintStream, BufferdReader, InputStreamReader
import java.net.*;    //Socket, ServerSocket

class TalkAppServer
{
    public static void main(String arr[]) throws Exception, InterruptedException 
    {
        System.out.println("Server Application is running...");
        try {
            ServerSocket ss = new ServerSocket(2100);
            System.out.println("Server is running at port number and waiting for client request");

            Socket s = ss.accept();
            System.out.println("Request of client got accepted");

            PrintStream ps = new PrintStream(s.getOutputStream());
            BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));   ////To Listen from client
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

            String str1, str2;

            while((str1 = br1.readLine()) != null)
            {
                System.out.println("Client says: "+str1);
                System.out.println("Enter the message for client: ");
                str2 = br2.readLine();
                ps.println(str2);
            }
        }
        catch (SocketTimeoutException ste)
        {
            System.out.println("Good Bye");
        }
        catch (IOException ioe)
        {
            System.out.println("Good Bye");
        }
                
    }
}