import factory.*;
import app.Application;

public class Main {

    public static void main(String[] args) {

        GUIFactory factory;

        String sistema = "Windows";

        if (sistema.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new LinuxFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
