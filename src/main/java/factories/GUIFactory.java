/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * A interface GUIFactory serve como um contrato para criar elementos de interface gráfica.
 * Ela garante que qualquer classe que a implementar terá métodos para criar um botão e uma caixa de seleção.
 * 
 * @author FATEC ZONA LESTE
 */
public interface GUIFactory {  // Define a interface GUIFactory. Uma interface não implementa métodos, ela apenas define quais métodos as classes que a implementarem precisam fornecer.
    
    // Método que as classes que implementam a interface devem fornecer. Ele cria um botão.
    Button createButton();  
    
    // Método que as classes que implementam a interface devem fornecer. Ele cria uma caixa de seleção.
    Checkbox createCheckbox();  
    
}  
