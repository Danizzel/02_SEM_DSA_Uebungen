package dsaLinkedList;

public class Main {

	public static void main(String[] args) {
		String [] namen = "Franz,Chris,Anna,Gine,Bernd,Dieter,Horst,Evelyn".split(",");
		DsaListe liste = new DsaLinkedList();
		
		for(String s : namen) {
			liste.anhaengen(s);
		}
		
		System.out.println("Liste: " + liste);
		System.out.print("Anna ausgeben -> ");
		Element el = liste.hole("Anna");
		System.out.println(el.getData());
		
		System.out.print("Franz löschen -> "); 	
		el = liste.holeVorgaengerVon("Franz");
		// Der Vorgänger von Anna ist der Anker
		liste.loescheNachfolgerVon(el);
		System.out.println(liste);
		
;		System.out.print("Frieda nach Bernd einfügen -> ");
		el = liste.hole("Bernd");
		liste.einfuegenNach(el, "Frieda");
		System.out.println(liste);

		System.out.print("Horst löschen -> ");		
		el = liste.holeVorgaengerVon("Horst");		
		liste.loescheNachfolgerVon(el);
		System.out.println(liste);
		
		System.out.print("Evelyn löschen -> ");		
		el = liste.holeVorgaengerVon("Evelyn");		
		liste.loescheNachfolgerVon(el);
		System.out.println(liste);
	}

}
