import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        //create a priorty queue with an instance of our custom catcomapartor class to provide custom ordering of cats via name
            PriorityQueue<Cat> catPQ = new PriorityQueue<>(new CatComparator());

        Cat tabby = new Cat("Kreacher","Tabby","Orange",6);
        Cat black = new Cat("Stella","Bombay","Black",8);
        Cat sphynx = new Cat("Pharroh","Sphynx","Hairless",2);
        Cat maineCoone = new Cat("Ron","Maine Coone","Gray/White",12);

        catPQ.add(tabby);
        catPQ.add(black);
        catPQ.add(sphynx);
        catPQ.add(maineCoone);

        tabby.setAge(8);
        maineCoone.setAge(1);
        System.out.println(catPQ);
        System.out.println("-----------------");

        while(!catPQ.isEmpty()){
            catPQ.remove();
            System.out.println(catPQ);
            System.out.println("--------");

        }
    }
}
