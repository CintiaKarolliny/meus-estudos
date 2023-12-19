## 15/12

## Configuração Java

### Siglas técnicas

- JSE (Java Standard Edition) - É um conjunto de bibliotecas e ferramentas que fornecem a funcionalidade básica necessária para desenvolver aplicativos Java.

- SDK (Software Development Kit) - Pode se referir a um conjunto de ferramentas de desenvolvimento para qualquer tipo de software, não apenas para Java. Ele inclui ferramentas para diferentes linguagens de programação e plataformas.

### Ferramentas específicas para Java:

- JDK (Java Development Kit) - Conjunto de ferramentas que permite o desenvolvimento de aplicativos Java. Ele inclui o compilador Java, bibliotecas, ferramentas de depuração e outras utilidades necessárias para criar e executar programas Java.

- JVM  (Java Virtual Machine) - É uma máquina virtual que permite a execução de programas Java em diferentes plataformas sem a necessidade de recompilação. A JVM interpreta o código Java compilado e o traduz para a linguagem de máquina específica da plataforma em que está sendo executada.

- JRE (Java Runtime Environment) - É um pacote de software que fornece o ambiente de execução necessário para executar aplicativos Java. Ele inclui a JVM, bibliotecas e outros componentes necessários para executar programas Java.

### Representação Gráfica

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/abf5b7c8-a7cf-4bad-b590-48125886145d/1b4965df-6205-4f84-837e-a74b0f5c9eb2/Untitled.png)

### Recomendações de leitura:

1. Java: The Complete Reference - Herbert Schildt
2. Thinking in Java - Bruce Eckel
3. Core Java Volume I - Fundamentals - Cay S. Horstmann

### Instalação JDK

1. Instale o JDK em seu ambiente local
2. Link para baixar o JDK [https://jdk.java.net](https://jdk.java.net/)
3. Configure as Variáveis de Ambiente
4. Execute o comando ‘java -version’ e ‘javac -version’. Você deve ver o resultado no console. A versão do Java deve ser a mesma que a versão do Javac.

### Primeira aplicação com console: Hello World

Aplicação que trabalha com input e output de dados e erros pelo próprio console. Não possui interface e é usado basicamente para estudos simples.

- Classes sempre possuem nomes em que cada palavra começa com letra maiúscula: NomeClasse
- Métodos sempre possuem nomes, onde a primeira palavra começa com minúscula e as demais palavras, maiúsculas: nomeMetodo
- Constantes possuem nomes em que cada palavra começa com maiúsculas e são separadas por underscore _ : Nome_Constante

Criar arquivo .java pelo terminal:

* criar pasta
* abrir terminal, digitar “notepad [HelloWorld.java](http://HelloWorld.java)” → clicar “yes”

```java
public class HelloWorld {
		public static void main(String[ ] args) {
				System.out.println("Hello World");
		}
}
```

* voltar ao terminal, digitar “javac HelloWorld.java” para converter o arquivo para .class
* digitar “java HelloWorld” roda o programa e retorna o que foi criado no arquivo no notepad

Uso correto de comentários no código: [HW - Comments](https://docs.google.com/document/d/1Zh60MWoy3WfDQaUzcw7r0kJIPITbVl0pSdKDFufJ-Fs/edit)

### Tipos primitivos e variáveis

Toda variável e expressão possuem um tipo definido, pois Java é uma linguagem fortemente tipada:

- Integers: int, byte, short
- Floating - point: float, double
- Booleans: bool
- Character: char

| Tipos | Tamanho | Valor min | Valor max |
| --- | --- | --- | --- |
| byte | 1 bytes | -128 | 127 |
| short | 2 bytes | -32.768 | 32.767 |
| int | 4 bytes | -2.147,463,648 | 2.147,463,647 |
| long | 8 bytes | -9.223,372,036,854,755,808 | 9.223,372,036,854,755,807 |
| float | 4 bytes | 1.175494351 E - 38 | 3,402823466 E + 38 |
| double | 8 bytes | 2.2250738585072014 E - 308 | 1,7976931348623158 E + 308 |
| boolean | Depende da Máquina Virtual | True / False | False / True |
| char | 2 bytes | 0 | 65.535 |

Variável: pedaço de memória que contém um tipo e um valor definidos a ela, assim como um escopo (public, private). NÃO USAR PALAVRAS-CHAVE PRÓRPIAS DO JAVA.

Ao serem inicializadas, elas podem ter valor definido ou não:

```java
byte b1 = 1;
byte b2; 
```

### Sistemas de numeração

- Decimal: Base 10 (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
- Binário: Base 2 (0, 1)
- Octal: Base 8 (0, 1, 2, 3, 4, 5, 6, 7)
- Hexadecimal: Base 16 (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)

Binário: 

Possui radical 2

O cabeçalho da tabela equivalem a quantidade de vezes que 2 deve ser exponenciado (ou multiplicado por ele mesmo), mas a exponenciação só é realizada se estiver o número 1 abaixo de cada bit. 

Ou seja:

1 = True
0 = False

| Bit 7 (2^7) | Bit 6 (2^6) | Bit 5 (2^5) | Bit 4 (2^4) | Bit 3 (2^3) | Bit 2 (2^2) | Bit 1 (2^1) | Bit 0 (2^0) |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | 0 | 1 | 1 | 0 | 1 | 0 | 1 |

Resultado: 

(2^7) + (2^5) + (2^4) + (2^2) + (2^0) = 
128 + 32 + 16 + 4 + 1 = 181

### Octal

Possui radical 8

Começando do 0, o número decimal é posto da esquerda para a direita em uma tabela, onde os números de cada coluna do cabeçalho são a quantidade de vezes em que 8 será exponenciado (ou multiplicado por ele mesmo) e depois, multiplicado pelo número abaixo dele: 

| 3 (8^3) | 2 (8^2) | 1 (8^1) | 0 (8^0) |
| --- | --- | --- | --- |
| 7 | 2 | 0 | 5 |
8^3 * 7 + 8^2 * 2 + 8^1 * 0 + 8^0 * 5 =
512 * 7 + 64 * 2 + 8 * 0 + 1 * 5 =
3.584 + 128 + 0 + 5 = 3.717

### Hexadecimal

Possui radical 16

0 a 9 e A a F

A= 10
B = 11
C = 12
D = 13
E = 14
F = 15

Possui a mesma premissa do Octal: 

Começando do 0, o número decimal é posto da esquerda para a direita em uma tabela, onde os números de cada coluna do cabeçalho são a quantidade de vezes em que 16 será exponenciado (ou multiplicado por ele mesmo) e depois, multiplicado pelo número abaixo dele: 

| 3 (16^3) | 2 (16^2) | 1 (16^1) | 0 (16^0) |
| --- | --- | --- | --- |
| 1 | 3 | A | E |

16^3 * 1 + 16^2 * 3 + 16^1 * A + 16^0 * E =
16^3 * 1 + 16^2 * 3 + 16^1 * 10 + 16^0 * 14 =
4.096 * 1 + 256 * 3 + 16 * 10 + 1 * 14 =
4.096 + 768 + 160 + 14 = 5.038

### Utilização no Java

- int dec = 152;
- int bin = 0b10011000;
- int oct = 0230;
- int hex = 0x98;

ao printar eles, veremos que, após os cálculos, todos resultarão no mesmo número na base decimal:

```java
System.out.println(dec); // 152
System.out.println(bin); // 152
System.out.println(oct); // 152
System.out.println(hex); // 152
```

### Arrays

Ao invés de criar várias variáveis para guardar valores diferentes, porém com o mesmo tipo de dado, os arrays são mais indicados, pois são objetos que guardam vários valores que possuem o mesmo tipo e ainda facilitam o acesso a cada um dos itens guardados por meio de index.

Imagine uma lista de números inteiros, mas quero acessar apenas o 5º número.

Para que isso aconteça, deve-se entender que mesmo que haja 5 numeros, as posições deles não começam pelo número 1, ou seja, na verdade, o primeiro número está na posição 0.

Há 5 números, 5 posições (quantidade de valores dentro dele) na lista, mas o array começa pelo 0:

| Valores do Array | 10 | 26 | 140 | 85 | 207 |
| --- | --- | --- | --- | --- | --- |
| Posições | 1º | 2º | 3º | 4º | 5º |
| index | 0 | 1 | 2 | 3 | 4 |

então se eu quero acessar o 4º número salvo na lista:

index 3 da lista = 4º número = 85

### Utilização em Java:

Lista normal:

```jsx
int[ ] lista = {10, 26, 140, 85, 207};

System.out.println(lista[3]); //Resultado: 85
```

Matriz:

```jsx
int[ ] matriz = { {1, 2, 3} , {4, 5, 6} };
```