
// lowest common ancestor and minimum distance between nodes
import java.util.*;

public class Lca {
  static class Node {
    Node right;
    Node left;
    int data;

    public Node(int data) {
      this.right = null;
      this.left = null;
      this.data = data;
    }
  }

  public static Node lca(Node root, int n1, int n2) {
    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();
    getpath(root, n1, path1);
    getpath(root, n2, path2);
    int i = 0;

    for (; i < path1.size() && i < path2.size(); i++) {
      if (path1.get(i) != path2.get(i)) {
        break;
      }

    }
    Node lca = path1.get(i - 1);
    return lca;
  }

  public static boolean getpath(Node root, int n, ArrayList<Node> path) {
    if (root == null) {
      return false;
    }
    path.add(root);
    if (root.data == n) {
      return true;
    }
    boolean left = getpath(root.left, n, path);
    boolean right = getpath(root.right, n, path);
    if (left || right) {
      return true;
    }
    path.remove(root);
    return false;

  }

  public static int MinDist(Node root, int n1, int n2) {
    Node lca = lca(root, n1, n2);
    int dist1 = lcaDist(lca, n1);
    int dist2 = lcaDist(lca, n2);
    return dist1 + dist2;

  }

  public static int lcaDist(Node root, int n) {
    if (root == null) {
      return -1;
    }
    if (root.data == n) {
      return 0;
    }
    int left = lcaDist(root.left, n);
    int right = lcaDist(root.right, n);
    if (left == -1 && right == -1) {
      return -1;

    }
    if (left == -1) {
      return right + 1;
    }
    return left + 1;

  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    int n1 = 4;
    int n2 = 7;
    System.out.println(MinDist(root, n1, n2));

  }

}
