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

// A classe WindowsFactory implementa a GUIFactory e cuida de criar os componentes gráficos no estilo Windows.
public class WindowsFactory implements GUIFactory {

    // Esse método cria um botão no estilo do Windows.
    // Quando chamado, ele devolve um novo WindowsButton.
    @Override
    public Button createButton() {
        return new WindowsButton();  // Aqui cria e retorna um botão específico pro Windows.
    }

    // Esse método aqui faz o mesmo, só que pra checkbox (caixa de seleção).
    // Retorna uma WindowsCheckbox, ou seja, uma checkbox no estilo Windows.
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();  // Cria e devolve a checkbox do Windows.
    }
}
