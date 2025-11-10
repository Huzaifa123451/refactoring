package theater;

/**
 * Represents a play in the theater system.
 * Each play has a name and a type.
 *
 * <p>This class is immutable and does not allow null fields.</p>
 */
public class Play {

    private final String name;
    private final String type;

    /**
     * Constructs a Play object.
     * @param name the name of the play
     * @param type the type of the play (e.g., tragedy, comedy)
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Returns the name of the play.
     * @return the play name
     */
    public String getName() {
        return name;
    }
    /**
     * Returns the type of the play.
     *
     * @return the play type
     */

    public String getType() {
        return type;
    }
}

