# SDD — Estoque de Refrigerantes com Bridge (v2-p2)

## Objetivo

Separar marca e tamanho por composição, mantendo o Bridge como estrutura central.
A versão melhorada também controla quantidades simples do estoque.

## Papéis do padrão

- `Refrigerante`: Abstraction;
- `CocaCola`, `Fanta` e `Sprite`: RefinedAbstraction;
- `Tamanho`: Implementor, com descrição, volume e embalagem;
- `Tamanho200ml`, `Tamanho300ml` e `Tamanho600ml`: ConcreteImplementor.

## Regras da melhoria

- `Refrigerante.descricao()` identifica marca e tamanho;
- `Estoque` permite adicionar, consultar e servir uma unidade;
- quantidades menores ou iguais a zero são rejeitadas;
- os comportamentos principais são demonstrados por testes executáveis com `-ea`;
- a combinação entre marca e tamanho continua sendo feita por composição.

`Guarana` e `Tamanho1Litro` pertencem à Etapa 3 e não fazem parte desta branch.
