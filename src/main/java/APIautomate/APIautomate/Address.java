package APIautomate.APIautomate;
public class Address
{
    private String address;

    private String state;

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [address = "+address+", state = "+state+"]";
    }
}
			
			
