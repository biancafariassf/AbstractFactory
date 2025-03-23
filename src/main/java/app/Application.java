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
// A classe Application usa os objetos Button e Checkbox para criar e desenhar uma interface gráfica.
public class Application {
    private Button button;    // Declaração de um botão.
    private Checkbox checkbox; // Declaração de uma caixa de seleção.

    // O construtor recebe (GUIFactory) e usa ela para criar o botão e a caixa de seleção.
    public Application(GUIFactory factory) {
        button = factory.createButton();  // Cria o botão usando a Factory.
        checkbox = factory.createCheckbox(); // Cria a caixa de seleção usando a Factory.
    }

    // Método para desenhar o botão e a caixa de seleção.
    public void paint() {
        button.paint();    // Desenha o botão.
        checkbox.paint();  // Desenha a caixa de seleção.
    }
}
