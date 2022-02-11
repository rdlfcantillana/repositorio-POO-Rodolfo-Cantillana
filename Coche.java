package pooCoches;

public class Coche {

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
	 private boolean AsientosCuero, Climatizador; 
	  
	 // metodo constructor () 
	  
	 public Coche () { 
	   
	  Ruedas= 4; 
	  Largo= 2000; 
	  Ancho= 300; 
	  Motor= 1600; 
	  PesoPlataforma= 500; 
	  PesoCarroceria= 500; 
	   
	 } 
	  
	  //getter 
	 public String DimeLargo() { 
	  return "el Largo del coche es:  "+ Largo; 
	     
	 } 
	  
	 public String DimeAncho() { 
	  return "el Ancho del coche es:  "+ Ancho; 
	     
	 } 
	  
	  
	 public String DimeRuedas() { 
	  return "el numero de Ruedas es: "+Ruedas; 
	 } 
	 public String Dimecolor () { 
	  return "El color de el coche es "+color; 
	 } 
	 public String DimeClimatizador() { 
	  if(Climatizador==true) { 
	   return "El coche incorpora climatizador"; 
	  }else { 
	   return "El coche lleva aire acondicionado"; 
	  } 
	 } 
	    public String DimeAsientos() { 
	        
	       if(AsientosCuero==true){ 
	          
	         return "los asientos son de cuero"; 
	       }else { 
	         return "los asientos son de serie"; 
	       } 
	      } 
	     
	    public String DimeMotor() { 
	    return "el Motor del coche es de:  "+ Motor; 
	       
	   } 
	    public String DimePesoPlataforma() { 
	    return "el Peso Plataforma del coche es:  "+ PesoPlataforma; 
	       
	   } 
	     
	     
	    public String DimePesoTotal() {//SETTER + GETTER 
	     
	        
	       PesoTotal=PesoPlataforma+PesoCarroceria; 
	            
	       if(AsientosCuero==true) { 
	          
	         PesoTotal=PesoTotal+50; 
	          
	       } 
	       if(Climatizador==true) { 
	         PesoTotal=PesoTotal+20; 
	       } 
	        
	       return "el Peso Total del coche es "+PesoTotal; 
	     } 
	     
	     
	     
	     
	     
	 
	 //Setters 
	  
	 public void estableceLargo (int LargoCoche) { 
	  Largo=LargoCoche; 
	 } 
	  
	 public void estableceAncho (int AnchoCoche) { 
	  Ancho=AnchoCoche; 
	 } 
	  
	 public void establececolor(String colorCoche) { 
	   
	  color=colorCoche; 
	 } 
	     
	      
	 
	 public void estableceRuedas(int RuedasCoche) { 
	 
	   Ruedas=RuedasCoche; 
	 } 
	    public void estableceClimatizador (String Climatizador) 
	    { 
	     if(Climatizador.equalsIgnoreCase("si")) { 
	      this.Climatizador=true; 
	     }else { 
	      this.Climatizador=false; 
	      
	     } 
	    } 
	    public void estableceAsientosCuero(String AsientosCuero) { 
	         
	        if(AsientosCuero.equalsIgnoreCase("si")){ 
	           
	          this.AsientosCuero=true; 
	        }else { 
	          this.AsientosCuero=false; 
	        } 
	       
	            } 
	     
	    public void estableceMotor (int MotorCoche) { 
	  Motor=MotorCoche; 
	 } 
	     
	    public void establecePesoPlataforma (int PesoPlataformaCoche) { 
	  PesoPlataforma=PesoPlataformaCoche; 
	 } 
	
	
	
	

	}


