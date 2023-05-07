import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class BST {

    private Node root;
    private int size;
    
    public boolean isEmpty() {
        return this.root == null;
    }
    
    
    /**
     * Implementação iterativa da adição de um elemento em uma árvore binária de pequisa.
     * @param element o valor a ser adicionado na árvore.
     */
    public void add(int element) {
        this.size += 1;
        if (isEmpty())
            this.root = new Node(element);
        else {
            
            Node aux = this.root;
            
            while (aux != null) {
                
                if (element < aux.value) {
                    if (aux.left == null) { 
                        Node newNode = new Node(element);
                        aux.left = newNode;
                        newNode.parent = aux;
                        return;
                    }
                    
                    aux = aux.left;
                } else {
                    if (aux.right == null) { 
                        Node newNode = new Node(element);
                        aux.right = newNode;
                        newNode.parent = aux;
                        return;
                    }
                    
                    aux = aux.right;
                }
            }
        }
        
    }

    public ArrayList<Integer> bfs() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Deque<Node> queue = new LinkedList<Node>();
        
        if (!isEmpty()) {
            queue.addLast(this.root);
            while (!queue.isEmpty()) {
            	System.out.println();
                Node current = queue.removeFirst();
                System.out.println(current.value);
                
                list.add(current.value);
                
                if(current.left != null) 
                    queue.addLast(current.left);
                if(current.right != null) 
                    queue.addLast(current.right);   
            }
        }
        return list;
    }

    class Node {
    
        int value;
        Node left;
        Node right;
        Node parent;
        
        Node(int v) {
            this.value = v;
        }

}

public class BSTTest {

	public void main(String[] args) {
		
		BST bst = new BST();
		bst.add(85);
		bst.add(95);
		bst.add(16);
		bst.add(14);
		bst.add(75);
		bst.add(46);
		bst.add(55);
		bst.add(41);
		bst.add(61);
		bst.add(65);
		System.out.println(bst.bfs().toString());
}
}

}