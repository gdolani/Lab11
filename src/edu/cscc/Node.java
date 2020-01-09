package edu.cscc;

public class Node<E> {
    private E content;
    private Node next;

    public Node(E content, Node next) {
        this.content = content;
        this.next = next;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
