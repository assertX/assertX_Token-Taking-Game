# assertX_Token-Taking_Game
In this assignment, you are going to write a Java program to play a token-taking game.  You program should use recursion to find a "path" to reach exactly K tokens within N turns. Using Recursive.


# Rules of the Game
1)At the beginning of the game, you have exactly 27 tokens.

2)In each turn of the game, you may do 1 of the following 2 things:

•Ask for exactly 39 more tokens.

•If you have an even number of tokens, you may give back exactly half of the tokens you have.  However, if you have an odd number of tokens, you do not have this choice and can only choose to ask for 39 more tokens.

3)The object of the game is to reach exactly K tokens within N turns, where K (positive integer) and N (positive integer) are specified at the beginning of the game.

4)The result of the game could be 1 of the following 2 results:

•The game reaches a dead end, which means that it is impossible to reach exactly K tokens within N turns.

•A "path" to reach exactly K tokens within N turns is found.  Please note that you do not need to use exactly N turns.  N is the maximum number of turns allowed in this game.

5)For simplicity, you do not need to do the following in your games:

•You do not need to find all the paths (sequences) from the starting state to the winning state.  Only outputting 1 valid path is sufficient.

•You do not need to count the number of valid sequences.

•You do not need to worry about whether the sequence you found is the shortest path or not.

# The Input File
•The input file is a plain text file (filename: games.txt).

•Each row in the input file contains exactly 2 integers, which are the target and turns of the game (in that order).

•You cannot assume (or guess) the number of games stored in the input file.  In other words, no matter how many games are stored in the input file, your program should correctly play all of them.

•There may be empty lines at the beginning, in the middle, and/or at the end of the input file.  Your program should smartly skip those empty lines.


# The Output File
•The output file is a plain text file (filename: results.txt).

•After playing each game in the input file, your program writes the game result to the output file (one result per row).
