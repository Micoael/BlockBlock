package indev;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ModelList extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * The title of he event
	 */
	@SuppressWarnings("rawtypes")
	static DefaultListModel evtTitle = new DefaultListModel();
	
	
	/**
	 * The time and date of the event
	 */
	@SuppressWarnings("rawtypes")
	static DefaultListModel evtTime = new DefaultListModel();
	
	
	/***
	 * The tick before every enent
	 */
	static DefaultListModel<JCheckBox> evtTick = new DefaultListModel<JCheckBox>();
	
	
	
	
	public ModelList() {
		System.out.println("hi");
	}











	/**
	 * add to the modelList through this method
	 * @param note A NOTE OBJECT
	 * 
	 */
	public void AddToModelList(GeneralNote note) {
		addTitle(note);
		addTime(note);
		//Also added a [[[TICK]]]
	}
	
	
	
	
	
	
	
	
	
	
	
	@SuppressWarnings("unchecked")
	public void addTitle(GeneralNote note) {
		evtTitle.add(evtTitle.getSize(),note.getEvtTitle());
		evtTick.addElement(new JCheckBox(" done "));
		
	}
	
	
	
	@SuppressWarnings("unchecked")
	public void addTime(GeneralNote note) {
		evtTime.add(evtTime.getSize(),note.getDate());
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public DefaultListModel getEvtTitleList(){
		return evtTitle;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public DefaultListModel getEvtTimeList(){
		return evtTime;
		
	}
}