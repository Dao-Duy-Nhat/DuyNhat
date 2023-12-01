package Tree;

import java.util.ArrayList;
import java.util.List;

public class BNode<E extends Comparable<E>> {
	private E data;
	private BNode<E> myLeft;
	private BNode<E> myRight;

	public BNode(E data) {
		this.data = data;
		this.myLeft = null;
		this.myRight = null;
	}

	public BNode(E data, BNode<E> left, BNode<E> right) {
		this.data = data;
		this.myLeft = left;
		this.myRight = right;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public BNode<E> getMyLeft() {
		return myLeft;
	}

	public void setMyLeft(BNode<E> myLeft) {
		this.myLeft = myLeft;
	}

	public BNode<E> getMyRight() {
		return myRight;
	}

	public void setMyRight(BNode<E> myRight) {
		this.myRight = myRight;
	}

	@Override
	public String toString() {
		return "BNode [data=" + data + ", myLeft=" + myLeft + ", myRight=" + myRight + "]";
	}

	// Add element e into BST
	public void add(E element) {
		if (data == null) {
			this.data = element;
		} else {
			addRecursive(element);
		}
	}

	private void addRecursive(E element) {
		int compareResult = element.compareTo(data);

		if (compareResult < 0) {
			if (myLeft == null) {
				myLeft = new BNode<>(element);
			} else {
				myLeft.add(element);
			}
		} else if (compareResult >= 0) {
			if (myRight == null) {
				myRight = new BNode<>(element);
			} else {
				myRight.add(element);
			}
		}
	}

	// compute the depth of a node in BST
	public int depth(E node) {
		return depthRecursive(this, node, 0);
	}

	private int depthRecursive(BNode<E> node, E e, int count) {
		if (node == null) {
			return -1;
		}
		if (e.equals(node.getData())) {
			return count;
		} else if (e.compareTo(node.getData()) < 0) {
			return depthRecursive(node.getMyLeft(), e, count + 1);
		} else
			return depthRecursive(node.getMyRight(), e, count + 1);

	}

	// compute the height of BST
	public int height() {
		return heightRecursive(this);
	}

	private int heightRecursive(BNode<E> node) {
		if (node == null) {
			return -1;
		}

		int leftHeight = heightRecursive(node.getMyLeft());
		int rightHeight = heightRecursive(node.getMyRight());

		return Math.max(leftHeight, rightHeight) + 1;

	}

	// Compute total nodes in BST
	public int size() {
		return sizeRecursive(this);
	}

	private int sizeRecursive(BNode<E> node) {
		if (node == null) {
			return 0;
		}
		int leftHeight = sizeRecursive(node.getMyLeft());
		int rightHeight = sizeRecursive(node.getMyRight());
		
		return leftHeight + rightHeight + 1;
		
	}

	// Check whether element e is in BST
	public boolean contains(E e) {
		int cmp = e.compareTo(data);
		if (cmp == 0) {
			return true;
		} else if (cmp < 0) {
			return (myLeft == null) ? false : myLeft.contains(e);
		} else {
			return (myRight == null) ? false : myRight.contains(e);
		}
	}
	
	// Find the minimum element in BST
	public E findMin() {
	    if (myLeft == null) {
	        return data;
	    } else {
	        return myLeft.findMin(); 
	    }
	}
	
	// Find the maximum element in BST
	public E findMax() {
	    if (myRight == null) {
	        return data; 
	    } else {
	        return myRight.findMax(); 
	    }
	}
	
	// Remove element e from BST
	public boolean remove(E e) {
	    if (e.compareTo(this.data) < 0) {
	        if (myLeft != null) {
	            if (myLeft.remove(e)) {
	                return true;
	            }
	        }
	        return false;
	    } else if (e.compareTo(this.data) > 0) {
	        if (myRight != null) {
	            if (myRight.remove(e)) {
	                return true;
	            }
	        }
	        return false;
	    } else {
	        if (myLeft == null) {
	            // Case 1: No left child
	            return (myRight != null);
	        } else if (myRight == null) {
	            // Case 2: No right child
	            return (myLeft != null); 
	        } else {
	            // Case 3: Node to be removed has two children
	            this.data = myRight.findMin();
	            myRight.remove(this.data);
	            return true;
	        }
	    }
	}

	
	// get the descendants of a node
	public List<E> descendants(E data) {
	    List<E> list = new ArrayList<>();
	    descendantsRecursive(this, data, list);
	    return list;
	}

	private void descendantsRecursive(BNode<E> node, E data, List<E> list) {
	    if (node == null) {
	        return;
	    }

	    if (node.getData().equals(data)) {
	        addDescendants(node.getMyLeft(), list);
	        addDescendants(node.getMyRight(), list);
	    } else if (data.compareTo(node.getData()) < 0) {
	        descendantsRecursive(node.getMyLeft(), data, list);
	    } else {
	        descendantsRecursive(node.getMyRight(), data, list);
	    }
	}

	private void addDescendants(BNode<E> node, List<E> list) {
	    if (node == null) {
	        return;
	    }

	    list.add(node.getData());
	    addDescendants(node.getMyLeft(), list);
	    addDescendants(node.getMyRight(), list);
	}

	// get the ancestors of a node
		public List<E> ancestors(E e) {
			int comp = e.compareTo(data);
			List<E> re = new ArrayList<>();
			if (comp == 0) {
				return re ;
			}
			if (myLeft != null) {
			if (myLeft.contains(e)) {
				re.addAll(myLeft.ancestors(e));
				re.add(data);
			}
			}
			if (myRight!=null) {
				if (myRight.contains(e)) {
					re.addAll(myRight.ancestors(e));
					re.add(data);
				}
			}
			return re;
		}
	
	// display BST using inorder approach
	  public void inorder() {
	        if (myLeft != null) {
	            myLeft.inorder();
	           
	        }
	        System.out.print(data + " ");
	        if (myRight != null) {
	            myRight.inorder();
	           
	        }
	    }
	  
	// display BST using preorder approach
	  public void preorder() {
	        System.out.print(data + " ");
	        if (myLeft != null) {
	            myLeft.preorder();
	        }
	        if (myRight != null) {
	            myRight.preorder();
	        }
	    }

	// display BST using postorder approach
	  public void postorder() {
	        if (myLeft != null) {
	            myLeft.postorder();
	        }
	        if (myRight != null) {
	            myRight.postorder();
	        }
	        System.out.print(data + " ");
	    }
	


}
