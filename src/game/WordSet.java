public class WordSet
{
//private data members not shown
//Constructor initializes set to empty.
public WordSet()
{ /* implementation not shown */ }
//Returns number of words in set.
public int size()
{ /* implementation not shown */ }
//Adds word to set (no duplicates).
public void insert(String word)
{ /* implementation not shown */ }
//Removes word from set if present, else does nothing.
public void remove(String word)
{ /* implementation not shown */ }
//Returns kth word in alphabetical order, where 1 <= k <= size().
public String findkth(int k)
{ /* implementation not shown */ }
//Returns true if set contains word, false otherwise.
public boolean contains(String word)
{ /* implementation not shown */ }

//Postcondition: Returns the number of words in s that begin
// with "A."
public static int countA(WordSet s){
    int count = 0;
    for(int i = 0; i<s.length(); i++){
        if(s.charAt(0) == "A") count++;
    }
    return count;
}

//Postcondition: WordSet s contains no words that begin with "A",
// but is otherwise unchanged.
public static void removeA(WordSet s)
for(int i = 0; i<s.length(); i++){
    if(s.charAt(0) == "A"){
         s = s.substring(1);
        }
        return s;

}




}


