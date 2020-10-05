package org.techouts.app.problem22;

public class CompanyMainClass {

	public static void main(String[] args) {
		Company company = new CompanyName();
		double result = company.profit();
		String name = Company.companyName(result);
		Company company2 =(double profit,String companyName) -> {
			System.out.println("Profit is "+ profit +" "+"Comapany Name is "+companyName);
			return companyName;
		};
		company2.getcompanydetails(result,name);
	}
}
