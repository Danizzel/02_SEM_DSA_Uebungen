package dsaLinkedList;

public class DsaLinkedList implements DsaListe {

	final Element anker = new Element("", null);

	@Override
	public void anhaengen(String s) {
	// ein neues Element mit Inhalt s erzeugen und ans Ende
	// der Liste anfügen
	}

	@Override
	public void einfuegenNach(Element el, String s) {
		// ein neues Element mit Inhalt s erzeugen und 
		// zwischen el und dem Nachfolger von el einfügen
	}

	@Override
	public void loescheNachfolgerVon(Element el) {
		// den Nachfolger von el löschen, aber den Rest 
		// beibehalten
	}
	
	@Override
	public Element hole(String s) {
		// das (erste) Element liefern, welches
		// s als Inhalt hat
		return null;
	}

	@Override
	public Element holeVorgaengerVon(String s) {
		// den Vorgänger des (ersten) Elements liefern,
		// welches s als Inhalt hat		
		return null;
	}

	@Override
	public String toString() {
		// die Elemente hintereinander kommagetrennt liefen
		return "??";
	}





}