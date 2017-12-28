package indev.api;

import javax.swing.*;


public class ListUpdate {
	/***
	 * first row changes
	 * @param list1
	 * @param list2
	 * @param list3
	 */
	public static void updateListSelection1(JList list1,JList list2,JList list3) {
		list2.setSelectedIndex(list1.getSelectedIndex());
		list3.setSelectedIndex(list1.getSelectedIndex());
	}
	/**
	 * second row changes
	 * @param list1
	 * @param list2
	 * @param list3
	 */
	public static void updateListSelection2(JList list1,JList list2,JList list3) {
		list1.setSelectedIndex(list2.getSelectedIndex());
		list3.setSelectedIndex(list2.getSelectedIndex());
	}
	/**
	 * third row changes
	 * @param list1
	 * @param list2
	 * @param list3
	 */
	
	public static void updateListSelection3(JList list1,JList list2,JList list3) {
		list1.setSelectedIndex(list3.getSelectedIndex());
		list2.setSelectedIndex(list3.getSelectedIndex());
	}
}
