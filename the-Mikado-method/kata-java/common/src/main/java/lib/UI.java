package lib;

public class UI {
    private Leeter leeter;

    public UI(Leeter secretLeeter) {
        leeter = secretLeeter;
    }

    public String leetMessage(String unLeeted) {
        String leeted = leeter.leet(unLeeted);
        return "Leeted: " + leeted;
    }
}