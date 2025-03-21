public class main{
    public static void main(string[] args){
        scanner teclado = new scanner(system.in);

        int escolha = 0;
        do{
            System.out.println("\n MENU ");
            system.out.println("1 - Novo produto");
            system.out.println("2 - Dados");
            system.out.println("3 - Excluir ");
            system.out.println("4 - Listar");
            system.ou.println("5 - Sair");
            escolha = teclado.nextint();
            System.out.print("Digite o Nome do produto:");
            String Nome = scanner.nextLine();
            System.out.print("Digite o Preço do produto: ");
            String Preco = scanner.nextLine();
            
            listaProdutos.add(novoProduto);
            System.out.print("Produto Cadastrado com sucesso!!");

        
        }while(escolha != 0)
    }
}