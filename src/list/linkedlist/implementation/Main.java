package list.linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
    	LinkedList numbers = new LinkedList();
//    	numbers.addFirst(30);
//    	numbers.addFirst(20);
//    	numbers.addFirst(10);
    	
//    	numbers.addLast(5);
    	numbers.addLast(10);
//    	numbers.addLast(15);
    	numbers.addLast(20);
    	numbers.addLast(30);  
    	
//    	numbers.add(2, 25);
    	
    	
//    	System.out.println(numbers.removeLast());
//    	System.out.println(numbers.size());
//    	System.out.println(numbers.get(1));
//    	System.out.println(numbers.indexOf(20));
    	
    	LinkedList.ListIterator i = numbers.listIterator();
    	i.add(5);
    	
    }
    
}
