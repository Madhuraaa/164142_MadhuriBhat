package com.collect.sr;

public class MovieDetails implements Comparable<MovieDetails>
{
	
	
	String mve_name;
	String lead_actor;
	String lead_actories;
	MovieDetails(String mve_name,String lead_actor,String lead_actories)
	{  this.mve_name=mve_name;
	   this.lead_actor=lead_actor;
	   this.lead_actories=lead_actories;
	}
	public String getMve_name() {
		return mve_name;
	}
	public void setMve_name(String mve_name) {
		this.mve_name = mve_name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	public String getLead_actories() {
		return lead_actories;
	}
	public void setLead_actories(String lead_actories) {
		this.lead_actories = lead_actories;
	}
	
	@Override
	public String toString() {
		return "MovieDetails [mve_name=" + mve_name + ", lead_actor="
				+ lead_actor + ", lead_actories=" + lead_actories + "]";
	}
	@Override
	public int compareTo(MovieDetails m) {
		int compareInt=this.lead_actories.compareTo(m.lead_actories);
		if(compareInt<0) return -1;
		if(compareInt>0) return 1;
		return 0;
				
	}
}
