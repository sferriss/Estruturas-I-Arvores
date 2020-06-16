package estruturaga;

public class EstruturaGa {

    public static void main(String[] args) {

        BinarySearchTree a = new BinarySearchTree();

        a.insert(100, 1);
        a.insert(50, 15);
        a.insert(40, 9);
        a.insert(65, 50);
        a.insert(620, 7);
        a.insert(350, 5);
        a.insert(621, 3);
        a.insert(95, 4);
        a.insert(200, 2);
        a.insert(300, 8);
        a.insert(400, 10);
        a.insert(500, 9);
        a.insert(67, 6);

        System.out.println(a.toString());
        System.out.println("Total de nós: " + a.countNodes());
        System.out.println("Total de  nós internos: " + a.countInternalNodes());
        System.out.println("Total de folhas: " + a.countLeaves());
        System.out.println("Value da key: " + a.search(40));
        System.out.println("Grau do nó: " + a.degree(50));
        System.out.println("Altura do nó: " + a.height(350));
        System.out.println("Altura da árvore: " + a.heightTree());
        System.out.println("Profundidade do nó: " + a.depth(50));
        System.out.println("Ancestrais: " + a.ancestors(300));
         System.out.println("Descendentes: " + a.descendents(100));
        //a.preOrder();

    }

}
