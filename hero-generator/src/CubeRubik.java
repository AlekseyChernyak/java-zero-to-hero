import java.util.ArrayList;
import java.util.Collections;

public class CubeRubik {
    public static int rand (){
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int rand = (int) (Math.random() * range) + min;
            list.add(rand);
        }

        int grade = 0;
        for (int sum : list) {
            grade+=sum;
        }

        return grade - Collections.min(list);
    }

}
