# Java Thread Examples

This repository contains two Java projects demonstrating the use of threads for concurrent execution of tasks.

## Exercise 1: Thread Management

### Description
This project showcases the management of multiple threads in Java. It creates and starts a specified number of threads, each of which sleeps for 10 seconds and then finishes.

### How to Run
1. Compile the `thread.java` and `main.java` files.
2. Run the `main` class.
3. Enter an integer between 1 to 10 when prompted to determine the number of threads to create.
4. After 10 seconds, you will be prompted to choose a thread to cancel.

## Exercise 2: Word Splitter

### Description
In this project, you can input a word, and it will display the length of the word and then split the word into two halves. Two threads, `stangadreapta` and `dreaptastanga`, will run concurrently to print the characters of the word's left and right halves.

### How to Run
1. Compile the `stangadreapta.java`, `dreaptastanga.java`, and `main.java` files.
2. Run the `main` class.
3. Enter a word when prompted.
4. The program will display the word's length and then split the word into two halves and print them concurrently.
