package com.thiagodasilva.generics.introduçao.interfaces;

public interface OperacoesAritmeticas<N extends Number>{

     N somar(N n1, N n2);

    N subtrair(N n1, N n2);

    N multiplicar(N n1, N n2);

    N dividir(N n1, N n2);

    N resto(N n1, N n2);

    N potencia(N n1, N n2);

}
