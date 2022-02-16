package Projeto;

import java.util.Scanner; 
import java.util.HashMap;

public class Loja {

    public static void main(String[] args) {

        HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();
        HashMap<String, Produto> produtos = new HashMap<String, Produto>();
        Scanner ler = new Scanner(System.in);
        int menu; String busca_cpf, codBusca;

        do{
        System.out.println("\n\nControle de Clientes e Estoque\n");

        System.out.println("Menu de opções: ");
        System.out.println("[1] - Cadastrar Cliente");
        System.out.println("[2] - Buscar Cliente");
        System.out.println("[3] - Cadastrar Produto");
        System.out.println("[4] - Buscar Produto");
        System.out.println("[0] - Fechar \n");
        System.out.print("Escolha a opção que deseja: ");
        menu = ler.nextInt();

            switch (menu) {
                case 1:
                    String nome;
                    String cpf;
                    String email;
                    String telefone;
                    String endereco;
    
                    System.out.println("\n\nCadastro do Cliente\n");
   

                    ler.nextLine();
                    System.out.print("Nome: ");
                    nome = ler.nextLine();
                    System.out.print("CPF: ");
                    cpf = ler.nextLine();
                    System.out.print("Email: ");
                    email = ler.nextLine();
                    System.out.print("Número de telefone: ");
                    telefone = ler.nextLine();
                    System.out.print("Endereço: ");
                    endereco = ler.nextLine();
                    Cliente cli = new Cliente(nome, cpf, email, telefone, endereco);
                    clientes.put(cpf, cli);

                    System.out.println("\n\nCadastro concluído!\n");
                    break;

                case 2:
                    System.out.println("\n\nBusca do Cliente\n");
                    ler.nextLine();
                    System.out.print("\nDigite o CPF do Cliente para busca de dados: ");
				    busca_cpf = ler.nextLine();

                    if(clientes.get(busca_cpf) != null){
                        clientes.get(busca_cpf).InfoCliente();

                        System.out.println("\n\nMenu de opções dos Dados do Cliente: ");
                        System.out.println("[1] - Excluir Cadastro");
                        System.out.println("[2] - Editar Dados");
                        System.out.println("[0] - Fechar");
                        System.out.print("\nEscolha a opção que deseja: ");
                        menu = ler.nextInt();
                   
                        switch(menu){
                            case 1:
                                ler.nextLine();
                                System.out.println("\n\nOpção 'Excluir Cadastro' foi selecionada, deseja continuar?");
                                System.out.println("[1] - Sim");
                                System.out.println("[0] - Não");
                                System.out.print("\nEscolha a opção que deseja: ");
                                menu = ler.nextInt();
                                if(menu == 1){
                                    clientes.remove(busca_cpf);
                                    System.out.println("\n\nExclusão concluída!\n");
                                    break;
                                }
                                else{
                                    break;
                                }

                            case 2:
                                do {
                                    System.out.println("\n\nEditar dados\n");
                                
                                    System.out.println("[1] - Editar Nome");
                                    System.out.println("[2] - Editar CPF");
                                    System.out.println("[3] - Editar Email");
                                    System.out.println("[4] - Editar Número de Telefone");
                                    System.out.println("[5] - Editar Endereço");
                                    System.out.println("[0] - Fechar");
                                    System.out.print("\nEscolha a opção que deseja: ");
                                    menu = ler.nextInt();

                                    switch (menu) {
                                        case 1:
                                            ler.nextLine();
                                            System.out.print("Nome: ");
                                            nome = ler.nextLine();
                                            clientes.get(busca_cpf).setNome(nome);
                                            System.out.println("\n\nAlteração concluída!\n");
                                            break;
                                            
                                        case 2:
                                            ler.nextLine();
                                            System.out.print("CPF: ");
                                            cpf = ler.nextLine();
                                            clientes.get(busca_cpf).setCpf(cpf);
                                            System.out.println("\n\nAlteração concluída!\n");
                                            break;
                                
                                        case 3:
                                            ler.nextLine();
                                            System.out.print("Email: ");
                                            email = ler.nextLine();
                                            clientes.get(busca_cpf).setEmail(email);
                                            System.out.println("\n\nAlteração concluída!\n");
                                            break;
                                            
                                        case 4:
                                            ler.nextLine();
                                            System.out.print("Número de Telefone: ");
                                            telefone = ler.nextLine();
                                            clientes.get(busca_cpf).setTelefone(telefone);
                                            System.out.println("\n\nAlteração concluída!\n");
                                            break;
                                            
                                        case 5:
                                            ler.nextLine();
                                            System.out.print("Enderenço: ");
                                            endereco = ler.nextLine();
                                            clientes.get(busca_cpf).setEndereco(endereco);
                                            System.out.println("\n\nAlteração concluída!\n");
                                            break;
                                        default:
                                            break;
                                    }
                                } while (menu != 0);
                                clientes.get(busca_cpf).InfoCliente();
                                break;        
                            default:
                                break;
                        }

                    }else{ 
                        System.out.println("\n\nNão foi possível encontrar o cliente.\n");
                        break;
                    }
                    break;

                case 3:
                    String codProduto;
                    String Nome;
                    String Marca;
                    String Tamanho;

                    System.out.println("Cadastrar Produto\n");

                    ler.nextLine();
                    System.out.print("Código do Produto: ");
                    codProduto = ler.nextLine();
		            System.out.print("Nome: ");
                    Nome = ler.nextLine(); 
		            System.out.print("Marca: ");
                    Marca = ler.nextLine();
                    System.out.print("Tamanho: " );
                    Tamanho = ler.nextLine();
                   
                    Produto prod = new Produto(codProduto, Nome, Marca, Tamanho);
                    produtos.put(codProduto, prod);

                    System.out.println("\n\nCadastro concuído!\n");
                    break;
    
                case 4:
                    System.out.println("\n\nBusca do Produto\n");
                    ler.nextLine();
                    System.out.print("\nDigite o código do produto para realizar a busca: ");
                    codBusca = ler.nextLine();

                    if (produtos.get(codBusca) != null) {
                        produtos.get(codBusca).InfoProduto();

                        System.out.println("\n\nMenu de opções dos Dados do Produto: ");
                        System.out.println("[1] - Excluir Cadastro");
                        System.out.println("[2] - Editar Dados");
                        System.out.println("[0] - Fechar");
                        System.out.print("\nEscolha a opção que deseja: ");
                        menu = ler.nextInt();

                        switch(menu){
                            case 1:
                                ler.nextLine();
                                System.out.println("\n\nOpção 'Excluir Cadastro' foi selecionada, deseja continuar?");
                                System.out.println("[1] - Sim");
                                System.out.println("[0] - Não");
                                System.out.print("\nOpção 'Excluir Cadastro' foi selecionada, deseja continuar?");
                                menu = ler.nextInt();
                                if(menu == 1){
                                    produtos.remove(codBusca);
                                    System.out.println("\n\nExclusão concluída!\n");
                                    break;
                                }
                                else{
                                    break;
                                }
                            case 2:
                                do {
                                    System.out.println("\n\nEditar dados\n");
                                
                                    System.out.println("[1] - Editar código do produto");
                                    System.out.println("[2] - Editar nome");
                                    System.out.println("[3] - Editar marca");
                                    System.out.println("[4] - Editar tamanho");
                                    System.out.println("[0] - Fechar");
                                    System.out.print("\nEscolha a opção que deseja: ");
                                    menu = ler.nextInt();

                                    switch (menu) {
                                        case 1:
                                            ler.nextLine();
                                            System.out.print("Código do produto: ");
                                            codProduto = ler.nextLine();
                                            produtos.get(codBusca).setCodProduto(codProduto);
                                            System.out.println("\n\nAlteração concluída!\n");
                                            break;
                                            
                                        case 2:
                                            ler.nextLine();
                                            System.out.print("Nome: ");
                                            Nome = ler.nextLine();
                                            produtos.get(codBusca).setNome(Nome);
                                            System.out.println("\n\nAlteração concluída!\n");
                                            break;
                                            
                                        case 3:
                                            ler.nextLine();
                                            System.out.print("Marca: ");
                                            Marca = ler.nextLine();
                                            produtos.get(codBusca).setMarca(Marca);
                                            System.out.println("\n\nAlteração concluída!\n");
                                            break;
                                            
                                        case 4:
                                            ler.nextLine();
                                            System.out.print("Tamanho: ");
                                            Tamanho = ler.nextLine();
                                            produtos.get(codBusca).setTamanho(Tamanho);
                                            System.out.println("\n\nAlteração concluída!\n");
                                            break;
                                        
                                        default:
                                            break;
                                    }
                                } while (menu != 0);
                                produtos.get(codBusca).InfoProduto();
                                break;
                            default:
                                break;
                        }
                    }else{
                        System.out.println("\n\nNão foi possível encontrar o produto.\n");
                    }
                    break;

                default:
                    break;
            }

        }while (menu != 0);

        System.out.println("\n\nVolte sempre!\n\n");
        
        ler.close();
    }
}
