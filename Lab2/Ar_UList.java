package ulist;

public class Ar_UList {
	private int[] ListItems;
	public static final int MAXSIZE = 10;
	private int length;
	private int currentPos;
	public Ar_UList () {
		length = 0;
		ListItems = new int[MAXSIZE];
	}
	
	public int getLength() {
		return length;
	}
	
	boolean isFull() {
		return length == MAXSIZE;
	}
	
	void putItem(int pItem) {
		if (isFull()) {
			int tempAr[] = new int[ListItems.length + 1];
			tempAr[length] = pItem;
			ListItems = tempAr;
		}
		else {
			ListItems[length] = pItem;
		}
	}
	
	void deleteItemSwap(int dItem) throws Exception {
		for (int loc = 0; loc<length; loc++) {
			if (ListItems[loc] == dItem) {
				ListItems[loc] = ListItems[length-1];
				break;
			}
		}
		length--;
	}
	
	void deleteItemShift(int dItem) throws Exception {
		boolean indexFound = false;
		for (int loc = 0; loc<length;loc++) {
			if (ListItems[loc] == dItem) {
				indexFound = true;
			}
			if (indexFound && loc < MAXSIZE -1) {
				ListItems[loc] = ListItems[loc+1];
			} 
			length--;
		}
	}
	
	void makeEmpty() {
		length = 0;
	}
	
	void resetList() {
		currentPos = 0;
		
	}
	
	int getNextItem() {
		currentPos++;
		return ListItems[currentPos-1];
	}
	
	int getItem(int gItem) {
		int searchIter;
		for (searchIter = length-1; searchIter>=0; searchIter--) {
			if (ListItems[searchIter] == gItem) {
				break;
			}
		}
		return searchIter;
	}
}
