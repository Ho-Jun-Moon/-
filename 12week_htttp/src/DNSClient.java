import java.util.Optional;
import java.net.*;
import java.util.Scanner;

public class DNSClient {
    public static Optional<String> url = Optional.empty();
    public static Optional<String> query(String str){
        try {
            InetAddress addresses[];
            addresses = InetAddress.getAllByName(str);
            String tmp = addresses[0].toString().split("/")[1];
            System.out.println(tmp);
            url.of(tmp);
        } catch (UnknownHostException ex) {
            System.err.println(ex);
        }

        return url;
    }
    public static void main(String[] args) {
                try(Scanner scanner = new Scanner(System.in)) {
                    String urlString = scanner.nextLine();
                    Optional<String> address = DNSClient.query(urlString);
                    if (address.isPresent()) System.out.println(address.get());
                    else System.out.println("Nope");
                }
    }
}
