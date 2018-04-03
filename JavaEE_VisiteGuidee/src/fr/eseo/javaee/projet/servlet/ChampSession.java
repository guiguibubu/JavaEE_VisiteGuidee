package fr.eseo.javaee.projet.servlet;

public class ChampSession {

	private ChampSession(){};

	//IHM
	public static final String VUE_CONNEXION = "index.jsp";
	public static final String VUE_RECHERCHE = "recherche.jsp";
	public static final String VUE_PAIEMENT = "paiement.jsp";
	public static final String VUE_MES_RESERVATION = "mesReservations.jsp";
	public static final String VUE_RESULTAT_RECHERCHE = "gestionVisites.jsp";
	//Action
	public static final String ATT_ACTION = "action";
	public static final String ATT_SUCCES_ANNULATION = "succesAnnulation";
	public static final String ATT_SUCCES_RESERVATION = "succesReservation";
	public static final String ATT_NOUVELLE_RECHERCHE = "newSearch";
	//Messages
	public static final String ATT_ERREUR = "erreur";
	public static final String ATT_WARNING = "warning";
	public static final String ATT_SUCCES = "succes";
	// Visite
	public static final String ATT_ID_VISITE = "idVisite";
	public static final String ATT_TYPE_VISITE = "typeVisite";
	public static final String ATT_VILLE = "ville";
	public static final String ATT_DATE_VISITE = "dateVisite";
	public static final String ATT_PRIX = "prix";
	public static final String ATT_LISTE_VISITES = "listeVisites";
	//Client
	public static final String ATT_ID_CLIENT = "idClient";
	public static final String ATT_PRENOM = "prenom";
	public static final String ATT_NOM = "nom";
	//Reservation
	public static final String ATT_ID_RESERVATION = "idReservation";
	public static final String ATT_LISTE_RESERVATIONS = "listeReservations";
	//Parking
	public static final String ATT_LISTE_PARKING = "listeParking";
}
