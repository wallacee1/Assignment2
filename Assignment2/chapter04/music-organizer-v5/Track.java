/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    // Add genre.
    private String genre;
    // Count number of plays.
    public int PlayCount = 0;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename, String genre)
    {
        setDetails(artist, title, filename, genre);
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename, "unknown");
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
    
    /**
     * Return the genre.
     * @return The genre.
     */
    public String getGenre()
    {
        return genre;
    }
    
    /**
     * Increment play counts.
     */
    public void incrementPlayCount()
    {
        PlayCount++;
    }
    
    /**
     * Reset the play counts.
     * 
     */
    public void resetCount()
    {
        PlayCount = 0;
    }
        
    /**
     * Return details of the track: artist, title, file name, and genre.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + ") (genre: " + genre + ")";
    }
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     * @param genre The genre of the track.
     */
    private void setDetails(String artist, String title, String filename, String genre)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        this.genre = genre;
    }
    
}
