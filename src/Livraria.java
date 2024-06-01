public class Livraria {

    private int id;
    private String titulo;
    private String genero;
    private String autor;
    private String idioma;
    private String sinopse;
    private int paginas;
    private int quantidade;
    private int anopublicacao;
    private double preco;

    public Livraria (int id, String titulo, String genero, String autor, String idioma,
    String sinopse, int paginas, int quantidade, int anopublicacao, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.idioma = idioma;
        this.sinopse = sinopse;
        this.paginas = paginas;
        this.quantidade = quantidade;
        this.anopublicacao = anopublicacao;
        this.preco = preco;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getAnopublicacao() {
        return anopublicacao;
    }
    public void setAnopublicacao(int anopublicacao) {
        this.anopublicacao = anopublicacao;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro {" + "\n" +
                "id:" + id + "\n" +
                "titulo:'" + titulo + '\'' + "\n" +
                "genero:'" + genero + '\'' + "\n" +
                "autor:'" + autor + '\'' + "\n" +
                "idioma:'" + idioma + '\'' + "\n" +
                "sinopse:'" + sinopse + '\'' + "\n" +
                "paginas:" + paginas + "\n" +
                "quantidade:" + quantidade + "\n" +
                "anoPublicacao:" + anopublicacao + "\n" +
                "preco:" + preco + "\n" +
                '}';
    }


}
