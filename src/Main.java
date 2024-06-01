import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

    private static ArrayList<Livraria> listaDeLivros = new ArrayList<Livraria>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Livraria =====");
            System.out.println("1. Cadastrar");
            System.out.println("2. Visualizar");
            System.out.println("3. Atualizar");
            System.out.println("4. Deletar");
            System.out.println("5. Sair");
            System.out.print("Digite a opção desejada: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createLivraria(scanner);
                    break;
                case 2:
                    readLivraria();
                    break;
                case 3:
                    updateLivros(scanner);
                    break;
                case 4:
                    deleteLivraria(scanner);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha outra opção!");
                    break;
            }
        }

        scanner.close();
    }

    private static void createLivraria(Scanner scanner) {
        System.out.print("Digite o titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o genero: ");
        String genero = scanner.nextLine();
        System.out.print("Digite o autor: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o idioma: ");
        String idioma = scanner.nextLine();
        System.out.print("Digite a sinopse: ");
        String sinopse = scanner.nextLine();
        System.out.print("Digite quantas paginas que tem no livro: ");
        int paginas = scanner.nextInt();
        System.out.print("Digite a quantidade no estoque: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o ano de publicacao: ");
        int anopublicacao = scanner.nextInt();
        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();

        Livraria livraria = new Livraria(nextId++, titulo, genero, autor, idioma, sinopse,
                paginas, quantidade, anopublicacao, preco);
        listaDeLivros.add(livraria);
        System.out.println("livro adicionado com sucesso!");
    }

    private static void readLivraria() {
        if (listaDeLivros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado. Comece a cadastrar para visualizar os livros aqui.");
        } else {
            System.out.println("\n===== Lista de Livros da Livraria =====");
            for (Livraria livraria : listaDeLivros) {
                System.out.println(livraria);
            }
        }
    }

    private static void updateLivros(Scanner scanner) {
        System.out.print("Digite o ID do livro que deseja atualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (Livraria livraria : listaDeLivros) {
            if (livraria.getId() == id) {
                System.out.print("Digite o titulo: ");
                String titulo = scanner.nextLine();
                System.out.print("Digite o genero: ");
                String genero = scanner.nextLine();
                System.out.print("Digite o autor: ");
                String autor = scanner.nextLine();
                System.out.print("Digite o idioma: ");
                String idioma = scanner.nextLine();
                System.out.print("Digite a sinopse: ");
                String sinopse = scanner.nextLine();
                System.out.print("Digite quantas paginas que tem no livro: ");
                int paginas = scanner.nextInt();
                System.out.print("Digite a quantidade no estoque: ");
                int quantidade = scanner.nextInt();
                System.out.print("Digite o ano de publicacao: ");
                int anopublicacao = scanner.nextInt();
                System.out.print("Digite o preço: ");
                double preco = scanner.nextDouble();

                livraria.setTitulo(titulo);
                livraria.setGenero(genero);
                livraria.setAutor(autor);
                livraria.setIdioma(idioma);
                livraria.setSinopse(sinopse);
                livraria.setPaginas(paginas);
                livraria.setQuantidade(quantidade);
                livraria.setAnopublicacao(anopublicacao);
                livraria.setPreco(preco);
                encontrado = true;
                System.out.println("Livro foi atualizado com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Livro não encontrado! Verifique o ID: " + id);
        }
    }

    private static void deleteLivraria(Scanner scanner) {
        System.out.print("Digite o ID do livro que deseja remover: ");
        int id = scanner.nextInt();


        boolean removido = false;
        Iterator<Livraria> iterator = listaDeLivros.iterator();
        while (iterator.hasNext()) {
            Livraria livraria = iterator.next();
            if (livraria.getId() == id) {
                iterator.remove();
                removido = true;
                break;
            }
        }

        if (removido) {
            System.out.println("Livro foi excluido com sucesso!");
        } else {
            System.out.println("Livro não encontrado! Verifique o ID: " + id);
        }
    }
}
