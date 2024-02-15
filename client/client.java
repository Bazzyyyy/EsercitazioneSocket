public class Client {
  public static void main(string[] args) throws IOexception {
   string hostName = "local host";
   int port = 12345;


try (Socket socket = new socket(hostName, port);
    bufferedReader in = new bufferedReader(
      new inputStreamReader(socket.getInputStream()))) {
    string fromServer;
    while ((fromServer = in.readLine()) != null) {
       system.out.println("Server: " + fromServer);
       break;
       }
   }
}