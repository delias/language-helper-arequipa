package com.example.languagehelper;

public class Palabra {

	String orig, trad;

	public Palabra(String orig, String trad) {
		this.orig = orig;
		this.trad = trad;
	}

	public String getOrig() {
		return orig;
	}

	public void setOrig(String orig) {
		this.orig = orig;
	}

	public String getTrad() {
		return trad;
	}

	public void setTrad(String trad) {
		this.trad = trad;
	}
	
}
