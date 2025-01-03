import java.util.Optional;
import java.util.Scanner;

public class CalculadoraQuadrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println(" 💻 Bem-vindo à Calculadora Quadrada! 💻");
        System.out.println("Digite números inteiros para calcular o quadrado de números positivos.");
        System.out.println("Digite 'sair' para encerrar o programa.");

        while (continuar) {
            System.out.print("\nDigite um número ou 'sair': ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                continuar = false;
            } else {
                try {
                    int numero = Integer.parseInt(entrada);
                    Optional<Integer> resultado = processaNumero(Optional.of(numero));

                    if (resultado.isPresent()) {
                        System.out.println("Resultado: " + resultado.get());
                    } else {
                        System.out.println("O número não é positivo. Resultado: Optional.empty");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número inteiro.");
                }
            }
        }

        exibirMensagemDeSaida();
        scanner.close();
    }

    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
        if (numero.isPresent() && numero.get() > 0) {
            return Optional.of(numero.get() * numero.get());
        }
        return Optional.empty();
    }

    public static void exibirMensagemDeSaida() {
        System.out.println("\n" + "=".repeat(22) + " 🐱✨ Programa encerrado! ✨🐱 " + "=".repeat(20));
        System.out.println("Desenvolvido por: Jeisa Boaventura");
        System.out.println("GitHub: https://github.com/Caaarolb");
        System.out.println("LinkedIn: https://www.linkedin.com/in/-caroline-boaventura/");
        System.out.println("=" + "=".repeat(68) + "\n");
    }
}
