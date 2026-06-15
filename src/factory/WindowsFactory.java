package factory;

import products.*;

public class WindowsFactory implements GUIFactory {

    public Botao criarBotao() {
        return new BotaoWindows();
    }

    public Checkbox criarCheckbox() {
        return new CheckboxWindows();
    }
}
