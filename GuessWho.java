// Importing Java utility package
import java.util.*;

// Defining GuessWho class
public class GuessWho 
{
// Initializing instance variables
private Character[] characters;
private Character pick;

// Constructor method
public GuessWho() 
{

    // Initializing the characters array with 6 character objects
    characters = new Character[6];

    // Creating character objects and adding them to the characters array
    characters[0] = new Character("Anita", "blonde", "female");
    characters[1] = new Character("Anne", "black", "female");
    characters[2] = new Character("Bernard", "brown", "male", true, false);
    characters[3] = new Character("George", "grey", "male", true, false);
    characters[4] = new Character("Joe", "blonde", "male", false, true);
    characters[5] = new Character("Maria", "brown", "female");

    // Displaying the characteristics of each character in the array
    for (int i = 0; i < characters.length; i++) 
    {
        characters[i].show();
    }
}

// Method to search for a character by name
public void search(String name) 
{
    for (int i = 0; i < characters.length; i++)
    {
        if (characters[i].getName().equals(name)) 
        {
            // Displaying the index at which the character is found
            System.out.println(name + " found at index " + i);
            return;
        }
    }
    // Displaying a message if the character is not found
    System.out.println(name + " not found");
}

// Method to randomly select a character
public void selectCharacter() 
{
    // Generating a random index and selecting the character at that index
    int index = (int) (Math.random() * characters.length);
    pick = characters[index];
    // Displaying the name of the selected character
    System.out.println("Selected character: " + pick.getName());
} }