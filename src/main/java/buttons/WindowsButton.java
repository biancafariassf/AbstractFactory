/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buttons;

/**
 *
 * @author FATEC ZONA LESTE
 */

// Aqui temos a classe WindowsButton, que segue a interface Button e diz como o botão vai ser desenhado no sistema Windows.
public class WindowsButton implements Button {

    // Esse método 'paint' é o responsável por mandar uma mensagem pro console quando o botão for criado.
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");  // Mensagem que aparece quando o botão é "desenhado".
    }
}


