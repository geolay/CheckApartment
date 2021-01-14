package com.example.checkapartment.MVPCalculo;

public class PresentadorCalculo {
    private ModeloCalculo modeloCalculo;
    private ICalculo iCalculo;

    public PresentadorCalculo(ICalculo iCalculo) {
        this.modeloCalculo = new ModeloCalculo();
        this.iCalculo = iCalculo;
    }

    public void calculoRevision(int luces, int dormitorio, int cocina, int banio, int terminaciones){
        modeloCalculo.calculoRevision(luces, dormitorio, cocina, banio, terminaciones);
    }
    public int resultadoCalculo(){
        return modeloCalculo.getResultadoCalculo();
    }

}
