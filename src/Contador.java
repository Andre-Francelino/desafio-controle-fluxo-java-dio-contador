import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Entrada dos dois parâmetros via terminal
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número correspondente ao 1º parâmetro: ");
        int primeiroParametro = sc.nextInt();
        System.out.println("Digite o número correspondente ao 2º parâmetro: ");
        int segundoParametro = sc.nextInt();

        try {
            // Chamando método de contagem
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            // Imprimindo mensagem da exceção
            System.out.println(e.getMessage());
        }

        // Fechamento do objeto Scanner
        sc.close();
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        // Verificando se o número do segundo parâmetro é menor que o número do primeiro parâmetro
        if (segundoParametro < primeiroParametro) {
            throw new ParametrosInvalidosException();
        }

        // Atribuindo a variável contagem o valor da diferença entre o segundo e o primeiro parâmetro
        int contagem = segundoParametro - primeiroParametro;

        // fluxo FOR para imprimir os números atribuídos à variável contagem
        for(int i = 1; i <= contagem; i ++) {
            System.out.println("Imprimindo a ocorrência de número " + i);
        }

        System.out.println("Você usou como 1º e 2º parâmetros respetivamente os números " + primeiroParametro + " e " + segundoParametro);
        System.out.println("Tivemos " + contagem + " ocorrências registradas.");
    }
}
