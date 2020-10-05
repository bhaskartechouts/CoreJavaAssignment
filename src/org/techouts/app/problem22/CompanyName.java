package org.techouts.app.problem22;

public class CompanyName implements Company{
	
	@Override
	public String getcompanydetails(double profit, String companyName) {
		profit = profit;
		companyName = companyName;
		return "Profit is "+ profit +" "+"Comapany Name is "+companyName;
	}
}
