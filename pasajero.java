package EXAMEN1;


	public class pasajero extends vehiculoAereo{
	    private int calidadAsientos; 

	    public pasajero(){
	        super("Avion de Pasajeros", 680, 325, 1, 0, 193, 2); 
	        //nombre, peso, capacidad de carga, helices, turbinas, velocidad maxima y numero de pasajeros
	        calidadAsientos = 5; 
	    }

	    public void setCalidad(int cal){
	        calidadAsientos = cal;
	        System.out.println("Ahora la calidad de los asientos es de: " + cal);
	    }

	    public void getCalidad(){
	        System.out.println("La calidad de los asientos de este avion de pasajeros es de: " + calidadAsientos);
	    }

	    public void calcularPrecioEspecifico(){
	        float precioBase = calcularPrecioBase();
	        float precioEspecifico = precioBase + calidadAsientos * 250;
	        System.out.println("El Precio Especifico de este avion de carga es de: " + precioEspecifico);
	    }
	}

