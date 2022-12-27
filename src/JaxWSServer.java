import ws.BanqueServiceImpl;

import javax.xml.ws.Endpoint;

public class JaxWSServer {
  private static final int PORT = 8686;
  private static final String URL = "http://localhost:" + PORT + "/";

  public static void main(String[] args) {
    Endpoint.publish(URL, new BanqueServiceImpl());
    System.out.println("Web service running on port: " + PORT);
  }
}
