
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Score> scores = new ArrayList<>();
        scores.add(new Score(100, 80));
        scores.add(new Score(60, 90));
        scores.add(new Score(85, 85));


//        scores
//                .stream()
//                .filter(s -> s.getMath() > 80 )
//                .map(s -> s.getScience())
//                .forEach(System.out::println);

//        scores
//                .forEach( s -> {
//                    if(s.getMath() > 80) {
//                        System.out.println(s.getScience());
//                    }
//                });

//        for(Score s: scores) {
//            if (s.getMath() > 80) {
//                System.out.println(s.getScience());
//            }
//        }
    }
}
