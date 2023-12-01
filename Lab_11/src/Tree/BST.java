package Tree;

import java.util.Collection;
import java.util.List;

public class BST<E extends Comparable<E>> {
	private BNode<E> root;

	public BST() {
		this.root = null;
	}
	
	
	// Task 1: Basic Operations with BST 

	@Override
	public String toString() {
		return "BST [root=" + root + "]";
	}

	
	// Add element e into BST
	public void add(E e) {
		  if (root == null) {
	            root = new BNode<>(e);
	        } else {
	            root.add(e);
	        }
	    }
	
	 // Add a collection of elements col into BST
	public void add(Collection<E> col) {
		for (E e : col) {
			add(e);
		}
	}

	// compute the depth of a node in BST
	public int depth(E node) {
		return root.depth(node);
	}

	// compute the height of BST
	public int height() {
	    return root.height();
	}

	// Compute total nodes in BST
	public int size() {
		return root.size();
	}

	// Check whether element e is in BST
	public boolean contains(E e) {
		return root.contains(e);
	}

	// Find the minimum element in BST
	public E findMin() {
		return root.findMin();
	}

	// Find the maximum element in BST
	public E findMax() {
		return root.findMax();
	}

	// Remove element e from BST
	public boolean remove(E e) {
		return root.remove(e);
	}

	// get the descendants of a node
	public List<E> descendants(E data) {
		return root.descendants(data);
	}

	// get the ancestors of a node
	public List<E> ancestors(E data) {
		return root.ancestors(data);
	}
	
	
	// Task 2: Tree Traversal Algorithms

	// display BST using inorder approach
	public void inorder() {
		root.inorder();
	}

	// display BST using preorder approach
	public void preorder() {
		root.preorder();
	}

	// display BST using postorder approach
	public void postorder() {
		root.postorder();
	}

}
