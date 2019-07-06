package APIautomate.APIautomate;

public class RepairOrderLogistics
{
    private String lspId;

    private String awbNo;

    private String lspShortName;

    private String creationTime;

    private String orderId;

    private String logisticsPartener;

    private String lastUpdatedTime;

    private String operationType;

    private String id;

    private String isActive;

    private String estimatedDeliveryDate;

    private String shipmentType;

    public String getLspId ()
    {
        return lspId;
    }

    public void setLspId (String lspId)
    {
        this.lspId = lspId;
    }

    public String getAwbNo ()
    {
        return awbNo;
    }

    public void setAwbNo (String awbNo)
    {
        this.awbNo = awbNo;
    }

    public String getLspShortName ()
    {
        return lspShortName;
    }

    public void setLspShortName (String lspShortName)
    {
        this.lspShortName = lspShortName;
    }

    public String getCreationTime ()
    {
        return creationTime;
    }

    public void setCreationTime (String creationTime)
    {
        this.creationTime = creationTime;
    }

    public String getOrderId ()
    {
        return orderId;
    }

    public void setOrderId (String orderId)
    {
        this.orderId = orderId;
    }

    public String getLogisticsPartener ()
    {
        return logisticsPartener;
    }

    public void setLogisticsPartener (String logisticsPartener)
    {
        this.logisticsPartener = logisticsPartener;
    }

    public String getLastUpdatedTime ()
    {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime (String lastUpdatedTime)
    {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public String getOperationType ()
    {
        return operationType;
    }

    public void setOperationType (String operationType)
    {
        this.operationType = operationType;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getIsActive ()
    {
        return isActive;
    }

    public void setIsActive (String isActive)
    {
        this.isActive = isActive;
    }

    public String getEstimatedDeliveryDate ()
    {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate (String estimatedDeliveryDate)
    {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getShipmentType ()
    {
        return shipmentType;
    }

    public void setShipmentType (String shipmentType)
    {
        this.shipmentType = shipmentType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lspId = "+lspId+", awbNo = "+awbNo+", lspShortName = "+lspShortName+", creationTime = "+creationTime+", orderId = "+orderId+", logisticsPartener = "+logisticsPartener+", lastUpdatedTime = "+lastUpdatedTime+", operationType = "+operationType+", id = "+id+", isActive = "+isActive+", estimatedDeliveryDate = "+estimatedDeliveryDate+", shipmentType = "+shipmentType+"]";
    }
}
			
			
