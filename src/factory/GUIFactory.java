package factory;

import products.Botao;
import products.Checkbox;

public interface GUIFactory {
    Botao criarBotao();
    Checkbox criarCheckbox();
}
