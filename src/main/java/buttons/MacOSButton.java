/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buttons;

/**
 *
 * @author FATEC ZONA LESTE
 */

// Essa classe aqui é o MacOSButton, que segue o contrato da interface Button e mostra como o botão vai aparecer quando usado no sistema MacOS.
public class MacOSButton implements Button {

    // Esse é o método 'paint', e o que ele faz é basicamente mandar uma mensagem pro console.
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");  // Imprime essa mensagem quando o botão é "desenhado".
    }
}
