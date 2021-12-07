package com.fm.repository;
import com.fm.unit.Player;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.fm.repository.PlayerFactory;
import java.lang.Iterable;
import java.util.Optional;
import java.util.function.Predicate;;
import static java.util.stream.Collectors.toList;

// 사용자 입력으로부터 새로운 선수를 생성하려고 하니 선수 ID 를 생성해야 합니다.
// 파일에서 선수 정보를 읽어서 Player 클래스의 객체를 생성할 때는 선수 ID 가 존재했습니다.
// 그러나, 새로운 선수를 등록 시 Player 클래스에서 새로운 선수 ID 를 생성해 줘야 합니다. (unique)
// Player 클래스에 선수 ID 관리 역할을 부여합니다.
// 선수 비교를 위해 equals(), hashCode() 메서드로 오버라이드 해 줍니다.
// 파일에 선수 정보를 기록할 때 사용하도록 toString() 메서드 역시 수정해 줍니다.

public class PlayerFactory {
    public static Player createPlayersWithoutID(String[] fields){
         List<String> position = new ArrayList<>();
                for (int i = 6; i < fields.length; i++){
                    position.add(fields[i]);
                }
        Player newPlayer = new Player(fields[0],Integer.parseInt(fields[1]), fields[2], fields[3], Integer.parseInt(fields[4]), position);
        return newPlayer;
    }

    public static Player createPlayers(String[] fields){
                List<String> position = new ArrayList<>();
                for (int i = 6; i < fields.length; i++){
                    position.add(fields[i]);
                }
        Player newPlayer = new Player(Integer.parseInt(fields[0]), fields[1],Integer.parseInt(fields[2]), fields[3], fields[4], Integer.parseInt(fields[5]), position);
                return newPlayer;
    }
}