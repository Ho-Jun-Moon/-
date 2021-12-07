package com.fm.repository;
import com.fm.unit.Player;
import com.fm.game.SearchCondition;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class PlayerQuery {
    public static List<Player> query(List<Player> players, List<Predicate<Player>> conditions){

               List<Player> result = players.stream().filter(
                    (p) -> {
                        int critical = 0;
                        for (Predicate<Player> condition : conditions){
                            if (condition.test(p)){ critical++;}

                        }
                        if (critical == conditions.size()) return true;
                        else return false;
                    }
               ).collect(toList());

            return result;
    }
}