package d3quests;

/**
 *
 * @author Ross
 */
public class D3QuestsPrototypeSpaces {
    public static void main(String[] args) {
        String battleTag = "   Dar p ina tor      ";
        String battleTagTemp = "";  
        for (int i = 1; i < battleTag.length(); i++) {
            if (!battleTag.substring(i-1,i).equals(" ")) {
                    battleTagTemp+= battleTag.substring(i-1,i);
            }
        }				
        battleTag = battleTagTemp;
    } 
}
