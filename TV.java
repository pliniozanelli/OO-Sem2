
package com.mycompany.tv;
import java.util.Scanner;

public class TV {

    private String marca;
    private double tamanho;
    private String resolucao;
    private double preco;
    
    public TV(){
        this.marca = "";
        this.tamanho = 0.0;
        this.resolucao = "";
        this.preco = 0.0;   
    }
    
    public TV(String marca, String resolucao, double tamanho, double preco){
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.preco = preco;
    }
    
    public void Preencher(){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a marca da TV?");
        this.setMarca(scan.next());
        System.out.println("Qual o tamanho da TV?");
        this.setTamanho(scan.nextDouble());
        System.out.println("Qual a resolução da TV?");
        this.setResolucao(scan.next());
        System.out.println("Qual o preço da TV?");
        this.setPreco(scan.nextDouble());
        
    }
    
    public void Imprimir(){
        
        System.out.println("Marca:"+this.getMarca());
        System.out.println("Tamanho:"+this.getTamanho());
        System.out.println("Resolução:"+this.getResolucao());
        System.out.println("Preço:"+this.getPreco()); 
    }
    
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public String getResolucao() {
        return resolucao;
    }
    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
  public static void main(String[] args){
        TV tv1 = new TV();
        tv1.Preencher();
        tv1.Imprimir();
        
    }
    
};