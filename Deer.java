/**
 * The Deer class represents a deer and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods. ASCII artwork by Valkerie and can be found on:
 *  https://www.asciiart.eu/animals/deer
*/

public class Deer implements Animal {

  /**
   * Returns the ASCII art representation of the deer.
   *
   * @return A string containing the ASCII art of the deer.
   */
  @Override
  public String getAnimalArt() {
      return "        \\   /|       |\\\n" +
             "         `__\\\\       //__'\n" +
             "            ||      ||\n" +
             "          \\__`\\     |'__/\n" +
             "            `_\\\\   //_'\n" +
             "            _.,:---;,._\n" +
             "            \\_:     :_/\n" +
             "              |@. .@|\n" +
             "              |     |\n" +
             "              ,\\.-./  \\\n" +
             "              ;;`-'   `---__________-----.-.\n" +
             "              ;;;                         \\_\\\n" +
             "              ';;;                         |\n" +
             "               ;    |                      ;\n" +
             "                \\   \\     \\        |      /\n" +
             "                 \\_, \\    /        \\     |\\\n" +
             "                   |';|  |,,,,,,,,/ \\    \\ \\_\n" +
             "                   |  |  |           \\   /   |\n" +
             "                   \\  \\  |           |  / \\  |\n" +
             "                    | || |           | |   | |\n" +
             "                    | || |           | |   | |\n" +
             "                    | || |           | |   | |\n" +
             "                    |_||_|           |_|   |_|\n" +
             "                   /_//_/           /_/   /_/";
  }

   /**
   * Returns the name of the animal ("deer").
   * This method overrides the toString method to return the name of the deer.
   *
   * @return The string "deer" representing the name of the animal.
   */ 
  @Override
  public String toString() {
    return "deer";
  }
}