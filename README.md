# Questão 1 – Uso de Getters e Setters

É considerada uma boa prática usar **getters** e **setters** ao invés de tornar os atributos públicos porque isso permite:

- **Encapsulamento**: os dados internos ficam protegidos e o acesso é controlado.
- **Validação de dados**: é possível aplicar regras nos setters para evitar valores inválidos.
- **Flexibilidade**: o comportamento pode mudar internamente sem afetar quem usa a classe.

### Exemplo:
```java
public void setIdade(int idade) {
    if (idade >= 0 && idade <= 150) {
        this.idade = idade;
    } else {
        System.out.println("Idade inválida!");
    }
}
```
Esse setter evita que um objeto tenha uma idade negativa ou irreal.

# Questão 2 – Modelagem da Classe Livro

## a) Informações relevantes para representar um livro:
- Título
- Autor
- ISBN
- Ano de publicação
- Gênero
- Número de exemplares disponíveis

## b) Por que a classe Livro é uma abstração?
Porque representa um conceito genérico de um livro do mundo real dentro do código, ignorando detalhes irrelevantes para o sistema.

## c) Três métodos que fazem sentido para a classe Livro:
- `emprestarLivro()`
- `devolverLivro()`
- `exibirInformacoes()`
