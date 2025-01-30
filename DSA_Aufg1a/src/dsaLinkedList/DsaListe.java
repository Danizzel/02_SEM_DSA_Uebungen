package dsaLinkedList;

/**
 * Ein Interface, welches besonders für verkette Listen geeignet ist
 * 
 */
public interface DsaListe {

	public void anhaengen(String s);
	// ein neues Element mit Inhalt s erzeugen und ans Ende
	// der Liste anfügen

	public void einfuegenNach(Element el, String s);
	// ein neues Element mit Inhalt s erzeugen und
	// zwischen el und dem Nachfolger von el einfügen

	public void loescheNachfolgerVon(Element el);
	// den Nachfolger von el löschen, aber den Rest
	// beibehalten

	public Element hole(String s);
	// das (erste) Element zurückgeben, welches
	// s als Inhalt hat

	public Element holeVorgaengerVon(String s);
	// den Vorgänger des (ersten) Elements zurückgeben,
	// welches s als Inhalt hat

}