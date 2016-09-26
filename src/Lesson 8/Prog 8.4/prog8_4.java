package lesson8;

import java.util.ArrayList;
import java.util.LinkedList;

class arrayList{
	
	private String message;
	
	private ArrayList<String> arr;
	
	
	private int size;
	
	arrayList(String s){
		
		message= new String(s);
		
		arr = new ArrayList();
		
		size = 0;
	}
	
	
	public void ADD(){
		
		String[] splited = message.split(" ");
		size = splited.length;
		
		for(int i=0; i< size; i++){
			
			arr.add(splited[i]);
		}	
		
		
	}
	
	
	public void Show(){
		
		for(int i=0 ; i< size; i++){
			
			System.out.print(arr.get(i)+ " ");
		}
		
		System.out.println(" ");

		
	}
	
}



class linklist{
	
	private LinkedList<String> str;
	
	private String message;
	
	private int size;
	
	linklist(String s){
		
		message = new String(s);
	    str = new LinkedList<String>();
		
	}
	
	
	public void ADD(){
		
		String[] splited = message.split(" ");
		size = splited.length;
		
		for(int i=0; i< size; i++){
			
			str.add(splited[i]);
		}
		
		
	}
	
	

	public void show(){
		
		
		for(int i=0 ; i< size; i++){
			
			System.out.print(str.get(i)+ " ");
		}

		System.out.println(" ");
	}
	
}




public class prog8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hi my name is saif";
		
		arrayList a = new arrayList(s);
		
		a.ADD();
		a.Show();
		
		linklist l = new linklist(s);
		
		l.ADD();
		l.show();
	
		
	}

}
