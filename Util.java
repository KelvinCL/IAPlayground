package teste;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Util {

  public static Double getMaxQ(List<Double> defaultList, Map<String, ArrayList<Double>> qTable,
                               String comb) {
    if (qTable.get(comb) == null) {
      qTable.put(comb, new ArrayList<Double>(defaultList));
      return 0.0;
    } else {
      double max = Integer.MIN_VALUE;
      List<Double> aux = qTable.get(comb);

      for(int i = 0; i < aux.size(); i++) {
        if (aux.get(i) > max) {
          max = aux.get(i);
        }
      }

      return max;
    }
  }

  public static int getBestAction(List<Double> defaultList, Map<String, ArrayList<Double>> qTable,
                                  String comb) {
    if (qTable.get(comb) == null) {
      qTable.put(comb, new ArrayList<Double>(defaultList));
      return 0;
    } else {
      double max = Integer.MIN_VALUE;
      int action = 0;
      List<Double> aux = qTable.get(comb);

      for(int i = 0; i < aux.size(); i++) {
        if (aux.get(i) > max) {
          action = i;
          max = aux.get(i);
        }
      }

      return action;
    }
  }

  public static int getRandom() {
    Random rand = new Random();
    int  n = rand.nextInt(3) + 0;

    return n;
  }
}