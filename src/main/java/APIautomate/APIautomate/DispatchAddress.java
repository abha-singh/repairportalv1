package APIautomate.APIautomate;

public class DispatchAddress
{
    private String country;

    private String orderId;

    private String city;

    private String address1;

    private String pinCode;

    private String id;

    private String state;

    private String type;

    private String contactNo;

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    public String getOrderId ()
    {
        return orderId;
    }

    public void setOrderId (String orderId)
    {
        this.orderId = orderId;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getAddress1 ()
    {
        return address1;
    }

    public void setAddress1 (String address1)
    {
        this.address1 = address1;
    }

    public String getPinCode ()
    {
        return pinCode;
    }

    public void setPinCode (String pinCode)
    {
        this.pinCode = pinCode;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getContactNo ()
    {
        return contactNo;
    }

    public void setContactNo (String contactNo)
    {
        this.contactNo = contactNo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [country = "+country+", orderId = "+orderId+", city = "+city+", address1 = "+address1+", pinCode = "+pinCode+", id = "+id+", state = "+state+", type = "+type+", contactNo = "+contactNo+"]";
    }
}
			
			