package Calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculationmkII {

    private static List<Entity> uberlist = new ArrayList<>();

    private static List<Entity> priolist = new ArrayList<>();

    public static double calculation(String str){
        String[] nums = str.split(" ");
        List<String> li = new ArrayList<String>();

        for (int i=0 ; i< nums.length ; i++){
            li.add(nums[i]);
        }

        decomp(li);


        int m = 0;

        for (int i = 0 ; i < uberlist.size() ; i++){
            if(uberlist.get(i).getPrio() >= m ){
                m = uberlist.get(i).getPrio();
            }
        }


        for (int k = m ; k > 0 ; k--){
            for (int j = 0 ; j < uberlist.size() ;j++){
                if (uberlist.get(j).getPrio() == k){
                    Operator op = (Operator)uberlist.get(j);
                    op.calcop(uberlist,j);
                    j--;
                }
            }
        }
        double res = uberlist.get(0).getValue();
        uberlist = new ArrayList<>();;
        priolist = new ArrayList<>();;
        return res;

    }




    public static void decomp(List<String> li){

        for(int i = 0 ; i< li.size() ; i++){
            switch (li.get(i)){
                case "*" : uberlist.add(new Operator(2 , "*")); break;
                case "+" : uberlist.add(new Operator(1 , "+")); break;
                case "/" : uberlist.add(new Operator(2 , "/")); break;
                case "-" : uberlist.add(new Operator(1 , "-")); break;
                default: uberlist.add(new Number(li.get(i)));
                }
            }
        }
    }


