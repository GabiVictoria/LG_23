# LG_23
Este programa simula um pregão na bolsa de valores. Ele permite que os usuários criem ordens de compra e venda de ações, e que essas ordens sejam executadas de acordo com as regras do mercado.

Os desenvolvedores são:  
Alison Jorge Amaro; 
Emanuel Aguilar Pena; 
Gabrielle Victória Ribeiro Batista; 
Gabriel Tarifa de Oliveira;

User names Github respectivamente:
ffflux;
AguilarPena;
GabiVictoria;
gabi-tarifa;

As entidades que compõem o sistema:
   - Estruturas de dados em memória:Pilha, Fila , Lista, Árvore, todas com alocação encadeada.

  - estrutura / layout  dos arquivos utilizados no armazenamento dos dados.

A aplicação permitirá cadastrar as entidades diversas:

     Investidor; Carteira; Corretora; Ativos (Fundos e Ações); Bolsa; Custodiante

Requisitos mínimos:

    -Histórico de ordens de compra e vendas de ativos.

# Finalidades e Funcionalidades das classes

Investidor: define os investidores que participam das transações e investimentos realizados na bolsa de valores. Dessa forma, no programa é possível criar objetos específicos para os investidores e armazenar os dados pessoais de cada um no código. A classe investidor pode se relacionar com a carteira, com os ativos e com a corretora. Essa classe também permite que os investidores realizem transações de ativos por meio da classe carteira.

Alguma das funcionalidades da classe investidor são:
- permite o cadastro e armazenamento dos dados pessoais dos investidores.
- permite que os investidores gerenciem diversas carteiras.
- registra todas as transações e investimentos realizados por meio da carteira.
- exibe o desempenho ao longo do tempo dos investimentos realizados.

Carteira: essa classe descreve as carteira de investimentos financeiros que pertencem a um investidor que pode ter diversas carteiras, sendo que cada uma representa um conjunto específico de ativos. Essa classe é usada para representar um armazenamento de ativos financeiros, dessa forma é possível verificar os ativos do investidor e acompanhar as transações como compra e venda dos ativos. Além disso, essa classe permite acompanhar o desempenho como preço atual, lucro e perdas relacionadas aos ativos.

Alguma das funcionalidades da classe carteira são:
- permite que o investidor crie várias carteiras e de diferentes tipos (ações, fundos imobiliários, títulos etc).
- registra informações sobre as transações e investimentos realizados na carteira.
- permite o acesso com classe investidor para o registro de dados dos investidores.
- permite que o investidor crie ou remova ativos da carteira de investimentos.
- permite o armazenamento de dados e informações sobre os ativos.

