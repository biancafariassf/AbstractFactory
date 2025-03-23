/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package checkboxes;

/**
 *
 * @author FATEC ZONA LESTE
 */

// Essa classe aqui é responsável por criar uma checkbox (caixa de seleção) no estilo do macOS.
public class MacOSCheckbox implements Checkbox {  

    // Aqui a gente sobrescreve o método paint() pra mostrar a caixa de seleção no jeitão do macOS.
    @Override  
    public void paint() {  
        System.out.println("You have created MacOSCheckbox.");  // Exibe uma mensagem dizendo que a checkbox do macOS foi criada.
    }  
}  
