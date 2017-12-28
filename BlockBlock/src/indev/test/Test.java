package indev.test;

import java.awt.Frame;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;

import indev.AddNote;
import indev.ModelList;
import indev.api.JCheckBoxList;

public class Test extends JFrame{
	public Test() {
		setVisible(true);
		setSize(511,444);
		getContentPane().setLayout(null);
		
		JCheckBoxList checkBoxList = new JCheckBoxList(ModelList.evtTick);
		checkBoxList.setValueIsAdjusting(true);
		checkBoxList.setBounds(44, 13, 49, 315);
		getContentPane().add(checkBoxList);
		//list.setCellRenderer(new CheckboxListCellRenderer());
		//
		JList list_1 = new JList(ModelList.evtTitle);
		list_1.setValueIsAdjusting(true);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setBounds(134, 13, 167, 322);
		getContentPane().add(list_1);
		
		JList list_2 = new JList(ModelList.evtTime);
		list_2.setBounds(318, 25, 147, 303);
		getContentPane().add(list_2);
		
		JButton btnAdd = new JButton("ADD ");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				an.AddANote("1", new Date(1160333));
			}
		});
		btnAdd.setBounds(64, 357, 113, 27);
		getContentPane().add(btnAdd);
	}
	static AddNote an = new AddNote();
	public static void main(String[] args) {
		an.AddANote("Merry Cristmas!", new Date(1225));
		an.AddANote("Hope to be happy everyday~", new Date(1225));
		an.AddANote("Have a good time~", new Date(1225));
		new Test();
	}
}






