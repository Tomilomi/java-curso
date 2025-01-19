package Generalidades;


public class ControlesDeFlujo {

	public static void main(String[] args) throws Exception {
		
		int i;
		
		
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
				// continue es como un jump,  saltea las lineas posteriores del scope

			}
		}
	}

}
