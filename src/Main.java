import com.allan.viacep.api.arquivo.GeradorArquivo;
import com.allan.viacep.api.requisicao.ConsultaCep;
import com.allan.viacep.api.modelo.Endereco;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um número de CEP para a busca: ");
        var cep = sc.nextLine();

        try{
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorArquivo geradorArquivo = new GeradorArquivo();
            geradorArquivo.salvarJson(endereco);
        } catch(RuntimeException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}