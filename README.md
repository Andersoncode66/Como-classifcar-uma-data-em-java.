# Como classificar uma data em java.

## Índice
1. Introdução
2. Descrição
3. Tecnologias utilizadas
4. Como utilizar
5. Exemplos de uso
- DataExemplo1
- DataExemplo2
- DataExemplo3
- DataExemplo4
6. Contribuição 
7. Licença
8. Conclusão


## Introdução
Este repositório foi criado para demonstrar como classificar e comparar datas em Java utilizando a API java.time. Inclui exemplos práticos de como ordenar listas de datas, comparar datas específicas e implementar comparadores personalizados para objetos que contêm datas. Este material é ideal para quem deseja aprimorar suas habilidades em manipulação de datas e entender as melhores práticas para trabalhar com datas no Java.



## Descrição
Este repositório contém exemplos de código que mostram como classificar e comparar datas em Java utilizando a API java.time, introduzida no Java 8. Ele abrange métodos essenciais para ordenar listas de datas (LocalDate, LocalDateTime), bem como técnicas para comparar datas usando Comparator e métodos utilitários como isBefore, isAfter, e isEqual. Este repositório é uma referência útil para desenvolvedores que desejam entender e aplicar a manipulação de datas em seus projetos Java.


## Tecnologias utilizadas
java

## Como utilizar
1. Clone este repositório para o seu ambiente local.
2. Compile e execute os arquivos Java para ver os exemplos em ação.


## Exemplos de uso

### DataExemplo1
Este exemplo demonstra como classificar uma lista de datas em Java utilizando a classe LocalDate e as funções de ordenação fornecidas por Collections.sort() e Comparator.reverseOrder().

![DataExemplo1](https://github.com/user-attachments/assets/87494d1f-c001-4208-b3cd-1bd9d6a7643b)


### Funcionalidades
- Classificação Crescente: O código classifica uma lista de datas em ordem crescente, ou seja, da data mais antiga para a mais recente.
  
- Classificação Decrescente: Após a classificação crescente, a lista de datas é classificada em ordem decrescente, ou seja, da data mais recente para a mais antiga.


### Estruturass do Código
#### Importações

![importações1](https://github.com/user-attachments/assets/d0e2e55d-0ebe-4845-93cd-40d398583cb4)


### Criação da Lista de Datas
Uma lista de datas ('List<LocalDate>') é criada utilizando a classe 'ArrayList.' Datas específicas são adicionadas usando o método 'LocalDate.of(ano, mês, dia)'.

![importações1](https://github.com/user-attachments/assets/0491bd3f-afc8-4ade-9ee8-b5cace8d8289)

### Classificação em Ordem Crescente
A lista de datas é classificada em ordem crescente utilizando 'Collections.sort()'.

![ordem](https://github.com/user-attachments/assets/8e6ff839-9832-45e1-b9d8-94edaaf6f4e0)

Após a classificação crescente, a lista de datas é classficada em ordem decrescente utilizando 'Comparator.reverseOrder()'.


### Classificação em Ordem Decrescente
Após a classificação crescente, a lista de datas é classificada em ordem decrescente utilizando 'Comparator.reverseOrder().'

![crescente](https://github.com/user-attachments/assets/a1ada203-33e6-480f-b6c9-4e839320e29c)


### Exibição dos Resultados
Os resultados das classificações são impressos no console.

![exibição](https://github.com/user-attachments/assets/2fbedd3e-2ec5-427c-8177-e35294477c35)

### Como Executar
1. Certifique-se de ter o JDK instalado em sua máquina.
2. Clone o repositório ou copie o código para seu ambiente de desenvolvimento.
3. Compile o código com 'javac DataExemplo1.java.'
4. Execute o programa com 'java DataExemplo1.'


### Resultado Esperado
Ao executar o código, o seguinte resultado será exibido no console:
![resultado](https://github.com/user-attachments/assets/ee4559e6-b9ba-4f90-9965-86c07625c83e)





### DataExemplo2
![data](https://github.com/user-attachments/assets/e852e588-f829-4665-9407-01fc6d779fd7)
O objetivo deste projeto é ilustrar como manipular listas de datas no Java e realizar operações de ordenação. A classe LocalDate, parte da API de datas do Java, é usada para armazenar as datas. O exemplo utiliza Comparator.naturalOrder() para classificar as datas em ordem crescente e Comparator.reverseOrder() para classficá-las em ordem decrescente.

#### Tecnologia Utilizadas
- Java8 ou superior: A API de datas (java.time.LocalDate) foi introduzida no Java 8.
- LinkedList: Usada para armazenar as datas. É uma implementação de lista encadeada.
- Comparator: Utilizado para ordenar a lista de datas tanto em ordem crescente quanto descrescente.

#### Estrutura do Código

1. Criação da Lista de Datas

![tela1](https://github.com/user-attachments/assets/bb1492db-28a9-40bd-a864-970178b4806f)

Neste trecho, criamos uma lista de datas usando a LinkedList e adicionamos algumas datas utilizando o método LocalDate.of().

2. Ordenação em Ordem Crescente

![tela2](https://github.com/user-attachments/assets/c003eb0f-d83a-4156-af77-dbc6641ef7c1)

Utilizamos o método sort() da interface List e passamos o Comparator.naturalOrder() para ordenar as datas em ordem crescente.

4. Ordenação em ordem Descrecente

![tela 3](https://github.com/user-attachments/assets/e538f7c2-b72b-42af-aa9f-e3751ebea06b)

Para ordernar as datas em ordem descrecente, usamos Comparator.reverseOrder().

6. Exibição das Datas

O código imprime as datas após a ordenação, tanto em ordem crescente quanto em ordem decrescente:

![tela 4](https://github.com/user-attachments/assets/4ba5b415-56f1-45f5-8e9f-3948bafe6340)

8. Saída esperada

O código irá exibir as datas classificadas em ordem crescente e, em seguida, em ordem descrecente:

![resultado2](https://github.com/user-attachments/assets/d665ecd2-f284-433a-a4dd-cf9fd820a7cd)






