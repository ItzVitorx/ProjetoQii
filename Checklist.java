package model;


public class Checklist {
    private int id;
    private String titulo;
    private String descricao;
    private String statusChecklist;
    private Usuario usuario;
    
    public Checklist() {}

    public Checklist(int id, String titulo, String descricao, String statusChecklist, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusChecklist = statusChecklist;
        this.usuario = usuario;
    }
    
    public Checklist(String titulo, String descricao, String statusChecklist, Usuario usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusChecklist = statusChecklist;
        this.usuario = usuario;
    }
    
    public Checklist(int id, String titulo, String descricao, String statusChecklist) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusChecklist = statusChecklist;
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

    public String getStatusChecklist() {
        return statusChecklist;
    }

    public void setStatusChecklist(String statusChecklist) {
        this.statusChecklist = statusChecklist;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Checklist{" + "id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", statusChecklist=" + statusChecklist + ", usuario=" + usuario + '}';
    }
            
}