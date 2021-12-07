import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateMain {
    public static void main(String[] args) {
        Date today = new Date();

        String year = new SimpleDateFormat("yyyy", Locale.KOREA).format(today);
        String month = new SimpleDateFormat("MM", Locale.KOREA).format(today);
        String day = new SimpleDateFormat("dd", Locale.KOREA).format(today);
        String hour = new SimpleDateFormat("dd", Locale.KOREA).format(today);
        String minute = new SimpleDateFormat("dd", Locale.KOREA).format(today);
        String second = new SimpleDateFormat("dd", Locale.KOREA).format(today);
        String day_name = new SimpleDateFormat("E", Locale.KOREA).format(today);
        String week = new SimpleDateFormat("W", Locale.KOREA).format(today);


        System.out.println(year+"년 "+month+"월 " + day + "일");
        System.out.println(year+"-"+month+"-" + day + " " + hour + ":" + minute + ":" + second);
        System.out.println("오늘은 이 달의 " + week + "번째 " + day_name + "요일 입니다.");
    }
}