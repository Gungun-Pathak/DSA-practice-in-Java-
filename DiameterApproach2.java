public class DiameterApproach2 {
  static class Node {
    int data;
    Node right;
    Node left;

    public Node(int data) {
      this.right = null;
      this.left = null;
      this.data = data;
    }
  }

  static class Info {
    int ht;
    int diam;

    public Info(int ht, int diam) {
      this.ht = ht;
      this.diam = diam;
    }
  }

  public static Info diameter(Node root) {
    if (root == null) {
      return new Info(0, 0);
    }

    Info lInfo = diameter(root.left);
    Info rInfo = diameter(root.right);

    // Corrected diameter calculation
    int diam = Math.max(Math.max(lInfo.diam, rInfo.diam), lInfo.ht + rInfo.ht + 1 - 1);

    int ht = Math.max(lInfo.ht, rInfo.ht) + 1;
    return new Info(ht, diam);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    System.out.println(diameter(root).diam);
  }
}
