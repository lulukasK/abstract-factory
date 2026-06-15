package app;

import factory.GUIFactory;
import products.Botao;
import products.Checkbox;

public class Application {

    private Botao botao;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        botao = factory.criarBotao();
        checkbox = factory.criarCheckbox();
    }

    public void renderUI() {
        botao.render();
        checkbox.marcar();
    }
}
