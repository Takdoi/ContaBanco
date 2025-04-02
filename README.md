:::: DESAFIO: SIMULANDO UMA CONTA BANCÁRIA ATRAVÉS DO TERMINAL/CONSOLE - DIO JAVA NATIVE CLOUD ::::

# ContaTerminal.java

Este é um simples projeto em Java que simula a criação de uma conta bancária, inspirado no desafio **Simulando uma Conta Bancária através do Terminal/Console** da plataforma **Digital Innovation One (DIO)**. O código solicita ao usuário informações básicas sobre sua conta, como número da conta, agência, nome do cliente e saldo. Após coletar os dados, ele exibe as informações inseridas de forma clara e organizada.

## Descrição

O programa realiza as seguintes tarefas:
1. Solicita ao usuário o número da conta bancária.
2. Solicita ao usuário a agência bancária.
3. Solicita ao usuário o nome do cliente.
4. Solicita ao usuário o saldo da conta e trata o valor inserido, substituindo a vírgula por ponto para garantir a conversão correta para número decimal.
5. Exibe as informações inseridas de forma clara para o usuário.
6. Finaliza o programa de maneira eficiente, garantindo a liberação de recursos.

## Lógica Aplicada

A lógica do programa é bastante simples e direta:

1. **Leitura de Dados**: Utilizamos a classe `Scanner` para capturar os dados inseridos pelo usuário através do terminal. O programa lê o número da conta, a agência, o nome do cliente e o saldo.
2. **Tratamento de Entrada**: 
   - O número da conta e a agência são lidos como `String`, o que permite a inclusão de caracteres especiais como hífens, típicos no formato de números de contas bancárias.
   - O saldo é lido como uma `String`, e caso o valor possua uma vírgula (característica de países como o Brasil), a vírgula é substituída por ponto antes da conversão para o tipo `double`. Isso garante que a conversão ocorra sem problemas.
3. **Exibição dos Dados**: Após a coleta das informações, o programa exibe um resumo das informações inseridas pelo usuário, confirmando a criação da conta bancária.
4. **Fechamento de Recursos**: O objeto `Scanner` é fechado após o uso para garantir a liberação de recursos do sistema, prevenindo vazamento de memória.

## Boas Práticas de Programação

O código segue várias boas práticas de programação, como:

1. **Clareza na Interação com o Usuário**: As mensagens exibidas ao usuário são claras e ajudam a guiar o processo de inserção de dados, tornando o programa fácil de usar.
2. **Gerenciamento Adequado de Recursos**: O uso da classe `Scanner` é gerenciado corretamente, e o fechamento do `Scanner` após o uso evita o vazamento de memória.
3. **Organização do Código**: O código está organizado de forma simples e direta, com a lógica de entrada e saída bem definida. Cada passo do processo é claramente separado.
4. **Tratamento de Dados**: A substituição da vírgula por ponto antes de converter o valor do saldo para `double` garante que a entrada de dados seja corretamente interpretada e convertida para um tipo numérico, o que é essencial em sistemas que envolvem valores monetários.
5. **Boas Práticas de Nomenclatura**: Os nomes das variáveis seguem a convenção de nomenclatura de Java, utilizando camelCase, e os nomes são descritivos, facilitando a leitura e compreensão do código.

## Como Usar

1. Clone este repositório para sua máquina local:
   ```bash
   git clone https://github.com/Takdoi/conta-terminal.git
