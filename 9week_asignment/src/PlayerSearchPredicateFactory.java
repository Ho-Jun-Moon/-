package com.fm.repository;
import com.fm.unit.Player;
import com.fm.game.SearchCondition;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PlayerSearchPredicateFactory {
    public static List<Predicate<Player>> makeConditions(List<SearchCondition> searchConditions){
            List<Predicate<Player>> data = new ArrayList<>();
            for (SearchCondition condition : searchConditions){
                data.add( (Player p) -> {
                                boolean result = false;
                                switch (condition.getField().toLowerCase()){
                                    case "name":
                                        result = p.getName().toLowerCase().contains(condition.getCondition().toLowerCase());
                                        break;
                                    case "club":
                                        result = p.getClub().toLowerCase().contains(condition.getCondition().toLowerCase());
                                        break;
                                    case "position":
                                        result = p.getPositions().contains(condition.getCondition());
                                        break;
                                    default:
                                                                            result = p.getNationality().toLowerCase().contains(condition.getCondition().toLowerCase());
                                                                            break;
                                                                    }
                                                                    return result;
                            } );
            }
        return data;

    }
}