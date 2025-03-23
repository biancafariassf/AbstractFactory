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

// O padrão Abstract Factory serve pra ajudar a criar vários tipos de objetos relacionados (tipo botões e checkboxes) sem precisar se preocupar com os detalhes de cada implementação.

// Dependendo de qual sistema operacional você tá usando, o código escolhe a fábrica certa (MacOSFactory ou WindowsFactory) pra criar os componentes gráficos que combinam com o SO.

// A GUIFactory funciona como a "planta" geral que define os métodos pra criar esses componentes, e as fábricas específicas (tipo MacOSFactory) colocam a mão na massa e fazem as coisas acontecerem.

// A classe Demo é a responsável por ligar tudo isso e configurar o aplicativo com base no sistema operacional que tá rodando.
public class Demo {

    // Esse método aqui que decide qual fábrica a aplicação vai usar, dependendo do sistema operacional que estiver no ambiente.
    private static Application configureApplication() {
        Application app;  // Criação da variável pra aplicação.
        GUIFactory factory;  // Essa variável vai guardar a fábrica de GUI certa.
        
        // Aqui a gente pega o nome do sistema operacional que está rodando na máquina.
        String osName = System.getProperty("os.name").toLowerCase();
        
        // Se o nome do SO tiver "mac" no meio, ele escolhe a fábrica do MacOS. Senão, vai de Windows mesmo.
        if (osName.contains("mac")) {
            factory = new MacOSFactory();  // Chamou a fábrica pra sistemas MacOS.
        } else {
            factory = new WindowsFactory();  // Caso contrário, segue a fábrica padrão do Windows.
        }
        
        app = new Application(factory);  // Monta a aplicação usando a fábrica escolhida.
        return app;  // E devolve a aplicação já configuradinha.
    }

    // O famoso main, que bota tudo pra rodar. Aqui é onde a mágica acontece!
    public static void main(String[] args) {
        Application app = configureApplication();  // Primeiro configura a aplicação.
        app.paint();  // Depois manda a aplicação desenhar a interface na tela.
    }
}
