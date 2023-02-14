import java.util.ArrayList;
/**
 * Write a description of class SalesApp here.
 *
 * @author Eric Wallace
 * @version 1.0
 */
public class SalesApp
{
    // Customer field.
    private Customer customer;
    // Design choice.
    private String design;
    // Feature add-ons.
    private ArrayList<String> features;
    // Cost for site.
    private double cost;

    /**
     * Constructor for objects of class SalesApp
     */
    public SalesApp(String design)
    {
        // initialise instance variables
        this.customer = customer;
        this.design = design;
        this.features = new ArrayList<>();
        this.cost = cost;
    }
    
    /**
     * Determine the base cost for selected design.
     */
    private double calculateCost()
    {
        double baseCost = 0;
        if (design.equals("Nature")) {
            baseCost = 300.00;
        } else if (design.equals("Tech")) {
            baseCost = 350.00;
        } else if (design.equals("Business")) {
            baseCost = 375.00;
        } else if (design.equals("Music")) {
            baseCost = 400.00;
        } else if (design.equals("Naughty")) {
            baseCost = 500.00;
        }
        return baseCost;
    }
    
    /**
     * Feature add-ons.
     */
    public void addFeature(String features)
    {
        this.features.add(features);
        if(features.equals("Feature 1")){
            if(design.equals("Nature")){
                this.cost += 10.00;
            } else if(design.equals("Tech")){
                this.cost += 20.00;
            } else if(design.equals("Business")){
                this.cost += 30.00;
            } else if(design.equals("Music")){
                this.cost += 85.00;
            } else if(design.equals("Naughty")){
                this.cost += 100.00;
            }
        } else if(features.equals("Feature 2")){
            if(design.equals("Nature")){
                this.cost += 15.00;
            } else if(design.equals("Tech")){
                this.cost += 30.00;
            } else if(design.equals("Business")){
                this.cost += 40.00;
            } else if(design.equals("Music")){
                this.cost += 95.00;
            } else if(design.equals("Naughty")){
                this.cost += 200.00;
            }
        } else if(features.equals("Feature 3")){
            if(design.equals("Nature")){
                this.cost += 20.00;
            } else if(design.equals("Tech")){
                this.cost += 40.00;
            } else if(design.equals("Business")){
                this.cost += 50.00;
            } else if(design.equals("Music")){
                this.cost += 110.00;
            } else if(design.equals("Naughty")){
                this.cost += 300.00;
            }
        } else if(features.equals("Feature 4")){
            if(design.equals("Nature")){
                this.cost += 25.00;
            } else if(design.equals("Tech")){
                this.cost += 50.00;
            } else if(design.equals("Business")){
                this.cost += 60.00;
            } else if(design.equals("Music")){
                this.cost += 130.00;
            } else if(design.equals("Naughty")){
                this.cost += 400.00;
            }
        } else if(features.equals("Feature 5")){
            if(design.equals("Nature")){
                this.cost += 30.00;
            } else if(design.equals("Tech")){
                this.cost += 60.00;
            } else if(design.equals("Business")){
                this.cost += 70.00;
            } else if(design.equals("Music")){
                this.cost += 210.00;
            } else if(design.equals("Naughty")){
                this.cost += 500.00;
            }
        }
        
    }

    /**
     * Accessor for selected design.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getDesign()
    {
        // put your code here
        return design;
    }
    
    public void setDesign(String design)
    {
        this.design = design;
    }
    
    public ArrayList<String> getFeatures() {
        return features;
    }
    
    public void setFeatures(ArrayList<String> features) {
        this.features = features;
    }
    
    public double getCost() {
        return cost;
    }
}
