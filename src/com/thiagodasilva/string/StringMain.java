package com.thiagodasilva.string;

public class StringMain {
    public static void main(String[] args) {
        String value = "java;java;java";

        value = value.replaceFirst("j", "J");
        System.out.println(value + " = replaceFirst troca o primeiro char encontrado\n");

        value = value.replace("j", "J");
        System.out.println(value + " = replace troca todos char \n");

        boolean check = value.equals("Java");
        System.out.println(check + " = equals verifica se o contexto e igual\n");

        var values = value.split(";");
        for (var v : values) {
            System.out.println(v + " = split dividir uma string em partes");
        }

        System.out.println("");

        System.out.println(value.toUpperCase() + " = toUpperCase Tudo em caixa alta");
        System.out.println(value.toLowerCase() + " = toLowerCase Tudo em caixa baixa \n");

        System.out.println(value.contains("j") + " = contain Verificar se tem");
        System.out.println(value.indexOf(";") + " = indexOf coloca em um array e verifica a posicao \n");

        System.out.println(value);

        System.out.println(value.startsWith("Ja") + " = startsWith comeca com?");
        System.out.println(value.endsWith("va") + " = endsWith termina com? \n");

        System.out.println(value.isEmpty() + " = isEmpty verifica se esta vazia ()");
        System.out.println(value.isBlank() + " =  isBlank verifica se esta vazia mesmo com espaco (   )");
        System.out.println(value.trim() + " = trim lima os espaco em branco \n");

        System.out.println(value.substring(0, 4) + " = substring cria uma nova string a partir dos index\n");

    }
}
