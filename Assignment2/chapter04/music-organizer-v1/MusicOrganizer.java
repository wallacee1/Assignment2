import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
        else {
            System.out.println("The index is not valid.");
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    
    /**
     * Check the index of an item.
     */
    public void checkIndex(int index)
    {
        if(files.isEmpty()) {
            System.out.println("The collection is empty");
        }
        else if (index < 0 || index >= files.size()) {
            System.out.println("Error, the index entered is out of range. Please enter an index between 0 to" + (files.size() - 1) + ".");
        }
    }
    
    /**
     * Check if the index of an item is true.
     */
    public boolean validIndex(int index)
    {
        return files.size() > 0 && index >= 0 && index < files.size();
    }
}
