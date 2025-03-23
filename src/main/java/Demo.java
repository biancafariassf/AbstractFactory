
import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */

//O padrão Abstract Factory permite criar famílias de objetos (botões e caixas de seleção) de maneira flexível e desacoplada da implementação concreta.

//Dependendo do sistema operacional, uma fábrica específica (MacOSFactory ou WindowsFactory) é escolhida para criar os componentes gráficos apropriados.

//GUIFactory atua como uma interface abstrata que declara os métodos para criar os componentes gráficos, enquanto as fábricas concretas fornecem as implementações desses métodos.


// A classe Demo configura e executa a criação de uma aplicação com base no sistema operacional.
public class Demo {

    // Método responsável por configurar a aplicação, criando a fábrica correta com base no SO.
    private static Application configureApplication() {
        Application app;  // Declaração da aplicação.
        GUIFactory factory;  // Declaração da fábrica de GUI.
        
        // Obtém o nome do sistema operacional para decidir qual fábrica usar.
        String osName = System.getProperty("os.name").toLowerCase();
        
        // Se o sistema for MacOS, usa a fábrica MacOSFactory, senão usa a WindowsFactory.
        if (osName.contains("mac")) {
            factory = new MacOSFactory();  // Usa a fábrica do MacOS.
        } else {
            factory = new WindowsFactory();  // Usa a fábrica do Windows.
        }
        
        app = new Application(factory);  // Cria a aplicação com a fábrica escolhida.
        return app;  // Retorna a aplicação configurada.
    }

    // Método principal que configura e desenha a interface da aplicação.
    public static void main(String[] args) {
        Application app = configureApplication();  // Configura a aplicação.
        app.paint();  // Desenha a interface da aplicação.
    }
}
