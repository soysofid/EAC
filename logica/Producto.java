package logica;
import java.util.ArrayList;

public class Producto {
    
    private ArrayList<Producto> lista = new ArrayList<>();
    
    private int codigo;
    private String nombreCom;
    private double costo;
    
    public Producto() {
        
    }
    
    public Producto(int codigo, String nombreCom, double costo) {
        super();
        this.codigo = codigo;
        this.nombreCom = nombreCom;
        this.costo = costo;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    public String getNombreCom() {
        return nombreCom;
    }
    
    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }
    
    
    
    public double getCosto() {
        return costo;
    }
    
    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", nombreCom=" + nombreCom + ", costo=" + costo + "]";
    }
    
    
    public int cantidad() {
        return lista.size();
    }
    
    
    
   public double Precio() {
      if (costo > 200) 
           return costo + 5;
       else 
           return costo - 5;
   		}
    
    
   

}

