import LinkedList.Node;

/*
 * An implementation of a LinkedList, where T is the type of data held.
 */
public class LinkedList<T> {
	/*
	 * A single node in the LinkedList.
	 */
	private class Node<T> {
		private Node<T> m_next;
		private T m_data;
		private Node(Node<T> next, T data) {
			m_next = next;
			m_data = data;
		}
	}
	private class Head {
		private Node<T> m_next;
		private Head(Node<T> next) {
			m_next = next;
		}
	}
	
	private Head m_head; //"Pointer" to head of the LinkedList.
	private Node<T> m_cur; //"Pointer" to the current node.
	private int m_size;
	
	//A constructor to create an empty LinkedList.
	public LinkedList() {
		m_cur = null;
		m_head = new Head(m_cur);
		m_size = 0;
	}
	
	//Adds a node immediately after the node c, holding the data t. After adding, the current node m_cur will now point to the added node.
	//If addHead is true, adds to the beginning and does not read c.
	public void add(Node<T> c, T t, boolean addHead) {
		Node<T> newnode;
		if(addHead) {
			newnode = new Node<T>(m_head.m_next, t);
		} else {
			newnode = new Node<T>(m_cur.m_next, t);
		}
		m_cur = newnode;
		m_size++;
	}
	
	public static void main(String[] args) {
	}
}