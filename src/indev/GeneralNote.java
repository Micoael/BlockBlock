package indev;
import java.util.Date;
import java.util.Random;

public class GeneralNote {
	/**
	 * The UID 
	 */
	private long UID ;
	private String evtTitle;
	private String evtDesc;
	private Date evtDate;
	Random rand= new Random();
	
	public GeneralNote(){
		setUID(rand.nextLong());
		
	}
	
	public void setUID(long uid){
		this.UID=uid;
	}
	
	public void setEvtTitle(String EvtTitle) {
		this.evtTitle=EvtTitle;
	}
	
	public void setEvtDate(Date evtDate2) {
		this.evtDate=evtDate2;
	}
	
	
	public void setEvtDesc(String EvtDesc) {
		this.evtDesc=EvtDesc;
	}
	
	public long getUID(){
		return this.UID;
	}
	
	public String getEvtTitle(){
		return this.evtTitle;
	}
	
	public String getEvtDesc(){
		return this.evtDesc;
	}
	
	public Date getDate(){
		return this.evtDate;
	}
	
	
}
