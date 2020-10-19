
public class Pilha<T> {

	private int size;
	private Node<T> top;

	public void push(Curso elemento) throws Exception {

		Node nova = new Node(elemento, top);
		this.top = nova;
		this.size++;
	}

	public T peek() throws Exception {

		if (this.isEmpty()) {
			throw new Exception("A Pilha esta vazia");
		}
		T value = this.top.getElemento();

		return value;
	}

	public void pop() throws Exception {

		if (this.isEmpty()) {
			throw new Exception("A Pilha esta vazia");
		}

		this.top = this.top.getProximo();
        this.size--;

	}

	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

}
