# Sistemas de numeração

São sistemas matemáticos que usam símbolos ou dígitos para representar quantidades. Esses são exemplos de sistemas comuns:

- Decimal: Base 10 (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
- Binário: Base 2 (0, 1)
- Octal: Base 8 (0, 1, 2, 3, 4, 5, 6, 7)
- Hexadecimal: Base 16 (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)

## Binário: 

Possui radical 2

O cabeçalho da tabela equivalem a quantidade de vezes que 2 deve ser exponenciado (ou multiplicado por ele mesmo), mas a exponenciação só é realizada se estiver o número 1 abaixo de cada bit. Ou seja:

1 = True
0 = False

| Bit 7 (2^7) | Bit 6 (2^6) | Bit 5 (2^5) | Bit 4 (2^4) | Bit 3 (2^3) | Bit 2 (2^2) | Bit 1 (2^1) | Bit 0 (2^0) |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | 0 | 1 | 1 | 0 | 1 | 0 | 1 |

Resultado: 

(2^7) + (2^5) + (2^4) + (2^2) + (2^0) = 
128 + 32 + 16 + 4 + 1 = 181

## Octal

Possui radical 8

Começando do 0, o número decimal é posto da esquerda para a direita em uma tabela, onde os números de cada coluna do cabeçalho são a quantidade de vezes em que 8 será exponenciado (ou multiplicado por ele mesmo) e depois, multiplicado pelo número abaixo dele: 

| 3 (8^3) | 2 (8^2) | 1 (8^1) | 0 (8^0) |
| --- | --- | --- | --- |
| 7 | 2 | 0 | 5 |

8^3 * 7 + 8^2 * 2 + 8^1 * 0 + 8^0 * 5 =
512 * 7 + 64 * 2 + 8 * 0 + 1 * 5 =
3.584 + 128 + 0 + 5 = 3.717

## Hexadecimal

Possui radical 16

0 a 9 e A a F, sendo:

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

## Utilização no Java

- int dec = 152;
- int bin = 0b10011000;
- int oct = 0230;
- int hex = 0x98;

Ao printá-los, vê-se que, após os cálculos todos resultarão no mesmo número na base decimal:

```java
System.out.println(dec); // 152
System.out.println(bin); // 152
System.out.println(oct); // 152
System.out.println(hex); // 152
```