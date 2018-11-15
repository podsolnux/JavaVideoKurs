package klassen;

public class C extends B {
    public int var;

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
//        super.setVar(getVar());
        super.setVar(var);
    }
}
