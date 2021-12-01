package Projeto;

public class Produto {

    private String codProduto, nome, marca, tamanho;

    public Produto(String codProduto, String nome, String marca, String tamanho){
        this.codProduto = codProduto;
        this.nome = nome;
        this.marca = marca;
        this.tamanho = tamanho;
        
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }
    
    public String getCodProduto() {
        return codProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getMarca() {
        return marca;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void InfoProduto(){

		System.out.println("\n\nInformações do Produto\n");
		System.out.println("Código do Produto: " + getCodProduto());
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
        System.out.println("Tamanho: " + getTamanho());

	}
}
