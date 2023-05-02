//The Character class represents a character in the Guess Who game.

public class Character
 {

private String name; // Name of the character
private String hairColour; // Hair colour of the character
private String gender; // Gender of the character
private boolean hasHat = false; // Whether the character has a hat or not
private boolean hasGlasses = false; // Whether the character has glasses or not

//Constructor for creating a Character object without a hat and glasses.

public Character(String name, String hairColour, String gender)
 {
       this.name = name;
       this.hairColour = hairColour;
     this.gender = gender;
}

//Constructor for creating a Character object with a hat and/or glasses.
public Character(String name, String hairColour, String gender, boolean hasHat, boolean hasGlasses) 
{
    this.name = name;
    this.hairColour = hairColour;
    this.gender = gender;
    this.hasHat = hasHat;
    this.hasGlasses = hasGlasses;
}

// Returns the name of the character.
String getName() 
{
  return name;
}

//Returns the hair colour of the character.
String getHairColour() 
{
    return hairColour;
}
//Returns the gender of the character.

String getGender() 
{
    return gender;
}
//Returns whether the character has a hat or not.

boolean getHasHat() 
{
    return hasHat;
}

//Returns a string representation of the character.

public String toString() 
{
    String result = name + " is " + gender + " with " + hairColour + " hair" ;
    if (hasGlasses)
    result += " and glasses ";
    if(hasHat)
    result += " and a hat";
    
    return result;
}

//Prints the character attributes to the console.

public void show() {
System.out.println(toString());
}
}
