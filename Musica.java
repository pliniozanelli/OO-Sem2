
package com.mycompany.musica;
import java.util.Scanner;

public class Musica {
    private String titulo;
    private String artista;
    private double duracao;
    private double preco;
    
    
    public Musica(){
        this.titulo = "";
        this.artista = "";
        this.duracao = 0.0;
        this.preco = 0.0;
    }
    
    public void Copiar(Musica outra){
        this.titulo = outra.getTitulo();
        this.artista = outra.getArtista();
        this.duracao = outra.getDuracao();
        this.preco = outra.getPreco();
    }
    
    public void Preencher(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o título:");
        this.setTitulo(scan.nextLine());
        
        System.out.println("Informe o artista:");
        this.setArtista(scan.nextLine());
        
        System.out.println("Informe a duração: ");
        this.setDuracao(scan.nextDouble());
        
        System.out.println("Informe o preço: ");
        this.setPreco(scan.nextDouble());    
    }
    @Override
    public String toString(){
        return "Musica: {Título: "
                + this.getTitulo() + ", Artista: "
                + this.getArtista() + ", Duração: " 
                + this.getDuracao() + " e Preço: " 
                + this.getPreco() + "}";
    }
    
    public void tocarMusica(){
        System.out.println("A música "+ this.getTitulo() + " está tocando.");
    }
    public void desligarMusica(){
        System.out.println("A música "+ this.getTitulo() + " foi desligada.");
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public static void main(String[] args){
        Musica m1 = new Musica();
        
        m1.Preencher();
        System.out.println(m1.toString());
        m1.tocarMusica();
        m1.desligarMusica();
    } 
}
