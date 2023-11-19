package listaencadeada.teste;

import listaencadeada.LinkedList;

public class ListaEncadeadaTeste {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(); 
        list.add(1);

        System.out.println(list);
        System.out.println("Tamanho" + list.getLength());

    }
}
