# TP 4A ILC 2020-21: enigma
Code for the German Enigma machine used in WW2.

## Questions
- Fork this github repository
- Run the project
- Comment the 3 classes
- Commit your changes and check-it into github
- On github, make a pull request
- Complete the next section : "Functions to be tested" into this file
- Commit your changes (commit README.md)
- On github, update your pull request 
- Make tests (call your test functions using the rule: GIVEN_WHEN_THEN) 
- Commit your changes
- On github, update your pull request 
- that ends

## Functions to be tested
Hereafter, for each classes give function to be tested. Remember that all functions does not have to be tested, some code can be checked by a simple inspection or an analyse, another code can be validated by definition (rules, etc) the others function can be tecsted by unit tests, integration tests or validation tests (IADT: Inspect, Analyse, Define, Test). 

### Classe Machine
#### functions
public void setPositions(String setting)

void advanceRotors()


### Classe Reflector
#### functions
public static Reflector reflectorFactory(String str)

public int convertForward(int p)

public int convertBackward(int e)

### Classe Rotor
#### functions
public static Rotor rotorFactory(String str, String notches)

public int convertForward(int p)

public int convertBackward(int e)

## Test some functions

### Classe Machine
#### functions

public void setPositions(String setting)

void advanceRotors()

### Classe Reflector
#### functions

public int convertForward(int p)

public int convertBackward(int e)

### Classe Rotor
#### functions

public int convertForward(int p)

public int convertBackward(int e)

## Tricks & tips

- Start with simple classes (models, libraries, etc) at the end make test into complex classes (classes with multiple relations)
- Never test auto generate code
- Never test creator (its a design problem)
- Use @Test before each testFunction !
- When you test a void function of the class Rotor, then test the rotor instance's state
> Rotor r=new Rotor();
> int actual = r.getosition();
- You can test a function than throws an exception with the argument: expected
> @Test(expected=Exception.class)

## Documentation and validation set
### How simulate Enigma machine:
- https://korben.info/enigma-le-simulateur.html
### Configuration code :
- * B III IV I AXLE
- FROM his shoulder Hiawatha / HYIHL BKOML IUYDC MPPSF SZW
- Took the camera of rosewood / SQCNJ EXNUO JYRZE KTCNB DGU



 
