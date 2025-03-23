/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * Essa interface aqui, GUIFactory, funciona como um "manual" pra criar os elementos da interface gráfica.
 * Qualquer classe que usar essa interface vai precisar implementar os métodos pra criar um botão e uma caixa de seleção.
 * 
 * @author FATEC ZONA LESTE
 */
public interface GUIFactory {  // Interface que define o que as fábricas precisam fazer. Ela não implementa os métodos, só define a "regra do jogo".
    
    // Método obrigatório que vai ser usado pra criar um botão.
    Button createButton();  
    
    // Outro método obrigatório, mas esse aqui é pra criar a caixa de seleção.
    Checkbox createCheckbox();  
}
