package com.fm.client;
import com.fm.search.SearchField;
import com.fm.search.SearchCondition;
import com.fm.server.PlayerServer;
import com.fm.unit.Player;
import java.util.Scanner;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.http;

public class PlayerClient {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SearchCondition> searchConditions = new ArrayList<>();
        boolean success = false;
        while (scanner.hasNext()) {
            String option = scanner.nextLine();
            String[] params = option.split(":");
            switch (params[0]) {
                case "club":
                case "nationality":
                case "name":
                case "position":
                    success = searchConditions.add(new SearchCondition(SearchField.fromString(params[0]), params[1]));
                    break;
                case "search":
                    success = searchPlayer(searchConditions);
                    break;
                case "quit":
                default:
                    success = false;
            }
            if (!success) break;
        }
        scanner.close();
    }

    private static boolean searchPlayer(List<SearchCondition> searchConditions) {
        String path = "/players?";
        String baseURL = "http://localhost:9000";
        QueryString qs = new QueryString();
        ObjectMapper mapper = new ObjectMapper();
        for (SearchCondition sc : searchConditions){
            qs.add(sc.getField().toString(), sc.getCondition());
        }
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(baseURL + path + qs))
        .timeout(Duration.ofMinutes(1))
        .header("Content-Type", "application/json")
        .GET()
        .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode()==200){
                CollectionType playerListType = mapper.getTypeFactory().constructCollectionType(List.class, Player.class);
                List<Player> result = mapper.readValue(request.getRequestBody(), playerListType);
            }
        } catch (IOException ex) {
        System.err.println(ex);
        } catch (InterruptedException ex) {
        System.err.println(ex);
        }
        List<integer> tmp = new ArrayList<>();

        for(Player p : result){
            tmp.add(p.getId());
        }
        System.out.println(tmp);
//         List<Predicate<Player>> conditions = PlayerSearchPredicateFactory.makeConditions(searchConditions);
//         IRepository repository = FileRepository.getInstance();
//         List<Player> result = repository.findByConditions(conditions);
//         System.out.printf("%d - %s\n", result.size(), result);
//         searchConditions.clear();
//         return true;


    }

}
