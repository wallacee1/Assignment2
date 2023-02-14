import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author Eric Wallace 
 * @version 1.0
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /**
     * Determine the number of members who joined in the given * month.
     * @param month The month we are interested in.
     * @return the number of members who joined in that month.
     */
    public int joinedInMonth(int month)
    {
        int count = 0;
        if(month < 1 || month > 12) {
            System.out.println("Month " + month + " out of range. " + "It must be between 1 and 12");
        }
        else {
            for(Membership member : members) {
                if(member.getMonth() == month) {
                    count++;
                }
            }
        }
        return count;
    }
    public ArrayList purge(int month, int year)
    {
        ArrayList<Membership> purged = new ArrayList<Membership>();
        if(month < 1 || month > 12) {
            System.out.println("Month " + month + " out of range. " + "It must be between 1 and 12");    
        }
        else {
            Iterator<Membership> it = members.iterator();
            while(it.hasNext()) {
                Membership member = it.next();
                if(member.getMonth() == month && member.getYear() == year) {
                    it.remove();
                    purged.add(member);
                }
            }
        }
        return purged;
    }
}
