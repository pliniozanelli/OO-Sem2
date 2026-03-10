
package com.mycompany.casa;
import java.util.Scanner;


public class Casa {
    private String endereco;
    private double area;
    private double num_quartos;
    private double preco;
    
    Scanner scan = new Scanner(System.in);
    
    public Casa(){
        this.endereco = "";
        this.area = 0.0;
        this.num_quartos = 0.0;
        this.preco = 0.0;
    }
    public void Copiar(Casa outra){
        this.area = outra.getArea();
        this.endereco = outra.getEndereco();
        this.num_quartos = outra.getNum_quartos();
        this.preco = outra.getPreco();
    }
    public void Preencher(){
        
        System.out.println("Informe a Area da casa: ");
        this.setArea(scan.nextDouble());
        scan.nextLine();
       
        
        System.out.println("Informe o endereço completo: ");
        this.setEndereco(scan.nextLine());
        
        System.out.println("Informe o Preço da casa: ");
        this.setPreco(scan.nextDouble());
        scan.nextLine();
        
        System.out.println("Informe o numero de quartos da casa: ");
        this.setNum_quartos(scan.nextDouble());
        scan.nextLine();
        
    }
    
    public void Imprimir(){
        System.out.println("Endereço: "+ this.getEndereco());
        System.out.println("Area: "+ this.getArea());
        System.out.println("Numero de Quartos: "+ this.getNum_quartos());
        System.out.println("Preço: "+ this.getPreco());
        
    }
    
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getNum_quartos() {
        return num_quartos;
    }
    public void setNum_quartos(double num_quartos) {
        this.num_quartos = num_quartos;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double calcularPrecoPorM2(){
        return this.getPreco()/this.getArea();
             
    }
    public String exibirResumo(){
        return this.getEndereco() + "| "
        + this.getArea()+"m2 | " + this.getNum_quartos() + " quartos | " + "R$ " + this.getPreco()+ "|";
    }
    public static void main(String[]args){
        Casa casa1 = new Casa();
        Casa casa2 = new Casa();
        Casa casa3 = new Casa();
        casa1.Preencher();
        casa1.calcularPrecoPorM2();
        casa2.Preencher();
        casa2.calcularPrecoPorM2();
        casa3.Preencher();
        casa3.calcularPrecoPorM2();
        casa1.exibirResumo();
        casa2.exibirResumo();
        casa3.exibirResumo();
        
        if(casa1.calcularPrecoPorM2() < casa2.calcularPrecoPorM2() && casa1.calcularPrecoPorM2() < casa3.calcularPrecoPorM2()){
            System.out.println("Melhor custo por M2: " + casa1.exibirResumo() + ". Preço por M2: R$ " + casa1.calcularPrecoPorM2() + "/M2" );
        }
        else if(casa2.calcularPrecoPorM2() < casa1.calcularPrecoPorM2() && casa2.calcularPrecoPorM2() < casa3.calcularPrecoPorM2()){
            System.out.println("Melhor custo por M2: " + casa2.exibirResumo() + ". Preço por M2: R$ " + casa2.calcularPrecoPorM2() + "/M2" );
        }
        else{
            System.out.println("Melhor custo por M2: " + casa3.exibirResumo() + ". Preço por M2: R$ " + casa3.calcularPrecoPorM2() + "/M2" );
            
        }
    }
};
