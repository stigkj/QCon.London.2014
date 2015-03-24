package opencrupt;

import lib.UI;

public class Application {
    public static UI createUI() {
        return new UI(new OpenLeeter());
    }

    public static void main(String[] args) {
        System.out.println(createUI().leetMessage(args[0]));
    }
}