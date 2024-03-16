import java.util.Map;
import java.util.HashMap;

public class alphabetWarAirstrike {
    public static void main(String[] args) {
        Map<String, Integer> diccionarioR = new HashMap<>();
        Map<String, Integer> diccionarioL = new HashMap<>();

        diccionarioR.put("w", 4);
        diccionarioR.put("p", 3);
        diccionarioR.put("b", 2);
        diccionarioR.put("s", 1);

        diccionarioL.put("m", 4);
        diccionarioL.put("q", 3);
        diccionarioL.put("d", 2);
        diccionarioL.put("z", 1);

        String fight = "zz*zzs";
        String[] reFight = fight.split("");

        for (int i = 0; i < reFight.length; i++) {
            if (reFight[i].equals("*")) {
                reFight = reFight.remove(i - 1);

            }
        }

    }

}
