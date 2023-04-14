package br.com.dio.desafio.dominio;

public class Curso {
    private String titluo;
    private String descricao;
    private int cargaHoraria;
    
    public Curso() {
    }

    public String getTitluo() {
        return titluo;
    }
    public void setTitluo(String titluo) {
        this.titluo = titluo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso [titluo=" + titluo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
    }

    
}
