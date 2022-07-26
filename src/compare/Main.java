package compare;

import list.arraylist.implementation.ArrayList;
import list.linkedlist.implementation.LinkedList;

public class Main {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.addLast(10);
		a.addLast(20);
		a.addLast(30);
		a.addFirst(5);
		a.get(2);
		ArrayList.ListIterator ai = a.listIterator();
		while(ai.hasNext()) {
			if((int)ai.next() == 20) {
				ai.add(25);
			}
		}
		// ArrayList는 데이터의 한계가 있음
		// 자바에서는 데이터가 넘으면 자동으로 2배사이즈로 키워준다.
		
		LinkedList l = new LinkedList();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addFirst(5);
		l.get(2);
		LinkedList.ListIterator li = l.listIterator();
		while(li.hasNext()) {
			if((int)li.next() == 20) {
				li.add(25);
			}
		}
		
		// 데이터 추가시 LinkedList가 더 우월
		// 데이터 검색시 ArrayList가 더 우월
	}
}
