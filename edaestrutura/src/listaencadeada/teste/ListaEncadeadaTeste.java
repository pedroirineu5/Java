package listaencadeada.teste;

import listaencadeada.LinkedList;

public class ListaEncadeadaTeste {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(); 

        for (int i= 0; i<10;i++){
            list.add(i);

        }
        System.out.println(list);
        System.out.println("Tamanho" + list.getLength());

    }
}
