package models;

public class BolsilloDigitalVo {

    private int Id_BolsilloDigital;
    private String nombre_Bolsillo;
    private boolean estado_Bolsillo ;
    

    public BolsilloDigitalVo() {
    }

    public BolsilloDigitalVo(int Id_BolsilloDigital, String nombre_Bolsillo, boolean estado_Bolsillo ) {
        this.Id_BolsilloDigital = Id_BolsilloDigital;
        this.nombre_Bolsillo = nombre_Bolsillo;
        this.estado_Bolsillo = estado_Bolsillo ;
       
    }

    public int getId_BolsilloDigital() {
        return Id_BolsilloDigital;
    }

    public void setId_BolsilloDigital(int id_BolsilloDigital) {
        Id_BolsilloDigital = id_BolsilloDigital;
    }

    public String getNombre_Bolsillo() {
        return nombre_Bolsillo;
    }

    public void setNombre_Bolsillo(String nombre_Bolsillo) {
        this.nombre_Bolsillo = nombre_Bolsillo;
    }

    public boolean getEstado_Bolsillo() {
        return estado_Bolsillo;
    }

    public void setEstado_Bolsillo(boolean estado_Bolsillo) {
        this.estado_Bolsillo = estado_Bolsillo;
    }

    

    


    

   

}