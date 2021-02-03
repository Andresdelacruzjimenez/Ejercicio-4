
public class Libro {

	private String titulo;
	private String autor;
	private String tipo;
	private int cantidad;
	
	
	Libro(){
	
		titulo=null;
		autor=null;
		tipo=null;
		cantidad=0;
	}

	Libro(String titulo, String autor, String tipo, int cantidad){
		
		this.titulo=titulo;
		this.autor=autor;
		this.tipo=tipo;
		this.cantidad=cantidad;
		
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public int prestamo(int cuantos) {
		
		int cantidad=this.getCantidad();
		cantidad=this.getCantidad()-cuantos;
		if (cantidad==0) {
			cantidad=0;
		}
		return cantidad;
	}
	
	public int devolucion(int cuantos) {
		int cantidad=this.getCantidad();
		cantidad=this.getCantidad()+cuantos;
		return cantidad;
	}
	
	
	

	public String toString() {
		return this.getTitulo()+" de "+this.getAutor()+", "+this.getTipo()+", disponibles: "+this.getCantidad();
	}

	
	
	
	

}
