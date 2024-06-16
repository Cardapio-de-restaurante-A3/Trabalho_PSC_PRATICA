# Sistema de Pedidos de Hamburgueria

## Descrição do Projeto

Este projeto consiste em um sistema de gerenciamento de pedidos para uma lanchonete, onde os clientes podem fazer pedidos de hambúrgueres e bebidas, adicionar observações personalizadas, selecionar um método de pagamento, consultar e cancelar pedidos.

## Estrutura do Projeto

O projeto está dividido em várias classes principais:

1. **Main**
   - A classe Main contém o método principal (`main`) que gerencia o fluxo do programa. É responsável por exibir o menu principal, processar a entrada do usuário e chamar os métodos apropriados nas outras classes para fazer, consultar ou cancelar um pedido.

2. **Pedido**
   - A classe Pedido representa um pedido feito por um cliente. Contém informações sobre o cliente, o hambúrguer e a bebida selecionados, observações adicionais e detalhes do pagamento.

3. **Pagamento**
   - A classe Pagamento representa os detalhes de pagamento de um pedido, incluindo o tipo de pagamento (dinheiro, cartão de crédito, cartão de débito, PIX) e o valor total.

4. **Hamburguer**
   - A classe Hamburguer representa um hambúrguer disponível no cardápio, com nome, descrição e preço.

5. **GuardaPedidos**
   - A classe GuardaPedidos gerencia todos os pedidos feitos pelos clientes, contendo informações sobre o cliente, hambúrguer selecionado, bebida selecionada (opcional), observações e informações de pagamento.

6. **Bebida**
   - A classe Bebida representa uma bebida disponível no cardápio, com nome e preço.

## Funcionamento do Programa

### Menu Principal:

- [1] Fazer Pedido: Inicia o processo de fazer um pedido.
- [2] Consultar Pedido: Exibe todos os pedidos e permite consultar um pedido específico.
- [3] Cancelar Pedido: Cancela um pedido específico pelo número.
- [4] Sair: Encerra o programa.

### Fazer Pedido:

- Solicita o nome do cliente.
- Exibe o menu de hambúrgueres e permite que o cliente escolha um hambúrguer.
- Exibe o menu de bebidas e permite que o cliente escolha uma bebida ou nenhuma bebida.
- Permite que o cliente adicione observações ao pedido.
- Coleta as informações de pagamento do cliente após a seleção dos itens.
- Adiciona o pedido à lista de pedidos.

### Consultar Pedido:

- Exibe todos os pedidos feitos.
- Permite consultar os detalhes de um pedido específico.

### Cancelar Pedido:

- Solicita o número do pedido a ser cancelado.
- Remove o pedido da lista de pedidos.

## Requisitos

- **Java:** Certifique-se de ter o JDK instalado para compilar e executar o programa.

## Observações

- A lista de hambúrgueres e bebidas é inicializada com itens pré-definidos.
- O programa está preparado para lidar com entradas inválidas e solicitações de repetição para opções inválidas.
- O sistema é simples e pode ser estendido com funcionalidades adicionais, como persistência de dados em banco de dados ou interface gráfica.
