package indev;

import java.util.Date;

import javax.swing.DefaultListModel;

public class Test {
	static AddNote an = new AddNote();
	public static void main(String[] args) {
		an.AddANote("Merry Cristmas!", new Date(1225));
		an.AddANote("Hope to be happy everyday~", new Date(1225));
		an.AddANote("Have a good time~", new Date(1225));
		
	}
	
	public void addPlan(String name){
		
	}
}
