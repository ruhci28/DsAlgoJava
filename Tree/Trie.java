package Tree;
//Trie is an efficient information reTrieval data structure. Trie is an efficient information reTrieval data structure
//However the penalty is on Trie storage requirements
//Every node of Trie consists of multiple branches. Each branch represents a possible character of keys
// We need to mark the last node of every key as end of word node.

//Insert and search costs O(key_length), however the memory requirements of Trie is O(ALPHABET_SIZE * key_length * N) where N is number of keys in Trie. There are efficient representation of trie nodes (e.g. compressed trie, ternary search tree, etc.) to minimize memory requirements of trie.
public class Trie {
    static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;

        TrieNode(){
            isEndOfWord = false;
            for (int i = 0; i < 26; i++)
                children[i] = null;
        }
    }
    static TrieNode root;
    static void insert(String key){
        int length = key.length();
        int level;
        int index;
        TrieNode temp = root;
        for(level = 0; level < length; level++){
            index = key.charAt(level) - 'a';
            if(temp.children[index] == null)
                temp.children[index] = new TrieNode();
            temp = temp.children[index];
        }
        temp.isEndOfWord = true;

    }
    static boolean search(String key){
        int length = key.length();
        int level;
        int index;
        TrieNode temp = root;
        for(level = 0; level < length; level++){
            index = key.charAt(level) - 'a';
            if(temp.children[index] != null)
                temp = temp.children[index];
            else {
                return false;
            }
        }
        if(temp.isEndOfWord == true){
            return true;
        }else return false;
    }

//    TrieNode remove(TrieNode root, String key, int depth = 0)
//    {
//        // If tree is empty
//        if (!root)
//            return NULL;
//
//        // If last character of key is being processed
//        if (depth == key.size()) {
//
//            // This node is no more end of word after
//            // removal of given key
//            if (root->isEndOfWord)
//                root->isEndOfWord = false;
//
//            // If given is not prefix of any other word
//            if (isEmpty(root)) {
//                delete (root);
//                root = NULL;
//            }
//
//            return root;
//        }
//
//        // If not last character, recur for the child
//        // obtained using ASCII value
//        int index = key[depth] - 'a';
//        root->children[index] =
//                remove(root->children[index], key, depth + 1);
//
//        // If root does not have any child (its only child got
//        // deleted), and it is not end of another word.
//        if (isEmpty(root) && root->isEndOfWord == false) {
//            delete (root);
//            root = NULL;
//        }

//        return root;
//    }

    public static void main(String[] args){
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};
        root = new TrieNode();
        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);

        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(search("ruchi") == true)
            System.out.println("ruchi --- " + output[1]);
        else System.out.println("ruchi --- " + output[0]);

    }

}
