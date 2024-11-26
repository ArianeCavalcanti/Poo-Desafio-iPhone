package aparelhoCelular;

/**
 *
 * @author arian
 */
public class iphoneOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        celular iphoneOne = new celular() {};

        iphoneOne.ligar();
        iphoneOne.atender();
        iphoneOne.inicializarVoz();

        iphoneOne.tocar();
        iphoneOne.pausar();
        iphoneOne.selecionarMusica();

        iphoneOne.exibirPagina();
        iphoneOne.adicionarNovaAba();
        iphoneOne.atualizarPagina();

    }

}
