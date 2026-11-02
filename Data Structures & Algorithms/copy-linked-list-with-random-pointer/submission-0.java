/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(-1);
        Node itr = dummy;

        Map<Node, Node> map = new HashMap<>();

        Node temp = head;
        while (temp != null){
            Node node = new Node(temp.val);
            itr.next = node;
            itr = itr.next;
            map.put(temp, node);
            temp = temp.next;
        }

        temp = head;
        itr = dummy.next;
        while (temp != null){
            Node tRandom = temp.random;
            itr.random = map.get(tRandom);
            temp = temp.next;
            itr = itr.next;
        }

        return dummy.next;
    }
}
