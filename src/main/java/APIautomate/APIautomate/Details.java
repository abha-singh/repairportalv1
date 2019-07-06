package APIautomate.APIautomate;
public class Details
{
    private ArcDetails arcDetails;

    private RepairOrder repairOrder;

    private DispatchAddress dispatchAddress;

    private RepairOrderLogistics repairOrderLogistics;

    private RepairOrderDamageInfo repairOrderDamageInfo;

    public ArcDetails getArcDetails ()
    {
        return arcDetails;
    }

    public void setArcDetails (ArcDetails arcDetails)
    {
        this.arcDetails = arcDetails;
    }

    public RepairOrder getRepairOrder ()
    {
        return repairOrder;
    }

    public void setRepairOrder (RepairOrder repairOrder)
    {
        this.repairOrder = repairOrder;
    }

    public DispatchAddress getDispatchAddress ()
    {
        return dispatchAddress;
    }

    public void setDispatchAddress (DispatchAddress dispatchAddress)
    {
        this.dispatchAddress = dispatchAddress;
    }

    public RepairOrderLogistics getRepairOrderLogistics ()
    {
        return repairOrderLogistics;
    }

    public void setRepairOrderLogistics (RepairOrderLogistics repairOrderLogistics)
    {
        this.repairOrderLogistics = repairOrderLogistics;
    }

    public RepairOrderDamageInfo getRepairOrderDamageInfo ()
    {
        return repairOrderDamageInfo;
    }

    public void setRepairOrderDamageInfo (RepairOrderDamageInfo repairOrderDamageInfo)
    {
        this.repairOrderDamageInfo = repairOrderDamageInfo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [arcDetails = "+arcDetails+", repairOrder = "+repairOrder+", dispatchAddress = "+dispatchAddress+", repairOrderLogistics = "+repairOrderLogistics+", repairOrderDamageInfo = "+repairOrderDamageInfo+"]";
    }
}
			
			