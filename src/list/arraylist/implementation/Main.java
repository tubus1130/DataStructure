package list.arraylist.implementation;

public class Main {

	public static void main(String[] args) {
		
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
//		System.out.println(numbers.remove(1));
//		numbers.removeFirst();
//		numbers.removeLast();
//		numbers.add(1, 15);
//		numbers.addFirst(5);
//		System.out.println(numbers.get(0));
//		System.out.println(numbers.get(1));
//		System.out.println(numbers.get(2));
//		System.out.println(numbers.get(3));
//		System.out.println(numbers);
//		System.out.println(numbers.size());
//		System.out.println(numbers.indexOf(20));
//		System.out.println(numbers.indexOf(50));
		
//		for(int i=0; i<numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
		
		ArrayList.ListIterator li = numbers.listIterator();
//		while(li.hasNext()) {
//			System.out.println(li.next()); 
//		}
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.remove();
			}
			System.out.println(number);
		}
		System.out.println(numbers);
	}
}