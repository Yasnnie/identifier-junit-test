# Descrição dos casos de teste
**Aluno(a):** Yasmin Carvalho Targino de Alencar

A seleção de dados de teste foi realizada utilizando os critérios de Particionamento em Classes de Equivalência e Análise de Valor Limite.
No particionamento, foram identificadas classes como identificadores válidos (apenas letras e números), identificadores com caracteres especiais (inválidos), vazios ou começando com números (inválidos), e identificadores com até 6 caracteres (válidos) e mais de 6 caracteres (inválidos). 
Na análise de valor limite, foram testados identificadores com 1 e 6 caracteres (válidos) e com mais de 6 caracteres (inválidos), garantindo a validação dos limites do intervalo de 1 a 6 caracteres. Esses critérios asseguram a cobertura adequada dos cenários possíveis e a correta validação dos limites. 
Segue a descrição dos testes:

### 1.1. Verificar caracteres se há especiais
```java
@Test
public void caracteresEspeciaisInvalidos() {
    assertFalse("Identificadores com caracteres especiais devem ser inválidos", identifier.validateIdentifier("te.ste"));
}
```

**Descrição:** O identificador contém um caractere especial (ponto), o que deve invalidá-lo.

**Expectativa:** O identificador não deve permitir caracteres especiais.

### 1.2. Verificar identificador vazio

```java
@Test
public void identificadorVazio() {
    assertFalse("Identificador vazio deve ser inválido", identifier.validateIdentifier(""));
}
```

**Descrição:** Um identificador deve conter pelo menos 1 caractere.

**Expectativa:** O identificador deve permitir strings vazias, logo deve retornar inválido.

### 1.3 Verificar identificador com no mínimo 1

```java
@Test
public void minimoUmCaracteresInvalido() {
    assertTrue("Identificadores com no mínimo de 1 caractere devem ser válidos", identifier.validateIdentifier("y"));
}
```

**Descrição:** Um identificador com um único caractere (no mínimo) deve ser considerado válido.

**Expectativa:** O identificador deve aceitar strings com pelo menos um caractere.

### 1.4 Verificar identificador com no máximo 6 caracteres válido

```java
@Test
public void maximoSeisCaracteresValido() {
    assertTrue("Identificadores com até 6 caracteres devem ser válidos", identifier.validateIdentifier("yasmin"));
}
```
**Descrição:** Um identificador com até 6 caracteres é válido.

**Expectativa:** O identificador deve permitir strings com no máximo 6 caracteres alfabéticos ou alfanuméricos.

### 1.5 Verificar identificador com mais de 6 caracteres inválido

```java
@Test
public void maximoSeisCaracteresInvalido() {
    assertFalse("Identificadores com mais de 6 caracteres devem ser inválidos", identifier.validateIdentifier("alskndalksndksa"));
}
```
**Descrição:** Um identificador com mais de 6 caracteres deve ser inválido.

**Expectativa:** O identificador não deve permitir strings com mais de 6 caracteres.

### 1.6 Verificar que o primeiro caractere não pode ser um número

```java
@Test
public void primeiroCaractereNaoENumeroInvalido() {
    assertFalse("O primeiro caractere não pode ser um número, logo o identificador deve ser inválido", identifier.validateIdentifier("9an"));
}
```
**Descrição:** O primeiro caractere do identificador não pode ser um número.

**Expectativa:** O identificador deve começar com uma letra.


