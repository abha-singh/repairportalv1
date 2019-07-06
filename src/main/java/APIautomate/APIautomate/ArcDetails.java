package APIautomate.APIautomate;

public class ArcDetails
{
    private String pincode;

    private String lgDelResp;

    private Address[] address;

    private String contact;

    private String name;

    private String maxCapacity;

    private String id;

    public String getPincode ()
    {
        return pincode;
    }

    public void setPincode (String pincode)
    {
        this.pincode = pincode;
    }

    public String getLgDelResp ()
    {
        return lgDelResp;
    }

    public void setLgDelResp (String lgDelResp)
    {
        this.lgDelResp = lgDelResp;
    }

    public Address[] getAddress ()
    {
        return address;
    }

    public void setAddress (Address[] address)
    {
        this.address = address;
    }

    public String getContact ()
    {
        return contact;
    }

    public void setContact (String contact)
    {
        this.contact = contact;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getMaxCapacity ()
    {
        return maxCapacity;
    }

    public void setMaxCapacity (String maxCapacity)
    {
        this.maxCapacity = maxCapacity;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pincode = "+pincode+", lgDelResp = "+lgDelResp+", address = "+address+", contact = "+contact+", name = "+name+", maxCapacity = "+maxCapacity+", id = "+id+"]";
    }
}
			
			
