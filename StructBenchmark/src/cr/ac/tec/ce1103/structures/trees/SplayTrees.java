/**
 * 
 */
package cr.ac.tec.ce1103.structures.trees;

/**
 * @author Jonathan Garcia
 *
 */
public class SplayTrees {
	

	  private NodeSplayTrees  root;
	     private int count = 0;
	 
	     /** Constructor **/
	 public SplayTrees()
	     {
	         root = null;
	     }
	 
	     /** Function to check if tree is empty **/
	     public boolean isEmpty()
	     {
	         return root == null;
	     }
	 
	     /** clear tree **/
	     public void clear()
	     {
	         root = null;
	     }
	 
	     /** function to insert element */
	     public void insert(int ele)
	     {
	    	 NodeSplayTrees  z = root;
	         NodeSplayTrees  p = null;
	         while (z != null)
	         {
	             p = z;
	             if (ele < p.element)
	                 z = z.right;
	             else
	                 z = z.left;
	         }
	         z = new NodeSplayTrees ();
	         z.element = ele;
	         z.parent = p;
	         if (p == null)
	             root = z;
	         else if (ele < p.element)
	             p.right = z;
	         else
	             p.left = z;
	         Splay(z);
	         count++;
	     }
	     /** rotate a la  izquierda **/
	     public void makeLeftChildParent(NodeSplayTrees c, NodeSplayTrees p)
	     {
	         if ((c == null) || (p == null) || (p.left != c) || (c.parent != p))
	             throw new RuntimeException("WRONG");
	 
	         if (p.parent != null)
	         {
	             if (p == p.parent.left)
	                 p.parent.left = c;
	             else 
	                 p.parent.right = c;
	         }
	         if (c.right != null)
	             c.right.parent = p;
	 
	         c.parent = p.parent;
	         p.parent = c;
	         p.left = c.right;
	         c.right = p;
	     }
	 
	     //metodos  para  que se  realice  la rotacion
	     /** rotate **/
	     public void makeRightChildParent(NodeSplayTrees c, NodeSplayTrees p)
	     {
	         if ((c == null) || (p == null) || (p.right != c) || (c.parent != p))
	             throw new RuntimeException("WRONG");
	         if (p.parent != null)
	         {
	             if (p == p.parent.left)
	                 p.parent.left = c;
	             else
	                 p.parent.right = c;
	         }
	         if (c.left != null)
	             c.left.parent = p;
	         c.parent = p.parent;
	         p.parent = c;
	         p.right = c.left;
	         c.left = p;
	     }
	 
	     /** function splay **/
	     private void Splay(NodeSplayTrees x)
	     {
	         while (x.parent != null)
	         {
	        	 NodeSplayTrees  Parent = x.parent;
	        	 NodeSplayTrees  GrandParent = Parent.parent;
	             if (GrandParent == null)
	             {
	                 if (x == Parent.left)
	                     makeLeftChildParent(x, Parent);
	                 else
	                     makeRightChildParent(x, Parent);                 
	             } 
	             else
	             {
	                 if (x == Parent.left)
	                 {
	                     if (Parent == GrandParent.left)
	                     {
	                         makeLeftChildParent(Parent, GrandParent);
	                         makeLeftChildParent(x, Parent);
	                     }
	                     else 
	                     {
	                         makeLeftChildParent(x, x.parent);
	                         makeRightChildParent(x, x.parent);
	                     }
	                 }
	                 else 
	                 {
	                     if (Parent == GrandParent.left)
	                     {
	                         makeRightChildParent(x, x.parent);
	                         makeLeftChildParent(x, x.parent);
	                     } 
	                     else 
	                     {
	                         makeRightChildParent(Parent, GrandParent);
	                         makeRightChildParent(x, Parent);
	                     }
	                 }
	             }
	         }
	         root = x;
	     }
	 
	     /** function to remove element **/
	     public void remove(int ele)
	     {
	    	 NodeSplayTrees  node = findNode(ele);
	        remove(node);
	     }
	 
	     /** function to remove node **/
	     private void remove(NodeSplayTrees  node)
	     {
	         if (node == null)
	             return;
	 
	         Splay(node);
	         if( (node.left != null) && (node.right !=null))
	         { 
	        	 NodeSplayTrees  min = node.left;
	             while(min.right!=null)
	                 min = min.right;
	 
	             min.right = node.right;
	             node.right.parent = min;
	             node.left.parent = null;
	             root = node.left;
	         }
	         else if (node.right != null)
	         {
	             node.right.parent = null;
	             root = node.right;
	         } 
	         else if( node.left !=null)
	         {
	             node.left.parent = null;
	             root = node.left;
	         }
	         else
	         {
	             root = null;
	         }
	         node.parent = null;
	         node.left = null;
	         node.right = null;
	         node = null;
	         count--;
	     }
	 
	     /** Functions to count number of nodes **/
	     public int countNodes()
	     {
	         return count;
	     }
	 
	     /** Functions to search for an element **/
	     public boolean search(int val)
	     {
	         return findNode(val) != null;
	     }
	     private NodeSplayTrees findNode(int ele)
	     {
	    	 NodeSplayTrees  z = root;
	         while (z != null)
	         {
	             if (ele < z.element)
	                 z = z.right;
	             else if (ele  > z.element)
	                 z = z.left;
	             else
	                 return z;
	         }
	         return null;
	     }
	 
	     /** Function for inorder traversal **/ 
	     public void inorder()
	     {
	         inorder(root);
	     }
	     private void inorder(NodeSplayTrees r)
	     {
	         if (r != null)
	         {
	             inorder(r.left);
	             System.out.print(r.element +" ");
	             inorder(r.right);
	         }
	     }
	 
	     /** Function for preorder traversal **/
	     public void preorder()
	     {
	         preorder(root);
	     }
	     private void preorder(NodeSplayTrees  r)
	     {
	         if (r != null)
	         {
	             System.out.print(r.element +" ");
	             preorder(r.left);             
	             preorder(r.right);
	         }
	     }
	 
	     /** Function for postorder traversal **/
	     public void postorder()
	     {
	         postorder(root);
	     }
	     private void postorder(NodeSplayTrees r)
	     {
	         if (r != null)
	         {
	             postorder(r.left);             
	             postorder(r.right);
	             System.out.print(r.element +" ");
	         }
	     }     
	 }





	 

	