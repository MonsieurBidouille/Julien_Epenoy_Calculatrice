package Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calcul {

    public static String calculation(String calcul) {
        String[] nums = calcul.split(" ");
        List<String> linums = new ArrayList<String>();

        for (int i=0 ; i< nums.length ; i++){
            linums.add(nums[i]);
        }

        double res = 0;


        for(int k = 0 ; k<linums.size() ; k++){

            if (Objects.equals(linums.get(k), "*")) {

                    res = Double.parseDouble(linums.get(k - 1)) * Double.parseDouble(linums.get(k + 1));
                    linums.set(k + 1, Double.toString(res));
                    linums.remove(k - 1);
                    linums.remove(k - 1);

            } else if (Objects.equals(linums.get(k), "/")) {
                    res = Double.parseDouble(linums.get(k - 1)) / Double.parseDouble(linums.get(k + 1));
                    linums.set(k + 1, Double.toString(res));
                    linums.remove(k - 1);
                    linums.remove(k - 1);
                }

            }

        for (int j = 0; j< linums.size(); j++) {

            if (Objects.equals(linums.get(j), "+")) {

                res = Double.parseDouble(linums.get(j - 1)) + Double.parseDouble(linums.get(j + 1));
                linums.set(j + 1, Double.toString(res));
                linums.remove(j - 1);
                linums.remove(j - 1);
                j = j-1;
                System.out.println("haha");


            } else if (Objects.equals(linums.get(j), "-")) {


                res = Double.parseDouble(linums.get(j - 1)) - Double.parseDouble(linums.get(j + 1));
                linums.set(j + 1, Double.toString(res));
                linums.remove(j - 1);
                linums.remove(j - 1);
                j = j-1;
            }
        }

        return Double.toString(res);

    }


}