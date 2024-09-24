//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Pilhas
//        Pilha livros = new Pilha(5);
//        livros.empilhar("Livro 1");
//        livros.empilhar("Livro 2");
//        livros.empilhar("Livro 3");
//        String livroRemovido = livros.desempilhar();
//        System.out.println(livroRemovido + " foi removido da pilha.");
//        livros.empilhar("Livro 4");
//        livros.empilhar("Livro 5");
//        livros.empilhar("Livro 6");
//        System.out.println(livros);
// CTRL + / para selecionar ao mesmo tempo

        //Filas
        Fila docs = new Fila(3);
        docs.enfileirar("Doc 1");
        docs.enfileirar("Doc 2");
        docs.enfileirar("Doc 3");
//        System.out.println(docs.espiar());
        String docRemovido = docs.desenfileirar();
        System.out.println(docRemovido + " foi removido da fila.");
        System.out.println(docs);
    }
}