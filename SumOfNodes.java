public class SumOfNodes {
  static class Node {
    Node right;
    Node left;
    int data;

    public Node(int data) {
      this.left = null;
      this.right = null;
      this.data = data;

    }
  }

  public static int sumOfNodes(Node root) {
    if (root == null) {
      return 0;
    }
    int sl = sumOfNodes(root.left);

    int rl = sumOfNodes(root.right);
    return sl + rl + root.data;

  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    System.out.println(sumOfNodes(root));

  }

}
