
public class CalendarioBasico{
  private int dia;
  private int mes;
  private int ano; 
  
  public CalendarioBasico(){
      dia = 1;
      mes = 1;
      ano = 1;
  }
  public String obteneFecha() {
      String elDia = ""+dia;
      String esteMes = ""+mes;
      String esteAno = ""+ano;
      
      if(dia < 10){
          elDia = "0"+dia;
      }
      if (mes < 10){
          esteMes = "0"+mes;
      }
      if (ano <10){
          esteAno = "0"+ano;
      }return elDia +"-"+esteMes+"-"+esteAno;
      
    
}
  public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
      nuevoDia = nuevoDia;
      nuevoMes = nuevoMes;
      nuevoAno = nuevoAno; 
    
      dia = nuevoDia;
      mes = nuevoMes;
      ano = nuevoAno;
  }
  
  public void avanzarFecha(){
      dia = dia + 1;
      
      if(dia > 30){
          dia = 1;
          mes = mes + 1;
      }
      if (mes > 12){
          mes = 1;
          ano = ano + 1;
      }
      if (ano > 99){
          dia = 1;
          mes = 1;
          ano = 1;
      }
  }
  
  

  






   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

