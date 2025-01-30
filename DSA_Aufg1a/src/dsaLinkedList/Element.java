package dsaLinkedList;

public class Element {
	private String data;
	private Element nextElement;

	public Element(String data, Element nextElement) {
		super();
		this.data = data;
		this.nextElement = nextElement;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Element getNextElement() {
		return nextElement;
	}

	public void setNextElement(Element nextElement) {
		this.nextElement = nextElement;
	}

}
