import java.net.*;
import java.io.*;

public class client {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("18.144.18.211",1234);
	String a=args[0], b=args[1];
	int converta = Integer.parseInt(a);
	PrintWriter pr =new PrintWriter(s.getOutputStream());
	pr.println(b+" Had "+converta+" Login Attempt");
	pr.flush();

    }

}

