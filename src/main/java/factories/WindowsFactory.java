/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

/**
 *
 * @author FATEC ZONA LESTE
 */
// A classe WindowsFactory implementa a interface GUIFactory.
// WindowsFactory é responsável por criar os componentes gráficos específicos para o sistema operacional Windows.
public class WindowsFactory implements GUIFactory {

    // Este método cria um botão específico para o Windows.
    // Quando chamado, ele retorna um novo objeto da classe WindowsButton, que é uma implementação do botão para o Windows.
    @Override
    public Button createButton() {
        return new WindowsButton(); // Retorna um botão Windows.
    }

    // Este método cria uma caixa de seleção específica para o Windows.
    // Quando chamado, ele retorna um novo objeto da classe WindowsCheckbox, que é uma implementação da caixa de seleção para o Windows.
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox(); // Retorna uma caixa de seleção Windows.
    }
}

