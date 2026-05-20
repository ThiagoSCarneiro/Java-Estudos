package com.thiagodasilva.generics.introduçao.implementacao;

import com.thiagodasilva.generics.introduçao.interfaces.*;

public class Calculadora implements OperacoesAritmeticas {


    @Override
    public  Number somar(Number n1, Number n2) {
        return n1.doubleValue() + n2.doubleValue();
    }

    @Override
    public Number subtrair(Number n1, Number n2) {
        return n1.doubleValue() - n2.doubleValue();
    }

    @Override
    public Number multiplicar(Number n1, Number n2) {
        return n1.doubleValue() * n2.doubleValue();
    }

    @Override
    public Number dividir(Number n1, Number n2) {
        return n1.doubleValue() / n2.doubleValue();
    }

    @Override
    public Number resto(Number n1, Number n2) {
        return n1.doubleValue() % n2.doubleValue();
    }

    @Override
    public Number potencia(Number n1, Number n2) {
        return Math.pow(n1.doubleValue(), n2.doubleValue());
    }
}
