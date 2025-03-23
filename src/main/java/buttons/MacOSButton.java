/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buttons;

/**
 *
 * @author FATEC ZONA LESTE
 */
// A classe MacOSButton implementa a interface Button e define como o botão será desenhado no MacOS.
public class MacOSButton implements Button {

    // Implementação do método 'paint' que imprime uma mensagem no console.
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}

