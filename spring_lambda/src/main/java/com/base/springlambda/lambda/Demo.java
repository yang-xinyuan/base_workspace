package com.base.springlambda.lambda;

import com.base.springbase.lambda.service.DemoService;

import java.util.ArrayList;
import java.util.List;

class Demo<T>{
    public void DemoTest(DemoService service){
        service.testMethod();
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.setName("1");
        for (int i = 2; i < 5; i++) {
            List<Node> c = new ArrayList<>();
            Node node1 = new Node();
            node1.setName(i+"");
            c.add(node1);

            Node test = test(node);

            test.setList(c);
        }

    }
    public static Node test(Node node){
        if(node.getList()!= null && node.getList().size()>0 ){
            node = test(node.getList().get(0));
        }
        return node;
    }

   static class Node {
        private String name ;
        private List<Node> list ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Node> getList() {
            return list;
        }

        public void setList(List<Node> list) {
            this.list = list;
        }
    }
}