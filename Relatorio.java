package model;


public class Relatorio {
    private int id;
    private String titulo;
    private String descricao;
    private String statusRelatorio;
    private Usuario usuario;
    
    public Relatorio() {}

    public Relatorio(int id, String titulo, String descricao, String statusRelatorio, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusRelatorio = statusRelatorio;
        this.usuario = usuario;
    }
    
    public Relatorio(String titulo, String descricao, String statusRelatorio, Usuario usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusRelatorio = statusRelatorio;
        this.usuario = usuario;
    }
    
    public Relatorio(int id, String titulo, String descricao, String statusRelatorio) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusRelatorio = statusRelatorio;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatusRelatorio() {
        return statusRelatorio;
    }

    public void setStatusRelatorio(String statusRelatorio) {
        this.statusRelatorio = statusRelatorio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Relatorio{" + "id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", statusRelatorio=" + statusRelatorio + ", usuario=" + usuario + '}';
    }
            
}