# Atividade Prática 06 — Padrão Bridge

## Descrição

Em um bar, o estoque possui diferentes marcas de refrigerante, como Coca-Cola,
Fanta e Sprite, além de diferentes tamanhos, como 200 ml, 300 ml e 600 ml.

Criar uma classe para cada combinação possível causaria uma explosão no número
de classes e repetição de código.

## Objetivo

Aplicar o padrão Bridge para separar a abstração, representada pelas marcas de
refrigerante, da implementação, representada pelos tamanhos e volumes.

Com essa separação, novas marcas e novos tamanhos podem ser adicionados de forma
independente.

## Requisitos da atividade

- utilizar o padrão Bridge;
- separar marcas e tamanhos por meio de composição;
- permitir a combinação entre qualquer marca e qualquer tamanho;
- evitar uma classe específica para cada combinação;
- adicionar posteriormente a marca Guaraná e o tamanho de 1 litro sem alterar
  as classes existentes;
- relacionar a implementação ao diagrama UML e aos conceitos do padrão GoF.

## Etapas do trabalho

- [v1 — modelagem UML](https://github.com/Thalisson-Souza/APSOO-bridge/tree/v1);
- [v2-p1 — implementação e revisão crítica](https://github.com/Thalisson-Souza/APSOO-bridge/tree/v2-p1);
- [v2-p2 — melhorias da implementação](https://github.com/Thalisson-Souza/APSOO-bridge/tree/v2-p2);
- [v3 — extensão com Guaraná e 1 litro](https://github.com/Thalisson-Souza/APSOO-bridge/tree/v3).
