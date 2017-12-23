package indev;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ModelList extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@SuppressWarnings("rawtypes")
	static DefaultListModel evtTitle = new DefaultListModel();
	
	
	
	@SuppressWarnings("rawtypes")
	static DefaultListModel evtTime = new DefaultListModel();
	
	
	
	@SuppressWarnings("rawtypes")
	static DefaultListModel evtTick= new DefaultListModel();
	
	
	
	
	public void AddToModelList(GeneralNote note) {
		addTitle(note);
		addTime(note);
		//Also added a [[[TICK]]]
	}
	
	//evt = EVENT
	
	
	
	
	
	
	
	
	
	
	@SuppressWarnings("unchecked")
	public void addTitle(GeneralNote note) {
		evtTitle.add(evtTitle.getSize(),note.getEvtTitle());
		evtTick.add(evtTick.getSize(),"A tick");
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
