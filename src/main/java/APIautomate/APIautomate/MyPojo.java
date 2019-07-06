package APIautomate.APIautomate;



public class MyPojo
{
    private Response response;

    private String responseStatus;

    private String responseCode;

    private String responseMsg;

    public Response getResponse ()
    {
        return response;
    }

    public void setResponse (Response response)
    {
        this.response = response;
    }

    public String getResponseStatus ()
    {
        return responseStatus;
    }

    public void setResponseStatus (String responseStatus)
    {
        this.responseStatus = responseStatus;
    }

    public String getResponseCode ()
    {
        return responseCode;
    }

    public void setResponseCode (String responseCode)
    {
        this.responseCode = responseCode;
    }

    public String getResponseMsg ()
    {
        return responseMsg;
    }

    public void setResponseMsg (String responseMsg)
    {
        this.responseMsg = responseMsg;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [response = "+response+", responseStatus = "+responseStatus+", responseCode = "+responseCode+", responseMsg = "+responseMsg+"]";
    }
}
	