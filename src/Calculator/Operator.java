package Calculator;

import java.util.List;

public class Operator extends Entity{
    private String type = "op";
    private String oper = "";
    private int prio = 0;
    private int index = 0;
    private double value = 0;

    public Operator(int prio, String oper){
        this.prio = prio;
        this.oper = oper;
    }



    public void multip(List<Entity> li, int i){


        double res = 0.0;
        res = li.get(i-1).getValue() * li.get(i+1).getValue();
        li.get(i + 1).setValue(res);
        li.remove(i - 1);
        li.remove(i - 1);
    }

    public void addi(List<Entity> li, int i){
        double res = 0.0;
        res = li.get(i-1).getValue() + li.get(i+1).getValue();
        li.get(i + 1).setValue(res);
        li.get(i + 1).setPrio(0);
        li.remove(i-1);
        li.remove(i-1);
    }

    public void sous(List<Entity> li, int i){
        double res = 0.0;
        res = li.get(i-1).getValue() - li.get(i+1).getValue();
        li.get(i + 1).setValue(res);
        li.get(i +1).setPrio(0);
        li.remove(i - 1);
        li.remove(i - 1);
    }

    public void divi(List<Entity> li, int i){
        double res = 0.0;
        res = li.get(i-1).getValue() / li.get(i+1).getValue();
        li.get(i + 1).setValue(res);
        li.get(i +1).setPrio(0);
        li.remove(i - 1);
        li.remove(i - 1);
    }


    public void calcop(List<Entity> lis, int in){
        switch (lis.get(in).getOper()){
            case "*" : multip(lis,in); break;
            case "+" : addi(lis,in); break;
            case "/": divi(lis,in);break;
            case "-": sous(lis,in);break;
            default: System.out.println("de rien");
        }
    }

    public double getValue(){
        return 0.0;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public int getPrio(){
        return this.prio;
    }

    public void setPrio(int prio){
        this.prio = prio;
    }

    public String getOper() {
        return oper;
    }
}
