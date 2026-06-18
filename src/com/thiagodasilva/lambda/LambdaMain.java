package com.thiagodasilva.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaMain {
    public static void main(String[] args) {

        // Criando uma lista base de produtos para os testes
        List<Product> products = getBaseProducts();

        // ==========================================
        // 1. PREDICATE (Filtro / Validação)
        // Objetivo: Filtrar produtos que custam mais de R$ 1000.00
        // ==========================================
        System.out.println("--- 1. Predicate (Produtos > R$ 1000) ---");

        // Versão com variável
        Predicate<Product> isExpensive = p -> p.getPrice() > 1000.0;

        // O método removeIf utiliza um Predicate para decidir o que apagar
        // Vamos usar a lambda direto no argumento para ficar mais limpo
        products.removeIf(p -> p.getPrice() <= 1000.0);


        // ==========================================
        // 2. CONSUMER (Ação sem retorno)
        // Objetivo: Executar uma lógica para cada item (ex: imprimir ou dar desconto)
        // ==========================================
        System.out.println("\n--- 2. Consumer (Imprimindo os caros) ---");

        // O método forEach do Java 8 espera um Consumer
        Consumer<Product> printProduct = p -> System.out.println(p);

        // Aplicando o consumer na lista que sobrou
        products.forEach(printProduct);

        // Exemplo de Consumer inline alterando os preços (Aumento de 10%)
        System.out.println("\n--- Aplicando aumento de 10% com Consumer ---");
        products.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        products.forEach(p -> System.out.println(p));


        // Resetando a lista para testar a Function
        List<Product> fullList = getBaseProducts();

        // ==========================================
        // 3. FUNCTION (Transformação de Objetos)
        // Objetivo: Pegar um Product e transformar apenas no seu Nome (String)
        // ==========================================
        System.out.println("\n--- 3. Function (Transformando Product em String de Nomes) ---");

        // Recebe Product, retorna String
        Function<Product, String> upperCaseName = p -> p.getName().toUpperCase();

        // Usando a Stream API para aplicar a Function de mapeamento
        List<String> productNames = fullList.stream()
                .map(upperCaseName) // Transforma cada Product em String
                .toList();          // Coleta o resultado em uma nova lista

        // Imprimindo a nova lista de Strings usando Consumer inline
        productNames.forEach(name -> System.out.println(name));
    }

    // Método auxiliar para não poluir o escopo principal
    public static List<Product> getBaseProducts() {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv Smart", 1580.25));
        list.add(new Product("Geladeira Eletrolux", 5080.99));
        list.add(new Product("Smartphone A07 SamSung 4g", 580.25));
        list.add(new Product("Mouse gamer", 180.25));
        return list;
    }
}