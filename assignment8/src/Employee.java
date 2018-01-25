public class Employee extends Person{
	private String ssn;

    public Employee() {
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }
    public StringBuilder SSNFormated(){
    	StringBuilder SSN = new StringBuilder(ssn);
        SSN = SSN.insert(3, '-').insert(6, '-');
        return SSN;
    }
    public String getDisplayTextE() {
        return super.toString() + "\n" + "Social security number: " + SSNFormated();
    }
}
