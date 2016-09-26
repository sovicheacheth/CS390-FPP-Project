package Lab4;
/*
 * @Author: Roshan Chaudhary
 * Question: Programming Assignment 6-1

 * */

public class MyTable {
	private Entry[] entries = new Entry[26];

	// returns the String that is matched with char c in the table
	public String get(char c) {
		// implement
		for (int i = 0; i < 26; i++) {
			if (c == entries[i].id) {
				return entries[i].name;
			}
		}
		return null;
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		int val = c;
		int index = val - 97;

		entries[index] = new Entry(c, s);
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		// implement
		String output1 = "";
		for (int i = 0; i < entries.length; i++) {
			if (entries[i] != null)
				output1 = output1 + " " + entries[i].toString() + "\n";
		}
		return output1;
	}

	private class Entry {
		char id = '*';
		String name = "";
		String output;

		Entry(char c, String s) {
			// implement
			this.id = c;
			this.name = s;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			// implement
			output = id + "->" + name;

			return output;
		}
	}

	public static void main(String args[]) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('c', "Charlie");
		t.add('j', "Roshan");

		String s = t.get('c');
		System.out.println(s);

		System.out.println(t.toString());

	}

}