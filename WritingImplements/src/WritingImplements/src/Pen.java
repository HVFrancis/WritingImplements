package WritingImplements.src;

class Pen extends WritingImplement
{
    private String inkColor;
    
    /**
     * Constructor for a Pen object. It allows you specify the color 
     * of the ink, the material it is made of,
     * and the size of the writing tip
     *
     * @param inkColor  the color of the ink
     * @param bodyMaterial  The pen's material. 
     * It must be one of "plastic", "metal", or "wooden"
     * @param tipSize  The size of the point in millimeters 
     * (must be positive)
     */
    public Pen(String inkColor, String bodyMaterial, double tipSize)
    {
        super(bodyMaterial, tipSize);
        this.inkColor = inkColor;
    }

    /**
     * The default constructor for a pen. 
     * It creates a plastic pen that writes in purple with a 0.5mm tip
     * 
     * @param plasic pen  the pen type is plastic
     * @param purplre ink  purple the pen writes in purple
     * @param tip size  the size of the en is 0.5mm
     */
     public Pen()
     {
         this("purple", "plastic", 0.5);
     }

    /**
     * Accessor method for inkColor
     *
     * @returns the color  of the ink
     */
    public String getInkColor()
    {
        return inkColor;
    }
     
    /**
     * Mutator method for inkColor
     *
     * @param inkColor  the color of the ink
     */
     public void setInkColor(String inkColor)
     {
         this.inkColor = inkColor;
     }
         
    /**
     * A method to simulate the pen writing a message.
     *
     * @param message  the message the pen writes 
     */
    public void write(String message)
    {
        System.out.println("The " + inkColor + 
        " pen just wrote: " + message);
    }

    /**
     * A method to simulate the pen crossing out words
     * (since it can't erase)
     * 
     * @param words  the words being marked out
     */
    public void markOut(String words)
    {
        System.out.println("The " + inkColor +
        " pen just marked out the word(s):  " + words);
    }      
}
