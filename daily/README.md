# Daily Assignments
We'll use this section to post work throughout the sessions. This page will update daily with plans, links, etc. Associated code will be stored in the folder corresponding to the day. (If you reading this on github.com, look above to see these subdirectories.)

---

### Day 0 | Day 0b000 | Day 0x0 : 6/28
Intros
- course
- instructors
- cohort
- program overview

Toolset
- slack
- CLI 
- javac, java
- editor

Lecture: Java basics/overview 
- intro: 
https://docs.google.com/presentation/d/13-6hqWlot-uRs7MiY1ie8aVZ6be-BNRSnzQiBSVgp1A/edit?usp=sharing
- variables and types: 
https://docs.google.com/presentation/d/1yVJmlQIKBpRKl0enOIwOjuRF3cPIfbY9RBnvJw-LN6Q/edit?usp=sharing

#### Work: Review pre-work
- __Note any observed best practices.__
- Bookmark locations of others' repos.
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q? Ask.
  - Confident in your skills/knowledge? _See how well you can explain it._
- Small group sessions:
  - Discuss pre-work, explore one another's solutions.
  - Reconvene and present your team's cleanest solution / clearest explanation.
- DELIVERABLE:
  - Better version of each pre-work submission.
  - Cite any resources (human or other) you find helpful, as in-line comments.
  - Will be stored in your new work repo.

* * *

### Day 1 | Day 0b001 | Day 0x1 : 6/29

Pre-work demos, Q&A

Lecture: Java basics continued

#### Work: Organize Work Repo
Your work repo should take on the structure shown below.
- You may create each subdirectory daily, or pre-create all in advance.
- PROTIP: While a readme in each subdir is not required, it is suggested as a way to keep notes, aid navigation, etc.
- `tree` command will display the filesystem tree from the current location, as shown below.

```
work_csci70900-tofr$ tree
.
├── 0
│   └── readme.md
├── 1
│   └── readme.md
├── 2
│   └── readme.md
├── 3
│   └── readme.md
├── 4
│   └── readme.md
├── 5
│   └── readme.md
├── 6
│   └── readme.md
├── 7
│   └── readme.md
├── 8
│   └── readme.md
├── pre
│   ├── 0
│   │   ├── Hello.java
│   │   └── readme.md
│   ├── 1
│   │   └── readme.md
│   ├── 2
│   │   ├── Date.java
│   │   ├── GuessStarter.java
│   │   ├── readme.md
│   │   └── Time.java
│   ├── 3
│   │   ├── answer.txt
│   │   └── readme.md
│   ├── 4
│   │   └── readme.md
│   ├── 5
│   │   ├── Methods.java
│   │   └── readme.md
│   ├── 6
│   │   ├── Loops.java
│   │   └── readme.md
│   ├── 7
│   │   ├── Arrays.java
│   │   └── readme.md
│   └── 8
│       ├── Craps.java
│       └── readme.md
└── README.org
```


#### Work: Game of Nim
_GOAL:_

Be the player to remove the last stone.

_RULES:_
* bag contains 12 stones initially
* a move consists of removing 1-3 stones from the bag

_YOUR CODING MISSION:_

Write a program that will allow a human at console to play against your "AI" a game of NIM.
* prompt user for number of stones they wish to remove each turn
* tell user how many stones the AI removed and how many stones remain
* facilitate play until human or AI wins, and announce winner
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q? Ask.
  - Confident in your skills/knowledge? _See how well you can explain it._

- DELIVERABLE:
  - Save in your_work_repo: `1/Nim.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.

Lecture: 1D arrays
- slides: https://docs.google.com/presentation/d/1OG5N7mH3DZfVdmDhaFvANQljrnbt8pAwpMOShPfktfA/edit?usp=sharing

* * *

### Day 2 | Day 0b010 | Day 0x2 : 6/30

Demo(s) game of Nim

Lab work time in small groups.

#### Work: Mancala
_GOAL:_

Collect as many stones as possible in your mancala.

_RULES:_
* you can only move stones on your side
* a move consists of collecting all stones in a pit and dropping them 1 by 1 into each consecutive pit in a counterclockwise direction
* if last stone dropped is into your mancala, you go again
* if last stone dropped is into an empty pit on your side, you capture the stones in the opposite pit (store in mancala)

_GAMEBOARD_:
```
M p p p p p p 
  p p p p p p M
```
key: 
p: pit
m: mancala

_YOUR CODING MISSION:_

With your new team, write a program to facilitate a mancala game in the terminal. 
* "AI"-vs-human or human-vs-human (you choose)
* prompt user for which pit they wish to empty
* display relevant info after each turn:
  - state of the board
  - location of last stone dropped
  - which player goes next
* facilitate play until one entity wins, and announce winner
- PROTIPS:
  - Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
  - You will be prompted to share your algo (or algo-in-progress) to the chat after teams have had time to work up their approaches. At this point, all teams will be encouraged to review others' approaches and offer feedback and/or take inspiration.
  - Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
    - New to java and/or arrays? Since the primary goal here is to grow facility with 1D arrays, simply getting the stones transfer algorithm implemented for a single player's side of the board (not bothering with emptying pits on the other side) would be a good thing to aim for...
  - Never stray far from runnable code. 
- Need to tune your mental model? Play here: https://www.mathplayground.com/mancala.html 
- Want more background? Read up here: https://en.wikipedia.org/wiki/Mancala 
- Grow cohort KB ("knowledge base") on slack:
  - Have a Q? Ask.
  - Confident in your skills/knowledge? _See how well you can explain it._
- DELIVERABLE:
  - Save in your_work_repo: `2/Mancala.java`
  - Include heading at top of file, as comment. List all collaborators and consultants.

Lecture: Basics of Recursion
- see main page for links to visualizers for recursive executions

Lab work time in small groups.
- Solidify repo structure, git/github basics
- Get mancala to a working state.

* * *

### Day 3 | Day 0b011 | Day 0x3 : 7/01

Lab work time in small groups. (new teams, recursion)

Lecture: 2D Arrays
- reading: https://chortle.ccsu.edu/Java5/Notes/chap49C/ch49C_1.html
