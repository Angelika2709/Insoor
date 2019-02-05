package us1;

public class Random extends Digital_sign{
	
	
	public int rand_int1 (int x) {
		return x = 100 + (int)(Math.random()*(999));	
	}
	
	public int rand_int2 (int x) {
		return x = 10 + (int)(Math.random()*(99));	
	}
	
	public int rand_int3 (int x) {
		return x = 100000001 + (int)(Math.random()*(999999999));	
	}
	
	public int rand_int4 (int x) {
		return x = 999 + (int)(Math.random()*(9999));		
	}
	
	public int rand_int5 (int x) {
		return x = 100001 + (int)(Math.random()*(999999));		
	}

}
