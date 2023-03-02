import java.io.*;  //Socket, ServerSocket
import java.net.*;     //Socket

class TalkAppClient
{
    public static void main(String arr[]) throws Exception
    {
        System.out.println("Client Application is running...");




        Socket s = new Socket("localhost",2100);
        System.out.println("Client is waiting for server to accept the request");

        PrintStream ps = new PrintStream(s.getOutputStream());         //To talk with server
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream fobj = new FileOutputStream("Backup_log.txt"); // To create backup of Chat

        String str1, str2, str3, str4;

        System.out.println("Please Initiate Conversation : ");
        while(!(str1 = br2.readLine()).equals("end"))
        {
            
            ps.println(str1);
            str3 = ("Client Says: "+str1+"\n");
            byte bData1[] = str3.getBytes();
            fobj.write(bData1);

            str2 = br1.readLine();
            System.out.println("Server Says:  "+str2);
            str4 = ("Server Says: "+str2+"\n");
            byte bData2[] = str4.getBytes();
            fobj.write(bData2);

            System.out.println("Enter the Message for server: ");
        }
    }
}