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
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;

// 자바 IO 의 java.nio.file 패키지를 이용하여 파일 처리를 합니다. (Paths, Files 이용)
// 선수 정보를 파일에 읽고 쓰기 위해 BufferedReader, BufferedWritere 클래스를 사용합니다.
// 파일 입출력 시 IOException 등의 예외를 try/catch/finally 문을 이용해 처리해 줍니다.
// Player 클래스의 객체를 생성하는 역할을 담당하는 PlayerFactory 클래스를 정의하여 사용합니다.

public class FileRepository implements IRepository {
    public static final String[] FILE_HEADER =
            { "sofifa_id", "short_name", "height_cm", "nationality", "club", "overall", "player_positions", "\n" };
    private static FileRepository instance = new FileRepository();
    public final String FILENAME =
            Thread.currentThread().getContextClassLoader().getResource("players_20_short.csv").getFile();
    private boolean loaded = false;
    private List<Player> players;

    private FileRepository(){
        load();
    }

    public static FileRepository getInstance() {return instance;}

    private Player create(String[] fields) {
        return PlayerFactory.createPlayers(fields);
    }

    void load(){
        players = new ArrayList<Player>();
        Charset charset = Charset.forName("UTF-8");
        try {
                BufferedReader br = Files.newBufferedReader(Paths.get(FILENAME), charset);

            String line;
            boolean first = true;
            while((line=br.readLine())!=null) {
                if (first) {first=false; continue;}
                String playerData[] = line.split(",");
                List<String> position = new ArrayList<>();
                for (int i = 6; i < playerData.length; i++){
                    position.add(playerData[i]);
                }
                Player newPlayer = new Player(Integer.parseInt(playerData[0]), playerData[1],Integer.parseInt(playerData[2]), playerData[3], playerData[4], Integer.parseInt(playerData[5]), position);
                players.add(newPlayer);
            }
        }
        catch (IOException e){
            System.err.println(e);
        }
    }

    public int count(){
        return players.size();
    }
    public void save(Player t){
        players.add(t);
//         try {
//             Charset charset = Charset.forName("UTF-8");
//             BufferedWriter bw =  Files.newBufferedWriter(Paths.get(FILENAME), charset);
//             bw.write(Arrays.toString(FILE_HEADER), 0, Arrays.toString(FILE_HEADER).length());
//             for(Player i : players){
//                 bw.write(i.toString(), 0, i.toString().length());
//                 bw.newLine();
//             }
//         }
//         catch (IOException e){
//                     System.err.println(e);
//         }
    }
    public void delete(Player t){
        players.removeIf((p) -> p.equals(t));
//         try {
//             Charset charset = Charset.forName("UTF-8");
//             BufferedWriter bw =  Files.newBufferedWriter(Paths.get(FILENAME), charset);
//             bw.write(Arrays.toString(FILE_HEADER), 0, Arrays.toString(FILE_HEADER).length());
//             for(Player i : players){
//                 bw.write(i.toString(), 0, i.toString().length());
//                 bw.newLine();
//             }
//         }
//         catch (IOException e){
//                     System.err.println(e);
//         }
    }
    public void deleteById(int id){
        players.removeIf((p) -> (p.getId()==id));
    }
    public boolean existsById(int id){
        return players.stream().filter((p)->p.getId()==id).findFirst().isPresent();
    }
    public Iterable<Player> findAll(){
        Iterable<Player> result = players;
        return result;
    }
    public Optional<Player> findById(int id){
        return players.stream().filter((p)->p.getId()==id).findFirst();
    }
    public List<Player> findByConditions(List<Predicate<Player>> conditions){
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