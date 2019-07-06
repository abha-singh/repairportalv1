package APIautomate.APIautomate;

import java.util.List;

public class Response
{
    private List<Details> Details;



    @Override
    public String toString()
    {
        return "ClassPojo [Details = "+getDetails()+"]";
    }



	public List<Details> getDetails() {
		return Details;
	}



	public void setDetails(List<Details> details) {
		Details = details;
	}
}
