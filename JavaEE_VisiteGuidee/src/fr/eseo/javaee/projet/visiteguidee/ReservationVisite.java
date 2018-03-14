/**
 * 
 */
package fr.eseo.javaee.projet.visiteguidee;

/**
 * @author lubuntu
 *
 */
public class ReservationVisite {

	/**
	 * constructeur vide
	 */
	public ReservationVisite() {
		int codeReservation = 0;
		int codeVisite = 0;
		int codeClient = 0;
		int nombrePersonnes = 0;
		boolean payementEffectue = false;
	}
	
	/**
	 * constructeur non vide
	 */
	public ReservationVisite(int codeReservation1, int codeVisite1, int codeClient1, int nombrePersonnes1,boolean payementEffectue1) {
		int codeReservation = codeReservation1;
		int codeVisite = codeVisite1;
		int codeClient = codeClient1;
		int nombrePersonnes = nombrePersonnes1;
		boolean payementEffectue = payementEffectue1;
	}

}
