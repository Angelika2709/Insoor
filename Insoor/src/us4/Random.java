package us4;

public class Random {
	public int x;
	
	
	public int get_int1 () {
		return this.x = 100 + (int)(Math.random()*(999));	
	}
	
	public int get_int2 () {
		return this.x = 10 + (int)(Math.random()*(99));	
	}
	
	public int get_int3 () {
		return this.x = 100000001 + (int)(Math.random()*(999999999));	
	}
	
	public int get_int4 () {
		return this.x = 999 + (int)(Math.random()*(9999));		
	}
	
	public int get_int5 () {
		return this.x = 100001 + (int)(Math.random()*(999999));		
	}

}
