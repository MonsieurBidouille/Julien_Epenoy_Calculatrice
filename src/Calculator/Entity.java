package Calculator;

public abstract class Entity {


    public abstract String getType();

    public abstract double getValue();

    public abstract void setValue(double value);
    public abstract int getPrio();

    public abstract void setPrio(int Prio);

    public abstract String getOper();
}
