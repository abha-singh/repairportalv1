package APIautomate.APIautomate;

public class RepairOrderDamageInfo
{
    private String damageValue;

    private String damageCode;

    private String orderId;

    private String active;

    private String id;

    private String damageDesc;

    public String getDamageValue ()
    {
        return damageValue;
    }

    public void setDamageValue (String damageValue)
    {
        this.damageValue = damageValue;
    }

    public String getDamageCode ()
    {
        return damageCode;
    }

    public void setDamageCode (String damageCode)
    {
        this.damageCode = damageCode;
    }

    public String getOrderId ()
    {
        return orderId;
    }

    public void setOrderId (String orderId)
    {
        this.orderId = orderId;
    }

    public String getActive ()
    {
        return active;
    }

    public void setActive (String active)
    {
        this.active = active;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDamageDesc ()
    {
        return damageDesc;
    }

    public void setDamageDesc (String damageDesc)
    {
        this.damageDesc = damageDesc;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [damageValue = "+damageValue+", damageCode = "+damageCode+", orderId = "+orderId+", active = "+active+", id = "+id+", damageDesc = "+damageDesc+"]";
    }
}
			
			
