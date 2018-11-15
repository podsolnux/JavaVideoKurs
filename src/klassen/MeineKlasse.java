package klassen;
class MeineKlasse {
    private int variable;

    private void setVariable(int variable) {
        this.variable = variable;
    }

    public int getVariable() {
        return variable;
    }

    private MeineKlasse() {
        setVariable(0);
    }
}
