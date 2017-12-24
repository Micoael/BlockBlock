package indev;

import java.util.Date;

public class AddNote {
	GeneralNote note = new GeneralNote();
	ModelList lists = new ModelList();
	public void AddANote(String evtName,Date evtDate){
		note.setEvtTitle(evtName);
		note.setEvtDate(evtDate);
		lists.AddToModelList(note);
		System.out.println(lists.evtTime.get(0));
	}
}
