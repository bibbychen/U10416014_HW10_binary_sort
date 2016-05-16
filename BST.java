import java.util.*;

public class BST<E extends Comparable<E>> {
  protected TreeNode<E> root;
  protected int size = 0;

  // Create a default binary tree
  public BST() {
  }

  // Create a binary tree from an array of objects
  public BST(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      insert(objects[i]);
  }

   //returns true if the element is in the tree 
  public boolean search(E e) {
    TreeNode<E> current = root; // Start from the root

    while (current != null) {
      if (e.compareTo(current.element) < 0) {
        current = current.left;
      }
      else if (e.compareTo(current.element) > 0) {
        current = current.right;
      }
      else // element matches current.element
        return true; // Element is found
    }

    return false;
  }

  // Insert element into the binary tree
    
  public boolean insert(E e) {
    if (root == null)
      root = createNewNode(e); // Create a new root
    else {
      // Locate the parent node
      TreeNode<E> parent = null;
      TreeNode<E> current = root;
      while (current != null)
        if (e.compareTo(current.element) < 0) {
          parent = current;
          current = current.left;
        }
        else if (e.compareTo(current.element) > 0) {
          parent = current;
          current = current.right;
        }
        else
          return false; // Duplicate node not inserted

      // Create the new node and attach it to the parent node
      if (e.compareTo(parent.element) < 0)
        parent.left = createNewNode(e);
      else
        parent.right = createNewNode(e);
    }

    size++;
    return true; // Element inserted successfully
  }

  protected TreeNode<E> createNewNode(E e) {
    return new TreeNode<>(e);
  }

   // Inorder traversal from the root
  public void inorder() {
    inorder(root);
  }

  //Inorder traversal from a subtree
  protected void inorder(TreeNode<E> root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.element + " ");
    inorder(root.right);
  }

   //Postorder traversal from the root 
  public void postorder() {
    postorder(root);
  }

  // Preorder traversal from a subtree
  protected void preorder(TreeNode<E> root) {
    if (root == null) return;
    System.out.print(root.element + " ");
    preorder(root.left);
    preorder(root.right);
  }


   // Preorder traversal from the root 
  public void preorder() {
    preorder(root);
  }

  // Postorder traversal from a subtree 
  protected void postorder(TreeNode<E> root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.element + " ");
  }

  public static class TreeNode<E extends Comparable<E>> {
    public E element;
    public TreeNode<E> left;
    public TreeNode<E> right;

    public TreeNode(E e) {
      element = e;
    }
  }
  public int getSize() {
    return size;
  }

  // returns the root of the tree 
  public TreeNode<E> getRoot() {
    return root;
  }
    
}