package logica;

public class Limpieza extends Producto{
	private int anioVen;
	
	public Limpieza() {
		
	}

	
	

	public Limpieza(int codigo, String nombreCom, double costo, int anioVen) {
		super(codigo, nombreCom, costo);
		this.anioVen = anioVen;
	}




	public int getAnioVen() {
		return anioVen;
	}

	public void setAnioVen(int anioVen) {
		this.anioVen = anioVen;
	}

	@Override
    public String toString() {
        return "Limpieza [codigo=" + getCodigo() + ", nombreCom=" + getNombreCom() + ", costo=" + getCosto() + ", anioVen=" + anioVen + "]";
    }
	
	 public double Precio() {
	        if ( getAnioVen() < 2022) 
	            return getCosto() - 5;
	        else 
	            return getCosto();
	        
	    }
}
    





