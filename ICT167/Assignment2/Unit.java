public class Unit 
{
    protected String enrolmenttype;
    protected String finalgrade;
    
    public Unit()
    {
        this.enrolmenttype = "";
        this.finalgrade ="NA";
    }
    
    public Unit(String enrolmenttype, String finalgrade)
    {
        this.enrolmenttype = enrolmenttype;
        this.finalgrade = finalgrade;
    }
    
    public void setenrolmenttype(String enrolmenttype)
    {this.enrolmenttype = enrolmenttype;}
            
    public void setfinalgrade(String finalgrade)
    {this.finalgrade = finalgrade;}
    
    public String getenrolmenttype()
    {return enrolmenttype;}
            
    public String getfinalgrade()
    {return finalgrade;}     
}
