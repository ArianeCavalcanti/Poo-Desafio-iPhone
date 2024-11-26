package aparelhoCelular;

import aparelhoCelular.Music.reproducao;
import aparelhoCelular.Navegador.navegador;
import aparelhoCelular.modelo.telefone;

/**
 *
 * @author arian
 */
public class celular implements navegador, telefone, reproducao {

    // Implementação dos métodos da interface telefone
    @Override
    public void ligar() {
        System.out.println("Ligando para (11)5959-5963");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação...");
    }

    @Override
    public void inicializarVoz() {
        System.out.println("Alô?");
    }

    // Implementação dos métodos da interface reproducao
    @Override
    public void tocar() {
        System.out.println("Tocando uma música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    // Implementação dos métodos da interface navegador
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }
}
