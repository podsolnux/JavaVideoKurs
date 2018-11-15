package klassen;

public class B extends A {
    public int var;

    public void setVar(int var) {
        this.var = var;
        super.setVar(2 * var);
    }

//    public int getVar(){
//        return var;
//    }

    public void printVar() {
        System.out.println(getVar());
    }
}
