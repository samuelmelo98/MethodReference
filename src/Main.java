import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;

interface Figura{
void desenha(Double n, Double n1);
}
/*
 *teste
 */

 class Retangulo{

    public void desenhaRetagulo(Double n, Double n1){
        Double x = (Double) n;
        Double x1 = (Double) n1;
        System.out.println("Retangulo:" + x * x1);

    }
}

class Produto{

    public Produto(String nome , Integer valor){
        this.nome = nome;
        this.valor = valor;
    }
    private String nome;
    private Integer valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void imprimiProduto(){
        System.out.println("Produto:"+ nome +"\t"+ valor);

    }
}


class Imprimir{
   public  static void imprimi(Produto p){
        System.out.println("Produto:" + p.getNome() +"\n"+ p.getValor());
    }
}

public class Main {
    public static void main(String[] args) {
       List<Produto> lista = Arrays.asList(new Produto("samuel",10),new Produto("anderson",20));



        Figura figura2  = (a,a1) ->System.out.println("Lambda :" + a*a1);
        figura2.desenha(100.1,10.3);
      Retangulo retangulo = new Retangulo();
      Figura figura = retangulo::desenhaRetagulo;
      figura.desenha(10.0,10.0);

      lista.forEach((p) -> System.out.println(p.getNome()+":"+p.getValor()));

      lista.forEach(Imprimir::imprimi);
      lista.forEach(Produto::imprimiProduto);

    }
}
