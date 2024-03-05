import java.net.*;
import java.io.IOException;

public class UdpClient {
  java.text.DateFormat DF = null;
  public static void main(String[] args) {
    try { 
	
	  InetAddress iaddr = InetAddress.getLocalHost();
	
      DatagramPacket dp = new DatagramPacket(new byte[20], 20, iaddr, 55000);
      DatagramSocket ds = new DatagramSocket();
      
      if (args.length==1) {
		  String s = args[0];
		  
		  dp.setData(s.getBytes() );
		  
		  ds.send(dp);
		  
		  ds.receive(dp);
		  System.out.println(new String(dp.getData()));
	  }	  
	  
	} catch (UnknownHostException e) { e.printStackTrace();}
	  catch (SocketException e) { e.printStackTrace();}
	  catch (IOException e) { e.printStackTrace();}
  }
}
