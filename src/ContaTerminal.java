import java.util.Scanner; // Importando a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando o objeto Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Exibindo as mensagens para o usuário
        System.out.println("Por favor, digite o número da sua conta:");
        String numero = scanner.nextLine(); // Lê o número da conta como String (permitindo o hífen)
        
        System.out.println("Por favor, digite a sua agência:");
        String agencia = scanner.nextLine(); // Lê a agência

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine(); // Lê o nome do cliente

        System.out.println("Por favor, digite o seu saldo:");
        // Lê o saldo como String e substitui a vírgula por ponto (caso necessário)
        String saldoInput = scanner.nextLine();
        saldoInput = saldoInput.replace(",", "."); // Substitui a vírgula por ponto
        double saldo = Double.parseDouble(saldoInput); // Converte para double

        // Exibindo a mensagem final com as informações da conta criada
        System.out.println("Conta criada com sucesso!");
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: R$ " + saldo);

        // Fechando o scanner para evitar vazamento de memória
        scanner.close();
    }
}