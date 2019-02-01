package us3;

public class Request_TestCases extends Request_new_Controls{
	
	public void req_new_Straight_Through()	{
		get_gender(); /*->*/ male.isSelected();
		get_smoke(); /*->*/ smoke_no.isSelected();	
		get_mar_st(); /*->*/ field_mar_st.sendKeys(statuses[1]);
		get_ins_types(); /*->*/ field_ins_types.sendKeys(types[1]);
		get_data(); /*->*/ beg_per.sendKeys(date_values[1]); end_per.sendKeys(date_values[2]);
		get_pay_per(); /*->*/ field_pay_per.sendKeys(per[2]);
		submit_req();
		close_req();
		}
	
	public void req_new_Mar_st_empty() {
		get_gender(); /*->*/ male.isSelected();
		get_smoke(); /*->*/ smoke_no.isSelected();	
		get_mar_st(); /*->*/ field_mar_st.sendKeys(statuses[0]);	
		System.out.println("Marital Status cannot be blank.");
		close_req();
	}
	
	public void req_new_Ins_type_empty() {
		get_gender(); /*->*/ male.isSelected();
		get_smoke(); /*->*/ smoke_no.isSelected();	
		get_mar_st(); /*->*/ field_mar_st.sendKeys(statuses[1]);
		get_ins_types(); /*->*/ field_ins_types.sendKeys(types[0]);
		System.out.println("Insurance Type ID cannot be blank.");
		close_req();
	}
	
	public void req_new_Pay_per_Empty() {
		get_gender(); /*->*/ male.isSelected();
		get_smoke(); /*->*/ smoke_no.isSelected();	
		get_mar_st(); /*->*/ field_mar_st.sendKeys(statuses[1]);
		get_ins_types(); /*->*/ field_ins_types.sendKeys(types[1]);
		get_data(); /*->*/ beg_per.sendKeys(date_values[1]); end_per.sendKeys(date_values[2]);
		get_pay_per(); /*->*/ field_pay_per.sendKeys(per[0]);
		System.out.println("Payment period cannot be blank.");
		close_req();
		}
	
	public void req_new_Beg_per_Empty() {
		get_gender(); /*->*/ male.isSelected();
		get_smoke(); /*->*/ smoke_no.isSelected();	
		get_mar_st(); /*->*/ field_mar_st.sendKeys(statuses[1]);
		get_ins_types(); /*->*/ field_ins_types.sendKeys(types[1]);
		get_data(); /*->*/ beg_per.sendKeys(date_values[0]); 
		System.out.println("Begin of desirable period cannot be blank.");
		close_req();
		}
	
	public void req_new_End_per_Empty() {
		get_gender(); /*->*/ male.isSelected();
		get_smoke(); /*->*/ smoke_no.isSelected();	
		get_mar_st(); /*->*/ field_mar_st.sendKeys(statuses[1]);
		get_ins_types(); /*->*/ field_ins_types.sendKeys(types[1]);
		get_data(); /*->*/ beg_per.sendKeys(date_values[1]); end_per.sendKeys(date_values[0]); 
		System.out.println("End of desirable period cannot be blank.");
		close_req();
		}
	
}
