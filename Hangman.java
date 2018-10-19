package hangman;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        final String [][] words = {
            /* Sports */{"hockey","baseball","soccer","rugby","football","water polo","volleyball","golf","basketball","table tennis"},
            /* TV shows */{"game of thrones","westworld","the office","silicon valley","the walking dead","the big bang theory","bull","ncis","breaking bad","letterkenny"},
            /* action movies */{"john wick","die hard","taken","the matrix","indiana jones","james bond","the bourne legacy","mad max","star wars","mission impossible"},
            /* video games */{"skyrim","dark souls","grand theft auto","counter strike","league of legends","fallout","god of war","civilization","hearthstone","world of warcraft"},
            /* mythical creatures */{"dragon","kraken","manticore","chimea","cyclops","hydra","centaur","mermaid","giant","ogre"},
            /* board games */{"monopoly","clue","sorry","life","ticket to ride","coup","king of tokeyo","jenga","scrabble","risk"},
            /* canadian rivers */ {"missinaibi","dawn","saint lawrence","saint john","french","grand","red river of the north","humber","red dear","grand"},
            /* clothing brands */ {"adidas","nike","under armour","champion","supreme","reebok","true religion","puma","fila","rhone"},
            /* capital cities */ {"ottawa","washington","rome","paris","canberra","brussels","london","moscow","tel aviv","cairo"},
            /* youtube channels */ {"jacksfilms","jenna marbles","pewdiepie","nigahiga","idubbz","soot house","gradeaundera","ricegum","boy in a band","ksi"}
        };
        String letters[];
        
        boolean playAgain = true;
        Scanner sc = new Scanner(System.in);
        
        int topic;
        int guesses = 0;
        int num1 = 0;
        int num2 = 0;
        
        String word;
        String word2;
        String topicSelected = "";
        String dashWord = "";
        String lettersRemain = "";
        String lettersUse = "";
        String wordGuess;
        char letGuess;
        char letPlayAgain;
        
        while (playAgain = true){

            guesses = 0;
            topic = (int)(Math.random() * 9 + 0); 
            word = words[topic][(int)(Math.random() * 9 + 0)];
            word2 = word;
            lettersUse = "";
            lettersRemain = "";
            letters = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            
            switch (topic){
                
                case 0: topicSelected = "Sports"; break;
                case 1: topicSelected = "TV shows"; break;
                case 2: topicSelected = "action movies"; break;
                case 3: topicSelected = "video games"; break;
                case 4: topicSelected = "mythical creatures"; break;
                case 5: topicSelected = "board games"; break;
                case 6: topicSelected = "canadian rivers"; break;
                case 7: topicSelected = "clothing brands"; break;
                case 8: topicSelected = "capital cities"; break;
                case 9: topicSelected = "youtube channels"; break;
            
            }
            
            for (int a = 0; a < word.length(); a++){
                    
                if (word.charAt(a) != ' '){
                                             
                    dashWord = word.replace(word.charAt(a), '-');
                    word = word.replace(word.charAt(a), '-');
                       
                }else {
                        
                    dashWord += ' ';
                        
                }
            }
            
            for (int a = 0; a < letters.length; a++){
                    
                lettersRemain += letters[a];
                    
                }
            
            word = word2;
            
            while (guesses < 6){

                System.out.println("===================================================================");
                System.out.printf("%-40s%-20s\n","Topic:",topicSelected);
                System.out.printf("%-40s%-20s\n","word: ",dashWord);
                System.out.println("");
                System.out.printf("%-40s%-20s\n","Letters remaining: ",lettersRemain);
                System.out.printf("%-40s%-20s\n","Letters used: ",lettersUse.toUpperCase());
                System.out.printf("%-40s%-20s\n","guesses left: ",(6 - guesses));
                System.out.println("===================================================================");
                System.out.printf("%-40s%-1s","Enter a letter (1 to guess word)","");
                letGuess = sc.next().charAt(0);
                
                if (letGuess == '1'){
                    
                    System.out.printf("%-40s%-1s","Enter the word:","");
                    sc.nextLine();
                    wordGuess = sc.nextLine();
                    
                    if (wordGuess.equals(word)){
                        
                        System.out.println("Congratulations..... " + word + " is the word!");
                    
                        System.out.println("Would you like to play again (y or n):");
                        letPlayAgain = sc.next().charAt(0);
                   
                        if (letPlayAgain == 'n'){
                       
                            playAgain = false;
                            guesses = 10;
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                       
                        }else if (letPlayAgain == 'y'){
                       
                            guesses = 10;
                        
                        }
                        
                    }else {
                        
                        System.out.println(wordGuess + " is incorrect! The correct word is " + word);
                    
                        System.out.println("Would you like to play again (y or n):");
                        letPlayAgain = sc.next().charAt(0);
                   
                        if (letPlayAgain == 'n'){
                       
                            playAgain = false;
                            guesses = 10;
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                       
                        }else if (letPlayAgain == 'y'){
                       
                            guesses = 10;
                            
                        }
                    }
   
                }else {
                
                    word2 = "";
                    num1 = 0;
                    num2 = 0;
                
                    switch (letGuess){
                    
                        case 'a':  letters[0] = ""; break;
                        case 'b':  letters[1] = ""; break;
                        case 'c':  letters[2] = ""; break;
                        case 'd':  letters[3] = ""; break;
                        case 'e':  letters[4] = ""; break;
                        case 'f':  letters[5] = ""; break;
                        case 'g':  letters[6] = ""; break;
                        case 'h':  letters[7] = ""; break;
                        case 'i':  letters[8] = ""; break;
                        case 'j':  letters[9] = ""; break;
                        case 'k':  letters[10] = ""; break;
                        case 'l':  letters[11] = ""; break;
                        case 'm':  letters[12] = ""; break;
                        case 'n':  letters[13] = ""; break;
                        case 'o':  letters[14] = ""; break;
                        case 'p':  letters[15] = ""; break;
                        case 'q':  letters[16] = ""; break;
                        case 'r':  letters[17] = ""; break;
                        case 's':  letters[18] = ""; break;
                        case 't':  letters[19] = ""; break;
                        case 'u':  letters[20] = ""; break;
                        case 'v':  letters[21] = ""; break;
                        case 'w':  letters[22] = ""; break;
                        case 'x':  letters[23] = ""; break;
                        case 'y':  letters[24] = ""; break;
                        case 'z':  letters[25] = ""; break;
                              
                    }

                    lettersRemain = "";
                    
                    for (int a = 0; a < word.length(); a++){
                    
                        if (letGuess == word.charAt(a)){
                        
                            word2 += letGuess;
                        
                        }else{ 
                        
                            word2 += dashWord.charAt(a);
                            num1++;
                         
                        }     
                    }

                    for (int b = 0; b < letters.length; b++){
                    
                        lettersRemain += letters[b];  
       
                    }
                
                    dashWord = word2;
                
                    for (int a = 0; a < lettersUse.length(); a++){
                    
                        if (letGuess != lettersUse.charAt(a)){
                        
                            num2++;
                        
                        }     
                    } 
                
                    if (num2 == lettersUse.length()){
                    
                        lettersUse +=  letGuess;
                    
                        if (num1 == word.length()){
                    
                            guesses++;
                            System.out.println(letGuess + " is not in the word!");
                    
                        }
                    
                    }else{
                    
                        System.out.println(letGuess + " has already been guessed!");
                    
                    }
                
                    if (dashWord.equals(word)){
                    
                        System.out.println("Congratulations..... " + word + " is the word!");
                    
                        System.out.println("Would you like to play again (y or n):");
                        letPlayAgain = sc.next().charAt(0);
                   
                        if (letPlayAgain == 'n'){
                       
                            playAgain = false;
                            guesses = 10;
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                       
                        }else if (letPlayAgain == 'y'){
                       
                            guesses = 10;
                       
                        }  
                        
                    }else if (guesses == 6){
                        
                        System.out.println("Game Over! The word was " + word);
                    
                        System.out.println("Would you like to play again (y or n):");
                        letPlayAgain = sc.next().charAt(0);
                   
                        if (letPlayAgain == 'n'){
                       
                            playAgain = false;
                            guesses = 10;
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                       
                        }else if (letPlayAgain == 'y'){
                       
                            guesses = 10;
                       
                        }  
                    }
                }
            }
        }
    } 
}
