# Sistema de Pedidos de Hamburgueria

## Descrição

Este é um sistema de pedidos para uma hamburgueria, desenvolvido em Java. Ele permite aos clientes fazer pedidos de hambúrgueres e bebidas, consultar pedidos existentes, e cancelar pedidos. O sistema armazena os pedidos em uma lista e oferece um menu interativo no console para que os usuários façam suas escolhas.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos e classes:

1. **Main.java**: Classe principal que contém o menu interativo e a lógica para fazer, consultar e cancelar pedidos.
2. **Hamburguer.java**: Define a classe `Hamburguer`, representando um hambúrguer com nome, descrição e preço. Esta classe também contém uma lista estática de opções de hambúrgueres.
3. **Bebida.java**: Define a classe `Bebida`, representando uma bebida com nome e preço. Esta classe também contém uma lista estática de opções de bebidas.
4. **GuardaPedidos.java**: Define a classe `GuardaPedidos`, que gerencia os pedidos dos clientes. A classe `Pedido` é uma classe interna que representa cada pedido.

## Funcionalidades

### Menu Principal

Ao executar o programa, o usuário é apresentado com um menu principal com as seguintes opções:

1. **Fazer Pedido**: Permite ao usuário fazer um novo pedido, escolhendo um hambúrguer e uma bebida (opcional).
2. **Consultar Pedido**: Lista todos os pedidos existentes e permite ao usuário consultar os detalhes de um pedido específico.
3. **Cancelar Pedido**: Permite ao usuário cancelar um pedido existente.
4. **Sair**: Encerra o programa.

### Fazer Pedido

Ao escolher fazer um pedido, o usuário deve fornecer o nome do cliente e selecionar um hambúrguer e uma bebida (opcional) das listas disponíveis. O hambúrguer e a bebida escolhidos são então confirmados antes de serem adicionados ao pedido.

### Consultar Pedido

O usuário pode listar todos os pedidos existentes e consultar os detalhes de um pedido específico, fornecendo o número do pedido.

### Cancelar Pedido

O usuário pode cancelar um pedido existente, fornecendo o número do pedido. O pedido é removido da lista de pedidos.

## Classes e Métodos

### Main.java

- **main(String[] args)**: Método principal que exibe o menu e lida com a entrada do usuário.
- Menu interativo para fazer, consultar e cancelar pedidos.

### Hamburguer.java

- **Hamburguer(String nome, String descricao, double preco)**: Construtor da classe `Hamburguer`.
- **getNome()**: Retorna o nome do hambúrguer.
- **getDescricao()**: Retorna a descrição do hambúrguer.
- **getPreco()**: Retorna o preço do hambúrguer.
- **getHamburgueres()**: Retorna a lista estática de hambúrgueres.

### Bebida.java

- **Bebida(String nome, double preco)**: Construtor da classe `Bebida`.
- **getNome()**: Retorna o nome da bebida.
- **getPreco()**: Retorna o preço da bebida.
- **getBebidas()**: Retorna a lista estática de bebidas.

### GuardaPedidos.java

- **adicionarPedido(String cliente, Hamburguer hamburguer, Bebida bebida)**: Adiciona um novo pedido à lista de pedidos.
- **consultarTodosPedidos()**: Exibe todos os pedidos existentes.
- **consultarPedido(int numero)**: Exibe os detalhes de um pedido específico.
- **cancelarPedido(int numero)**: Cancela um pedido específico removendo-o da lista de pedidos.

## Execução

Para executar o programa, compile todas as classes e execute a classe `Main`. O menu interativo será exibido no console, permitindo que o usuário faça, consulte e cancele pedidos conforme necessário.
