/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.una.estatistica;

/**
 *
 * @author Lucas Samoyedem
 */
public class DistribuicaoDeFrequencia {

    private Integer inicio;
    private Integer fim;
    private Integer fi;
    private Integer fac;
    private Double fiPorcent;
    private Double facr;

    public DistribuicaoDeFrequencia() {
    }

    public DistribuicaoDeFrequencia(Integer inicio, Integer fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Integer getInicio() {
        return inicio;
    }

    public void setInicio(Integer inicio) {
        this.inicio = inicio;
    }

    public Integer getFim() {
        return fim;
    }

    public void setFim(Integer fim) {
        this.fim = fim;
    }

    public Integer getFi() {
        return fi;
    }

    public void setFi(Integer fi) {
        this.fi = fi;
    }

    public Double getXi() {
        return (inicio + fim) / 2.0;
    }

    public Integer getFac() {
        return fac;
    }

    public void setFac(Integer fac) {
        this.fac = fac;
    }

    public Double getFiPorcent() {
        return fiPorcent;
    }

    public void setFiPorcent(Double fiPorcent) {
        this.fiPorcent = fiPorcent;
    }

    public Double getFacr() {
        return facr;
    }

    public void setFacr(Double facr) {
        this.facr = facr;
    }

    public String getValor() {
        return inicio + " |- " + fim;
    }
}
