package math;

import java.util.HashMap;
import java.util.Map;

/**
 * A node inside a tree.
 * 
 * @author Zak_b
 *
 * @param <T>
 *            The type of the value stored in the node.
 */
public class Node<T> {
	/**
	 * The value stored inside the node.
	 */
	private T value;

	/**
	 * The weighted edges connecting the node with other nodes. The Key is the
	 * node that this node connects to and the value is the weight of the
	 * connection.
	 * 
	 */
	Map<Node<T>, Integer> edges;

	/**
	 * Default constructor.
	 */
	public Node() {
		edges = new HashMap<Node<T>, Integer>();

	}

	/**
	 * Sets the connection from this node to the specified node with the
	 * specified weight. If the connection already exists, the old edge weight
	 * is replaced.
	 * 
	 * @param node
	 * @param weight
	 */
	public void setConnection(Node<T> node, int weight) {
		edges.put(node, weight);
	}

	/**
	 * Sets the value stored in this node.
	 * 
	 * @param value
	 *            The new value
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * Reports the value stored in this node.
	 * 
	 * @return The value
	 */
	public T getValue() {
		return this.value;
	}
}
