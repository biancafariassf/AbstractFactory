/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 *
 * @author FATEC ZONA LESTE
 */

// A classe Application é tipo a "central de controle" que usa o Button e o Checkbox pra montar a interface gráfica.
public class Application {
    private Button button;    // Aqui tá o botão que vai ser criado.
    private Checkbox checkbox; // E aqui a checkbox (caixa de seleção) que também vai ser criada.

    // O construtor recebe uma GUIFactory e usa ela pra fabricar o botão e a caixa de seleção, tudo de acordo com o SO.
    public Application(GUIFactory factory) {
        button = factory.createButton();  // Cria o botão usando a fábrica recebida.
        checkbox = factory.createCheckbox(); // Mesma coisa aqui, só que agora pra checkbox.
    }

    // Esse método aqui é o responsável por desenhar os componentes criados (botão e checkbox).
    public void paint() {
        button.paint();    // Chama o método pra desenhar o botão.
        checkbox.paint();  // E desenha a checkbox também.
    }
}
