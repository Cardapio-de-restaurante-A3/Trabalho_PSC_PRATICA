# Sistema de Gestão de Pedidos

Este projeto é um sistema de gerenciamento de pedidos para uma lanchonete. O sistema permite que os clientes façam pedidos de hambúrgueres e bebidas, além de adicionar observações ao pedido, selecionar um método de pagamento, consultar e cancelar pedidos.

## Estrutura do Projeto

O projeto está dividido em várias classes principais:

1. **Main**
2. **Pagamento**
3. **Hamburguer**
4. **GuardaPedidos**
5. **Bebida**

### 1. Main

A classe `Main` contém o método principal (`main`) que gerencia o fluxo do programa. É responsável por exibir o menu principal, processar a entrada do usuário e chamar os métodos apropriados nas outras classes para fazer, consultar ou cancelar um pedido.

### 2. Pagamento

A classe `Pagamento` representa os detalhes de pagamento de um pedido. Inclui o tipo de pagamento (dinheiro, cartão de crédito, cartão de débito, PIX) e o valor total.

- **Construtor:** `Pagamento(String tipo, double valor)`
- **Métodos:**
  - `getTipo()`: Retorna o tipo de pagamento.
  - `getValor()`: Retorna o valor do pagamento.
  - `toString()`: Retorna uma string com os detalhes do pagamento.
  - `static coletarPagamento(Scanner sc, double total)`: Método estático que coleta as informações de pagamento do usuário.

### 3. Hamburguer

A classe `Hamburguer` representa um hambúrguer disponível no cardápio. Cada hambúrguer tem um nome, descrição e preço.

- **Construtor:** `Hamburguer(String nome, String descricao, double preco)`
- **Métodos:**
  - `getNome()`: Retorna o nome do hambúrguer.
  - `getDescricao()`: Retorna a descrição do hambúrguer.
  - `getPreco()`: Retorna o preço do hambúrguer.
  - `toString()`: Retorna uma string com os detalhes do hambúrguer.
  - `static getHamburgueres()`: Método estático que retorna uma lista de todos os hambúrgueres disponíveis.

### 4. GuardaPedidos

A classe `GuardaPedidos` gerencia todos os pedidos feitos pelos clientes. Cada pedido contém o nome do cliente, hambúrguer selecionado, bebida selecionada (opcional), observações e informações de pagamento.

- **Classe Interna `Pedido`:** Representa um pedido individual.
- **Métodos:**
  - `adicionarPedido(String cliente, Hamburguer hamburguer, Bebida bebida, List<String> observacoes, Pagamento pagamento)`: Adiciona um novo pedido.
  - `consultarTodosPedidos()`: Exibe todos os pedidos feitos.
  - `consultarPedido(int numero)`: Consulta um pedido específico pelo número.
  - `cancelarPedido(int numero)`: Cancela um pedido específico pelo número.

### 5. Bebida

A classe `Bebida` representa uma bebida disponível no cardápio. Cada bebida tem um nome e um preço.

- **Construtor:** `Bebida(String nome, double preco)`
- **Métodos:**
  - `getNome()`: Retorna o nome da bebida.
  - `getPreco()`: Retorna o preço da bebida.
  - `toString()`: Retorna uma string com os detalhes da bebida.
  - `static getBebidas()`: Método estático que retorna uma lista de todas as bebidas disponíveis.

## Funcionamento do Programa

1. **Menu Principal:**
   - **[1] Fazer Pedido:** Inicia o processo de fazer um pedido.
   - **[2] Consultar Pedido:** Exibe todos os pedidos e permite consultar um pedido específico.
   - **[3] Cancelar Pedido:** Cancela um pedido específico pelo número.
   - **[4] Sair:** Encerra o programa.

2. **Fazer Pedido:**
   - Solicita o nome do cliente.
   - Exibe o menu de hambúrgueres e permite que o cliente escolha um hambúrguer.
   - Exibe o menu de bebidas e permite que o cliente escolha uma bebida ou nenhuma bebida.
   - Permite que o cliente adicione observações ao pedido.
   - Coleta as informações de pagamento do cliente.
   - Adiciona o pedido à lista de pedidos.

3. **Consultar Pedido:**
   - Exibe todos os pedidos feitos.
   - Permite consultar os detalhes de um pedido específico.

4. **Cancelar Pedido:**
   - Solicita o número do pedido a ser cancelado.
   - Remove o pedido da lista de pedidos.

## Requisitos

- **Java:** Certifique-se de ter o JDK instalado para compilar e executar o programa.

## Observações

- A lista de hambúrgueres e bebidas é inicializada com itens pré-definidos.
- O programa está preparado para lidar com entradas inválidas e solicitações de repetição para opções inválidas.
- O sistema é simples e pode ser estendido com funcionalidades adicionais, como persistência de dados em banco de dados ou interface gráfica.
