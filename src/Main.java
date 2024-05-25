// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe que representa o iPhone
class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Iphone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico, NavegadorInternet navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }

    public void usarReprodutorMusical() {
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();
    }

    public void usarAparelhoTelefonico() {
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void usarNavegadorInternet() {
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}

// Implementação concreta do Reprodutor Musical
class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}

// Implementação concreta do Aparelho Telefônico
class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}

// Implementação concreta do Navegador na Internet
class NavegadorInternetImpl implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}

// Classe principal para execução do código
public class Main {
    public static void main(String[] args) {
        // Criando instâncias das implementações do Reprodutor Musical, Aparelho Telefônico e Navegador na Internet
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        NavegadorInternet navegador = new NavegadorInternetImpl();

        // Criando uma instância do iPhone e passando as instâncias das implementações como argumentos para o construtor
        Iphone iphone = new Iphone(reprodutor, telefone, navegador);

        // Utilizando as funcionalidades do iPhone
        iphone.usarReprodutorMusical();
        iphone.usarAparelhoTelefonico();
        iphone.usarNavegadorInternet();
    }
}

