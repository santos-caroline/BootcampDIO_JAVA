# 📌 Resumo – Interfaces Funcionais Java (para estudo)

## 🧩 O que são?
Interfaces funcionais possuem **apenas um método abstrato**  
→ podem ser usadas com **lambda** e **method reference**.

---

## 🔹 Principais Interfaces

### 1️⃣ Consumer<T>
- **Entrada:** T
- **Retorno:** void
- **Função:** executar uma ação (efeito colateral)

```
Consumer<Integer> c = x -> System.out.println(x);
```
### Usos comuns:
- imprimir
- salvar
- alterar estado
- ⚠️ Não transforma dados.

### 2️⃣ Function<T, R>
- **Entrada:** T
- **Retorno:** R
- **Função:*** transformar um valor em outro

````
Function<String, Integer> f = s -> s.length();
````

### Usos comuns:
- map
- conversão de tipos

### 3️⃣ Predicate<T>
- **Entrada:** T
- **Retorno:** boolean
- **Função:** testar uma condição

````
Predicate<Integer> p = x -> x > 10;
````

### Usos comuns:
- filter
- validações

### 4️⃣ Supplier<T>
- **Entrada:** nenhuma
- **Retorno:** T
- **Função:** fornecer/criar valores

````
Supplier<Double> s = () -> Math.random();
````

### Usos comuns:
- geração preguiçosa
- valores padrão

### 🔹 Interfaces Especializadas (primitivos)
Evita boxing/unboxing → mais performance

- IntConsumer

````IntConsumer c = x -> System.out.println(x);````

- IntFunction<R>

````IntFunction<String> f = x -> "n=" + x;````

- IntPredicate

````IntPredicate p = x -> x % 2 == 0;````

- IntSupplier

````IntSupplier s = () -> 42;````

### 🔹 Bi-functions (duas entradas)
- BiConsumer<T, U>

````BiConsumer<String, Integer> c = (k, v) -> map.put(k, v);````

- BiFunction<T, U, R>

````BiFunction<Integer, Integer, Integer> f = (a, b) -> a + b;````

- BiPredicate<T, U>

````BiPredicate<String, String> p = (a, b) -> a.equals(b);````

- 📊 Tabela Resumo Rápido

| Interface   | Entrada | Retorno | Palavra-chave |
| ----------- | ------- | ------- | ------------- |
| Consumer    | 1       | void    | agir          |
| Function    | 1       | 1       | transformar   |
| Predicate   | 1       | boolean | testar        |
| Supplier    | 0       | 1       | fornecer      |
| BiConsumer  | 2       | void    | agir          |
| BiFunction  | 2       | 1       | combinar      |
| BiPredicate | 2       | boolean | comparar      |


### 🧠 Regras Mentais
- map → Function
- filter → Predicate
- forEach → Consumer
- generate → Supplier
- sem retorno → Consumer
- retorna boolean → Predicate

### ⚠️ Observação Importante
- Streams não gostam de efeitos colaterais.

- ❌ Evite:

````stream.forEach(x -> total += x);````

- ✅ Prefira:

````int total = stream.mapToInt(Integer::intValue).sum();````