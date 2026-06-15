package factory;

import products.*;

public class LinuxFactory implements GUIFactory {

    public Botao criarBotao() {
        return new BotaoLinux();
    }

    public Checkbox criarCheckbox() {
        return new CheckboxLinux();
    }
}
