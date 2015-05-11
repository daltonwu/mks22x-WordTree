Author: Dalton Wu (yes, that's right, DW wrote this code in its entirety himself)


Methods:

ArrayList<String>	getAll()					returns an ArrayList of literally every single word in the tree
void				printAll()					prints literally every single word in the tree

		where a prefix is any string of characters:
ArrayList<String>	getPrefix(String prefix)	returns an ArrayList of all words with a given prefix
void				printPrefix(String prefix)	prints all words that have a given prefix
int					numPrefix(String prefix)	returns the number of words that have a given prefix

String				randword()					returns a word from the tree chosen randomly (that rhymed)

String				longestWord()				returns, you guessed it, the longest word in the tree


Additional features:

None were added, although included in the project is the snazzy main method.


How to run this cool project:

$ javac Driver.java
$ java Driver
