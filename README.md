# Conceitos Básicos de Java

Este projeto demonstra conceitos fundamentais da linguagem Java através de exemplos práticos com variáveis, operações matemáticas, manipulação de strings e arrays.

## 📚 Conteúdo da Aula

### 1. Variáveis e Tipos de Dados
- **int**: números inteiros
- **double**: números decimais
- **boolean**: valores verdadeiro/falso
- **String**: texto

### 2. Operações Matemáticas
- Cálculo de média aritmética
- Operações com arrays
- Uso do loop `for-each` para percorrer arrays

### 3. Manipulação de Strings
- **toUpperCase()**: converter para maiúsculas
- **length()**: obter o número de caracteres
- **charAt()**: acessar caractere em posição específica

### 4. Estruturas de Controle
- Comparações lógicas (`>=`)
- Loop `for-each` para iteração em arrays

## 🔧 Como Executar

1. Certifique-se de ter o Java instalado em sua máquina
2. Compile o arquivo: `javac Main.java`
3. Execute o programa: `java Main`

## 📋 Exemplos Implementados

### Cálculo de Média de Notas (Comentado)
```java
int nota1 = 8;
int nota2 = 7;
double media = (nota1 + nota2) / 2.0;
boolean aprovado = media >= 7;
```

### Manipulação de String (Comentado)
```java
String nome = "Francisco";
System.out.println("Nome em maiúsculo: " + nome.toUpperCase());
System.out.println("Número de letras: " + nome.length());
System.out.println("Primeira letra: " + nome.charAt(4));
```

### Cálculo de Média com Array (Ativo)
```java
double[] notas = {7.5, 8.0, 6.5, 9.0};
double soma = 0;
for (double nota : notas) {
    soma += nota;
}
double media = soma / notas.length;
```

### Informações do Aluno (Ativo)
```java
String nome = "Maria";
int idade = 17;
double notaFinal = 8.6;
boolean passou = notaFinal >= 6.0;
```

## 🎯 Saída Esperada

```
Média da turma: 7.75

Aluno: Maria
Idade: 17
Nota Final: 8.6
Passou? true
```

## 📝 Conceitos Aprendidos

- **Declaração e atribuição de variáveis**
- **Conversão de tipos (casting implícito)**
- **Operadores aritméticos e lógicos**
- **Arrays e iteração com for-each**
- **Métodos básicos da classe String**
- **Concatenação de strings**
- **Saída de dados com System.out.println()**

## 💡 Dicas

- Note que o código possui exemplos comentados que podem ser descomentados para teste
- A divisão por `2.0` garante que o resultado seja um número decimal
- O loop `for-each` é uma forma elegante de percorrer arrays
- Variáveis boolean armazenam o resultado de expressões lógicas automaticamente
