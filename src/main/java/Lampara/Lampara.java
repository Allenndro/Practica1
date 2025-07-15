package Lampara;

public class Lampara{
  private String color;
  private String intensidad;
  private boolean encendida;
  
  public Lampara(){
    this.encendida = false;
  }
  
  public Lampara(String color, String intensidad){
    this.color = color;
    this.intensidad = intensidad;
    this.encendida = false;
  }
        
  public void encender(){
    if (encendida == true){
      System.out.println("la lampara ya está encendida con una intensidad " + intensidad + " y de color " + color );
    } else  {
      encendida = true;
      System.out.println("la lampara se encendió");
    }
  }
  
  public void apagar(){
    if (encendida == false){
      System.out.println("la lampara ya está apagada");
    } else {
      encendida = false;
      System.out.println("la lampara se apagó");
    }
  }
  
  public void mostrarEstado(){
    if (encendida){
      System.out.println("la lampara está encendida");
    }
    else{
      System.out.println("la lampara está apagada");
    }
  }
  
  public String getColor(){
    return color;
  }
  
  public void setColor(String color){
    this.color = color;
  }
  
  public String getIntensidad(){
    return intensidad;
  }
  
  public void setIntensidad(String intensidad){
    this.intensidad = intensidad;
  }
  
  public boolean getEncendida(){
    return encendida;
  }
  
  public void setEncendida(boolean encendida){
    this.encendida = encendida;
  }
}
