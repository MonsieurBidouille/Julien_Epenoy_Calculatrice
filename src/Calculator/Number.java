package Calculator;

public class Number extends Entity{

    private String type = "num";
    private double value = 0;
    private int prio = 0;

    public Number(String val){
        value = Double.parseDouble(val);
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getPrio(){
        return 0;
    }

    public void setPrio(int prio){
        this.prio = prio;
    }


    public String getOper() {
        return "";
    }

}
