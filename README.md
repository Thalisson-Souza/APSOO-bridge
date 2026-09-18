# Bridge

## Cenário: Estoque de Refrigerantes

**Descrição:**

Imagine que você está desenvolvendo um sistema para representar o estoque de
refrigerantes de um bar. Nesse estoque, existem diferentes marcas, como
Coca-Cola, Fanta e Sprite, além de diferentes tamanhos, como 200ml, 300ml e
600ml.

Criar classes para cada combinação possível, como `CocaCola200ml` e
`Fanta300ml`, aumentaria muito o número de classes, gerando uma explosão
combinatória e código redundante.

**Requisitos:**

1. O sistema deve representar diferentes marcas de refrigerante.
2. O sistema deve representar diferentes tamanhos e volumes.
3. O padrão Bridge deve desacoplar a abstração, representada pela marca, da
   implementação, representada pelo tamanho.
4. Novas marcas e novos tamanhos devem poder ser adicionados de forma
   independente.
5. O sistema não deve precisar de uma classe específica para cada combinação de
   marca e tamanho.

## Organização das entregas

As etapas foram organizadas nas seguintes branches:

- [v1 — diagrama UML](https://github.com/Thalisson-Souza/APSOO-bridge/tree/v1);
- [v2-p1 — implementação e revisão crítica](https://github.com/Thalisson-Souza/APSOO-bridge/tree/v2-p1);
- [v2-p2 — implementação melhorada](https://github.com/Thalisson-Souza/APSOO-bridge/tree/v2-p2);
- [v3 — extensão com Guaraná e 1 litro](https://github.com/Thalisson-Souza/APSOO-bridge/tree/v3).
