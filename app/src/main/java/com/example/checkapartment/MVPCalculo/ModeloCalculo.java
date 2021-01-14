package com.example.checkapartment.MVPCalculo;

public class ModeloCalculo {
    private int luces;
    private int dormitorio;
    private int cocina;
    private int banio;
    private int terminaciones;
    private int resultadoCalculo;

    public void calculoRevision(int luces, int dormitorio, int cocina, int banio,
                                int terminaciones){
      int resultado = luces + dormitorio + cocina + banio;
      this.resultadoCalculo = resultado * terminaciones;
    }

    public ModeloCalculo() {

    }

    public ModeloCalculo(int luces, int dormitorio, int cocina, int banio, int terminaciones) {
        this.luces = luces;
        this.dormitorio = dormitorio;
        this.cocina = cocina;
        this.banio = banio;
        this.terminaciones = terminaciones;
    }

    public int getLuces() {
        return luces;
    }

    public void setLuces(int luces) {
        this.luces = luces;
    }

    public int getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(int dormitorio) {
        this.dormitorio = dormitorio;
    }

    public int getCocina() {
        return cocina;
    }

    public void setCocina(int cocina) {
        this.cocina = cocina;
    }

    public int getBanio() {
        return banio;
    }

    public void setBanio(int banio) {
        this.banio = banio;
    }

    public int getTerminaciones() {
        return terminaciones;
    }

    public void setTerminaciones(int terminaciones) {
        this.terminaciones = terminaciones;
    }

    public int getResultadoCalculo() {
        return this.resultadoCalculo;
    }

}
