/*A simple client program that connects to a whois server. 
Whois allows you to see some of the internet domain reg infor of a specific doman */
import java.net.*;
import java.io.*;

public class Whois {
    public static void main(String[] args) throws Exception {
      Socket sock = new Socket("whois.internic.net", 43); //first param - the server, second param - the port
      InputStream input = sock.getInputStream(); //whatever comes in
      OutputStream output = sock.getOutputStream(); //whatever goes out
      //String strng = "infiniteskills.com\n";
      String strng  = "fb.com\n";
      byte buffer[] = strng.getBytes(); //COnvert to bytes befoe sending. Buffer is just name of the array
      output.write(buffer); //This sends ouy our command through the socket
      int ch;
      while ((ch = input.read()) != -1) { //Grabs the contents a they come through the socket
         System.out.print((char) ch); //And we display them. We have to convert byte to char before displaying. 
      }
      sock.close(); //don't forget this!
   }
}