[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/u9Gu-vnX)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=13495734)
# CS 212 - Programming Assignment 0

## Summary
For this assignment, you will develop a program to output the number of infectious cases for a new disease.


## Description
We have come a long way since Covid-19 was first detected. Covid-19 spreads very fast because it is a very contagious virus. Scientists often use the R number to measure how contagious a disease is. R represents the number of people an infected person would spread the virus to on average.

In the early month of the pandemic, scientists estimated that the R number was close to [2 in some areas](https://www.ncbi.nlm.nih.gov/pmc/articles/PMC7074654/). If we assume R is 2, we start with 1 infected case (day 0), and it takes a day to pass on the virus. Then, after 1 day, we would have 1 (day 0) + 2 (new) = 3 cases. After 2 days, we would have 1 (day 0) + 2 (day 1) + 4 (new) = 7 cases. After 3 days, we would have 1(day 0) + 2 (day 1) + 4 (day 2) + 8 (new) = 15 cases. And we can go on and on. After 10 days, we would end up with a total of 1023 cases.

## Programming Assignment 0
You are tasked with writing a program to simulate how fast a new disease is spreading by printing out the number of cases for the first 10 days (including day 0),  given the R number as a user input. You can assume the user will enter a non-negative, floating-point number.

Your program should work as follows:

```
What is the R number? 2
Day Case(s)
0	1.0
1	3.0
2	7.0
3	15.0
4	31.0
5	63.0
6	127.0
7	255.0
8	511.0
9	1023.0
```
Another run:

```
What is the R number? 1.5
Day Case(s)
0	1.0
1	2.5
2	4.75
3	8.125
4	13.1875
5	20.78125
6	32.171875
7	49.257812
8	74.88672
9	113.33008
```

Another run:

```
What is the R number? 5
Day Case(s)
0	1.0
1	6.0
2	31.0
3	156.0
4	781.0
5	3906.0
6	19531.0
7	97656.0
8	488281.0
9	2441406.0
```


## Submission
### Part 1 (10 points): Design and test cases.
Due: 9/22

To GitHub:
* In the design.txt file, your algorithm. You may either use the language of algorithms from 151 or some other [Pseudocode, such as in these examples.](https://www.unf.edu/~broggio/cop2221/2221pseu.htm). (You don't need to use a loop for this assignment, but using a loop would make it easier)

* An Excel file with your test cases (at least 5 new test cases and at least 1 has to be a corner case).


### Part 2 (30 points)
Due: 2/2

To GitHub:
* Your final Java code in PA0.java


