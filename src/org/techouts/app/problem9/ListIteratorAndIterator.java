package org.techouts.app.problem9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ListIteratorAndIterator {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(11);
		arrayList.add(22);
		arrayList.add(33);
		arrayList.add(44);
		Set<String> set = new HashSet<>();
		set.add("Bhaskar");
		set.add("Lekkala");
		set.add("Techouts");
		Iterator<Integer> itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator<Integer> iterator = arrayList.listIterator(1);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		ListIterator<Integer> iterator1 = arrayList.listIterator();
		iterator1.add(55);
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		ListIterator<Integer> iterator2 = arrayList.listIterator(2);
		while(iterator2.hasPrevious()) {
			System.out.println(iterator2.previous());
		}
		Iterator<String> itr1 = set.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
