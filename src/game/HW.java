package game;

public class HW {
    /** precondition: wordList.size() > 0 
* @return the length of the longest word in wordList
*/
private int findMaxLength(){
    int longest = 0;
    for(int i = 0; i < wordList.length(); i++){
        if(wordList.get(i).length() > longest){
            longest = wordList.get(i).length();
        }
        
    }
    return longest;
}
}
