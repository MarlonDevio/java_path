# 9. Implementing Class Constructors and Initializers 
  - [9.1. Establishing initial state](#9-1-establishing-initial-state)
  - [9.2. Field initializers](#9-2-field-initializers)
  - [9.3. Constructors](#9-3-constructors)
    - [9.3.1. Number of constructors](#9-3-1-number-of-constructors)
    - [9.3.2. Chaining Constructors](#9-3-2-chaining-constructors)
    - [9.3.3. Constructor Visibility](#9-3-3-constructor-visibility)
  - [9.4. Initialization Blocks](#9-4-initialization-blocks)

## 9.1. Establishing initial state
**3 ways**:
1. [Field initializers](#9-2-field-initializers)
2. [ Constructors ](#9-3-constructors)
3. [ Initialization blocks](#9-4-initialization-blocks)


## 9.2. Field initializers
**Specify init value as part of field declaration**
- Can be an equation
``` java
public class Earth {
long circumferenceInMiles = 24901;
long getCircumferenceInKms = (long) (24901 * 1.6d);
}
```
- can include other fields
``` java
public class Earth {
long circumferenceInMiles = 24901;
long getCircumferenceInKms = (long) (circumferenceInMiles * 1.6d);
}
```
- Can include method calls
``` java
public class Earth {
long circumferenceInMiles = 24901;
long getCircumferenceInKms = Math.round(circumferenceInMiles * 1.6d);
}
```
## 9.3. Constructors

### 9.3.1. Number of constructors
**Code that runs during object creation**
- Name = same as class
- **_No return type_**

**Number of Constructors**
- at least 1
- No explicit ? Java provides empty
  - ==> **Default constructor**
- **Can have multiple**
  - Unique param list
  - Diff num param
  - Diff types param
* -> **Signature**

### 9.3.2. Chaining Constructors
**One constructor calling another constructor**
- Must be first line of the constructor
- ``this`` keyword followed by param list

<code-block lang="java">
public Passenger(){};
    public Passenger(int freeBags){
        this.freeBags = freeBags;
    }
    public Passenger(int freeBags, int checkedBags){
        this(freeBags); // this calls the constructor with freebags
// parameter and passes the value given in this constructor
        this.checkedBags = checkedBags;
    }
</code-block>

<code-block lang="java">
public Passenger() {};
public Passenger(int freeBags) {
    this(freeBags > 1 ? 25.0d : 50.0d); // pass that value to the 
    // constructor that accepts that perbagfee
    this.freeBags = freeBags;
}
public Passenger(int freeBags, int checkedBags) {
    this(freeBags);
    this.checkedBags = checkedBags;
}
public Passenger(double perBagFee) {
    this.perBagFee = perBagFee;
}
</code-block>

### 9.3.3. Constructor Visibility
**Restrict what code can determine the business logic**
- In example: 
``new Passenger(0.5d)``
_risk of using the wrong constructor_ 
 **perBagFee**


<code-block lang="java">
    public Passenger() {};

    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d); // pass that value to the 
        // constructor that accepts that perbagfee
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee; // private
    }

</code-block>

## 9.4. Initialization Blocks
