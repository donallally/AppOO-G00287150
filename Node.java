package computing.gmit.ie.appoo_g00287150;

import android.media.Image;
import java.io.Serializable;
import java.util.*;

public class Node {

    private String name;
    private Node parent;
    private Image image = null;
    private String coordX;
    private String coordY;



    private static final long serialVersionUID = 777L;
    private List <Node> children = new ArrayList<Node>();


    //must construct parent
    public Node(String name){
        super();
        this.name = name;
        this.parent = parent;
    }

    public void setParent(Node parent)
    {
        this.parent = parent;
    }

    public Node getParent()
    {
        return this.parent;
    }

    public List<Node> getChildren(){
        return children;
    }

    public void addChild(Node child)
    {
        children.add(child);
        child.setParent(this);
    }

    public void removeChild(Node child)
    {
        children.remove(child);
    }

    //insert something between
    public void insertChild(Node existing, Node next){
        existing.setParent(next);
        next.setParent(this);
    }

    public Node[] children(){
        Node[] temp = new Node[children.size()];
        for (int i = 0; i < children.size(); i++)
        {
            temp [i] = children.get(i);
        }
        return temp;
        //return (Node[]) children.toArray();
    }

    public boolean isLeaf()
    {
        return children.size() == 0;
    }

    public boolean isRoot()
    {
        return this.parent == null;
    }


    public boolean hasImage()
    {
        return this.image != null;
    }


    public Image getImage()
    {
        return image;
    }
    public void setImage(Image image)
    {
        this.image = image;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
