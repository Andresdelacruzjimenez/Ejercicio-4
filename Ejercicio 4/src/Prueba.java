
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro ejemplo=new Libro("Crimen y Castigo", "Dostoievsky", "Novela",10);
		System.out.println(ejemplo.getCantidad());
		
		System.out.println(ejemplo.prestamo(1));
		
		
	}

}
