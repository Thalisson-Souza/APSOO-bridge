# Etapa 2 - Implementação e revisão crítica

## Prompt utilizado

```text
Quero que você implemente, em Java, um sistema de estoque de refrigerantes seguindo o padrão Bridge e o seguinte diagrama UML.

A abstração deve ser a classe abstrata Refrigerante, que mantém uma referência para a interface Tamanho. As classes CocaCola, Fanta e Sprite devem estender Refrigerante. O implementor deve ser a interface Tamanho, com o método String descricao(). As classes Tamanho200ml, Tamanho300ml e Tamanho600ml devem implementar Tamanho.

O método servir() de Refrigerante deve combinar a marca com a descrição do tamanho. O cliente deve conseguir combinar qualquer marca com qualquer tamanho por composição, sem criar classes para cada combinação. Separe cada classe em seu próprio arquivo, use pacotes bridge.refrigerante, bridge.tamanho e bridge.app, crie uma Main demonstrando as combinações.
```

## O que foi feito na `v2-p1`

Foi implementada a estrutura inicial do padrão Bridge em Java. A classe
`Refrigerante` representa a Abstraction, enquanto `CocaCola`, `Fanta` e
`Sprite` representam as RefinedAbstractions. A interface `Tamanho` representa o
Implementor, e `Tamanho200ml`, `Tamanho300ml` e `Tamanho600ml` representam os
ConcreteImplementors.

A marca e o tamanho são combinados por composição. A classe `Main` demonstra
essas combinações sem a necessidade de criar uma classe para cada combinação de
marca e tamanho.

## Parte 2 — Revisão crítica

A implementação atende ao funcionamento bridge de forma boa, mas tem uns pontos que ficaram meio imcompletos. No cenário diz referente a um estoque de um bar, a implementação direciona mais criação e serventia de refrigerantes, não tem uma quantidade pro controle do estoque, preços, controles de entrada e saída, ver se está disponivel, cadastrar novos produtos, consultar produtos.

Ela cumpre seu objetivo de mostrar o desacoplamento e excesso de classes que sem o bridge traria. Métodos como servir() faz apenas a combinação entre a marca e tamanho não tem uma operação de fato... O tamanho é apenas uma descrição, poderia te o tipo da embalagem, o volume daquela embalagem

Na implementação foi usado `protected abstract String marca();` que diz que não tem realmente uma marca fixa, deixando que a subclasse diga qual é marca pelo método abstrato...

Não tem testes unitários pra testar combinação entre cada marca e tamanho, extensão com Guaraná, rejeitar tamanho inválido, etc...
