public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro( "O Hobbit",8.99);
        meuLivro.setPaginas(521);
        meuLivro.setResumo ("bla bla bla bla bla");
        meuLivro.setAutor("J. R. Tolkien");

        Editora editora1 = new Editora("Editora Erica");
        //editora1.nome ="Editora Erica";
        editora1.email = "edErica@gmail.com";
        meuLivro.setEditora (editora1);

        meuLivro.aplicarDesconto(0.2);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro( "O Código Da Vinci",8.99);
        livroFavorito.setResumo ("bla bla bla bla bla");
        livroFavorito.setPaginas (500);
        livroFavorito.setAutor("Dan Brown");
        livroFavorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
