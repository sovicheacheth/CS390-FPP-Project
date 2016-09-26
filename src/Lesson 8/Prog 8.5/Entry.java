package lesson8;

import java.util.LinkedList;

public class Entry {
	
	private String name;
	
	private String number;
	
	
	Entry(String name, String number){
		
		this.name = name;
		this.number = number;
	
		
	}
	
	public boolean search(Entry e,String s){
		
		if(e.name.equals(s)){
			
			return true;
		}
		
		else{
			
			return false;
		}
		
		
	}
	
	
}


class Directory{
	
	
	private LinkedList<Entry> e;
	
	
	Directory(LinkedList <Entry> a){
	
		for(int i = 0 ; i< a.size(); i++){
			
			e.add(a.get(i));
		}
	}
	
	public void addNew(String name, String number){
		
		e.add(new Entry(name,number));
		
	}
	
	public String Change(String name, String number){
		
		
		int a = e.indexOf(name);
		
		if(a==-1){
			
			return null;
		}
		
		else{
			
			e.remove(name);
			addNew(name, number);
			return name;
		}
		
		
		
		
	}
	
	
	public String remove(String s){
		
		int a = e.indexOf(s);
		
		if(a==-1){
			
			return s;
		}
		
		else{
			
			return null;
		
		}
		
	}
	
	public Object clone(){
		
		LinkedList<Entry> list = new LinkedList<Entry>(this.e);
		
		return list;
		
	}
	
	
}