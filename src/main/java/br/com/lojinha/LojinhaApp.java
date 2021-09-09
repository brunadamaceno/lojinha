package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
      Produto meuProduto = new Produto();

      meuProduto.setNome("Play 4");
      meuProduto.setMarca("Sony");
      meuProduto.setValor(23.09);
      meuProduto.setTamanho("Médio");
      meuProduto.setItensInclusos("2 controles e 3 jogos");

        System.out.println(meuProduto.getValor());




    }
}
