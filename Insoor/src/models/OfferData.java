package models;

public class OfferData {
	private final String ins_type;
    private final String insur;
    private final String data_begin;
    private final String data_end;
    private final String price;
    
    public OfferData(String ins_type, String insur, String data_begin, String data_end, String price) {
    	 this.ins_type = ins_type;
         this.insur = insur;
         this.data_begin = data_begin;
         this.data_end = data_end;
         this.price = price;
    }
    
    public String get_ins_type() {
    	return ins_type;
    }
    
    public String get_insur() {
    	return insur;
    }
    
    public String get_data_begin() {
    	return data_begin;
    }
    
    public String get_data_end() {
    	return data_end;
    }
    
    public String get_price() {
    	return price;
    }     
    
    
}
