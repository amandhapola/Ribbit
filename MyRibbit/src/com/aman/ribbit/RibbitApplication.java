package com.aman.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"a139Qjo3716ZheqKpvd9OzlCVklRLsaN4z3m5P86", 
	    	"e3zoKjpp0eoAuJaZivdVi1aZlsj9hv77256qOZ3N");
	}
}
