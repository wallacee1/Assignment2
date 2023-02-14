/**
 * Write a description of class Customer here.
 *
 * @author Eric Wallace
 * @version 1.0
 */
public class Customer
{
    private static int nextCustomerNumber = 10001;
    
    private int customerNumber;
    // Customer last name.
    private String lastName;
    // Customer first name.
    private String firstName;
    // Customer company name.
    private String companyName;
    // Customer address.
    private String address;
    // Customer city.
    private String city;
    // Customer state.
    private String state;
    // Customer zip.
    private String zip;
    // Customer phone.
    private String phone;
    // Design Selection.
    private String design;
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String lastName, String firstName, String companyName, String address, String city, String state, String zip, String phone, String design)
    {
        // Customer last name.
        this.lastName = lastName;
        // Customer first name.
        this.firstName = firstName;
        // Customer company name.
        this.companyName = companyName;
        // Customer address.
        this.address = address;
        // Customer city.
        this.city = city;
        // Customer state.
        this.state = state;
        // Customer zip.
        this.zip = zip;
        // Customer phone.
        this.phone = phone;
        this.design = design;
        // Assing customer number.
        this.customerNumber = nextCustomerNumber++;
    }

    /**
     * Access customer last name.
     */
    public String getLastName()
    {
        // put your code here
        return lastName;
    }
    
    /**
     * Set customer last name.
     */
    public void setLastName(String lastName)
    {
        // put your code here
        this.lastName = lastName;
    }
    
    /**
     * Access customer first name.
     */
    public String getFirstName()
    {
        // put your code here
        return firstName;
    }
    
    /**
     * Set customer first name.
     */
    public void setFirstName(String firstName)
    {
        // put your code here
        this.firstName = firstName;
    }
    
    /**
     * Access customer companies name.
     */
    public String getCompanyName()
    {
        // put your code here
        return companyName;
    }
    
    /**
     * Set customer company name.
     */
    public void setCompanyName(String companyName)
    {
        // put your code here
        this.companyName = companyName;
    }
    
    /**
     * Access customer address.
     */
    public String getAddress()
    {
        // put your code here
        return address;
    }
    
    /**
     * Set customer address.
     */
    public void setAddress(String address)
    {
        // put your code here
        this.address = address;
    }
    
    /**
     * Access customer city.
     */
    public String getCity()
    {
        // put your code here
        return city;
    }
    
    /**
     * Set customer city.
     */
    public void setCity(String city)
    {
        // put your code here
        this.city = city;
    }
    
    /**
     * Access customer state.
     */
    public String getState()
    {
        // put your code here
        return state;
    }
    
    /**
     * Set customer state.
     */
    public void setState(String state)
    {
        // put your code here
        this.state = state;
    }
    
    /**
     * Access customer zip.
     */
    public String getZip()
    {
        // put your code here
        return zip;
    }
    
    /**
     * Set customer zip.
     */
    public void setZip(String zip)
    {
        // put your code here
        this.zip = zip;
    }
    
    /**
     * Access customer phone number.
     */
    public String getPhone()
    {
        // put your code here
        return phone;
    }
    
    /**
     * Set customer phone number.
     */
    public void setPhone(String phone)
    {
        // put your code here
        this.phone = phone;
    }
    
    /**
     * Access customer number.
     */
    public int getCustomerNumber()
    {
        // put your code here
        return customerNumber;
    }
}
