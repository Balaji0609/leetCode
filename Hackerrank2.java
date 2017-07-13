// LEVEL ORDER TRAVERSAL AND PRINT LINE BY LINE
class node
{
    node left;
    int data;
    node right;
}
 
void printLevelOrder(node root)
{
    if (root == NULL)  
		return;
    queue<node> q = new queue<node>();
    
	q.add(root);
 
    while (True)
    {
        int nodeCount = q.size();
        if (nodeCount == 0)
            break;

        while (!q.isEmpty())
        {
            node Tnode = q.poll();
            System.out.println(Tnode.data + " ");
            if (Tnode.left != NULL)
                q.push(Tnode.left);
            if (node.right != NULL)
                q.push(Tnode.right);
            nodeCount--;
        }
        System.out.println("\n");
    }
}


// FIND LEAST COMMON ANCESTOR

class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
public class BinaryTree
{
    //Root of the Binary Tree
    Node root;
 
    Node findLCA(int n1, int n2)
    {
        return findLCA(root, n1, n2);
    }
 
    // This function returns pointer to LCA of two given
    // values n1 and n2. This function assumes that n1 and
    // n2 are present in Binary Tree
    Node findLCA(Node node, int n1, int n2)
    {
        // Base case
        if (node == null)
            return null;
 
        // If either n1 or n2 matches with root's key, report
        // the presence by returning root (Note that if a key is
        // ancestor of other, then the ancestor key becomes LCA
        if (node.data == n1 || node.data == n2)
            return node;
 
        // Look for keys in left and right subtrees
        Node left_lca = findLCA(node.left, n1, n2);
        Node right_lca = findLCA(node.right, n1, n2);
 
        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
        if (left_lca!=null && right_lca!=null)
            return node;
 
        // Otherwise check if left subtree or right subtree is LCA
        return (left_lca != null) ? left_lca : right_lca;
    }
}