package com.stem.node;

public class NodeManager{

    private Node root;//根节点
    public  void add(int data){
        if (root==null){
            root =new Node(data);
        }else {
            root.addNode(data);
        }
    }
    public void del(int data){}
    public void update(int oldData,int newData){}
    public void print(){
        if (root!=null) {
            root.printNode();
        }
    }
    public void find(int data){}
    public void insert(int index,int data){}


    public class Node{
        private int data;
        private Node next;//下一节点

        public Node(int data) {
            this.data = data;
        }

        //增加节点
        public void addNode(int data){
            if (this.next==null){
                this.next =new Node(data);
            }else{
                this.next.addNode(data);
            }
        }

        //删除节点
        public void delNode(int data){

        }
        //查找节点是否存在
        public  boolean findNode(int data){
            return false;
        }
        //更改节点

        public void updateNode(int oldData,int newData){

        }

        //插入节点
        public void insert(int index,int data){

        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void printNode(){
            System.out.println(getData()+"-->");
            if (next!=null){
                next.printNode();
            }
        }
    }


}
