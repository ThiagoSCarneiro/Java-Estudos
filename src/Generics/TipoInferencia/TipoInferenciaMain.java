package Generics.TipoInferencia;

import Generics.TipoInferencia.implementacoes.BoxDemo;
import Generics.domain.Box;

import java.util.ArrayList;

public class TipoInferenciaMain {
    static void main(String[] args) {

        System.out.println("## Tipo Inferência e Métodos Genéricos ##");
        ArrayList<Box<Integer>> listOfIntegerBoxes =
                new java.util.ArrayList<>();
        BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);



    }
}
