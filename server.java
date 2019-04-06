import java.net.*;
import java.io.*;

public class server {

    public static void main(String[] args) throws IOException {
	boolean cond=true;
        ServerSocket ss= new ServerSocket(1234);
	Socket s = ss.accept();
	
	System.out.println("Client Connected");
	
	while(cond != false){
	InputStreamReader in = new InputStreamReader(s.getInputStream());
	BufferedReader br = new BufferedReader(in);

	String str = br.readLine();
	
	if(str != null){
	System.out.println("Metrics for SSH log-in attempts");
	System.out.println(str);
	cond=true;
	}
	
	}
	
    }
}

