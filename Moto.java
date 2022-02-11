package pooCoches;

public class Moto {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

	}
	
	 private int Largo; 
	 private int Ancho; 
	 private int Ruedas; 
	 private int Motor; 
	 private int PesoPlataforma; 
	 private int PesoCarroceria; 
	  
	 private String color; 
	 private int PesoTotal; 
	 private boolean AsientosCuero; 
	  
	 // metodo constructor () 
	  
	 public Moto () { 
	   
	  Ruedas= 2; 
	  Largo= 1000; 
	  Ancho= 100; 
	  Motor= 700; 
	  PesoPlataforma= 200; 
	  PesoCarroceria= 200; 
	   
	 } 
	  
	  //getter 
	 public String DimeLargo() { 
	  return "el Largo de la moto es:  "+ Largo; 
	     
	 } 
	  
	 public String DimeAncho() { 
	  return "el Ancho de la moto es:  "+ Ancho; 
	     
	 } 
	  
	  
	 public String DimeRuedas() { 
	  return "el numero de Ruedas es: "+Ruedas; 
	 } 
	 public String Dimecolor () { 
	  return "El color de la moto es "+color; 
	 } 
	     public String DimeAsientos() { 
	        
	       if(AsientosCuero==true){ 
	          
	         return "los asientos son de cuero"; 
	       }else { 
	         return "los asientos son de serie"; 
	       } 
	      } 
	     
	    public String DimeMotor() { 
	    return "el Motor de la moto es de:  "+ Motor; 
	       
	   } 
	    public String DimePesoPlataforma() { 
	    return "el Peso Plataforma de la moto es:  "+ PesoPlataforma; 
	       
	   } 
	     
	     
	    public String DimePesoTotal() {//SETTER + GETTER 
	     
	        
	       PesoTotal=PesoPlataforma+PesoCarroceria; 
	            
	       if(AsientosCuero==true) { 
	          
	         PesoTotal=PesoTotal+10; 
	          
	       } 
	      
	        
	        
	       return "el Peso Total de la moto es "+PesoTotal; 
	     } 
	     
	     
	     
	     
	     
	 
	 //Setters 
	  
	 public void estableceLargo (int LargoMoto) { 
	  Largo=LargoMoto; 
	 } 
	  
	 public void estableceAncho (int AnchoMoto) { 
	  Ancho=AnchoMoto; 
	 } 
	  
	 public void establececolor(String colorMoto) { 
	   
	  color=colorMoto; 
	 } 
	     
	      
	 
	 public void estableceRuedas(int RuedasMoto) { 
	 
	   Ruedas=RuedasMoto; 
	 } 
	    
	     
	    public void estableceAsientosCuero(String AsientosCuero) { 
	         
	        if(AsientosCuero.equalsIgnoreCase("si")){ 
	           
	          this.AsientosCuero=true; 
	        }else { 
	          this.AsientosCuero=false; 
	        } 
	       
	            } 
	     
	    public void estableceMotor (int MotorMoto) { 
	  Motor=MotorMoto; 
	 } 
	     
	    public void establecePesoPlataforma (int PesoPlataformaMoto) { 
	  PesoPlataforma=PesoPlataformaMoto; 
	 } 
	
	
	
	
	
	
	
	
	
	

}
