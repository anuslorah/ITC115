Translate English to Pig Latin

Console
Welcome to the Pig Latin Translator.

Enter a line to be translated to Pig Latin:
this program translates from english to pig latin

isthay ogrampray anslatestray omfray englishway otay igpay atinlay

Translate another line? (y/n): n


Operation
The application prompts the user to enter a line of text.
The application translates the text to Pig Latin and displays it on the console.
The program asks the user if he or she wants to translate another line.

Specifications
Parse the string into separate words before translating. You can assume that the 
words will be separated by a single space and there won’t be any punctuation. 
To do that, you can use the split function of the String object like this: 

String[] words = line.split(" ");

Convert each word to lowercase before translating.
If the word starts with a vowel, just add way to the end of the word.
If the word starts with a consonant, move all of the consonants that appear 
before the first vowel to the end of the word, then add ay to the end of the word.
If a word starts with the letter y, the y should be treated as a consonant. 
If the y appears anywhere else in the word, it should be treated as a vowel.
Check that the user has entered text before performing the translation.

Notes
This application requires the use of string handling to parse the input string 
into separate words, to analyze letters at the beginning of each word, to 
identify consonants and vowels, and to add Pig Latin word endings.
There are no official rules for Pig Latin. Most people agree on how words 
that begin with consonants are translated, but there are many different ways 
to handle words that begin with vowels.
