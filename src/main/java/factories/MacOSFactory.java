/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

/**
 *
 * @author FATEC ZONA LESTE
 */
// A classe MacOSFactory implementa a interface GUIFactory.
// MacOSFactory é responsável por criar os componentes gráficos específicos para o sistema operacional macOS.
public class MacOSFactory implements GUIFactory {

    // Este método cria um botão específico para o macOS.
    // Quando chamado, ele retorna um novo objeto da classe MacOSButton, que é uma implementação do botão para o macOS.
    @Override
    public Button createButton() {
        return new MacOSButton();  // Retorna um botão macOS.
    }

    // Este método cria uma caixa de seleção específica para o macOS.
    // Quando chamado, ele retorna um novo objeto da classe MacOSCheckbox, que é uma implementação da caixa de seleção para o macOS.
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();  // Retorna uma caixa de seleção macOS.
    }
}

