# Java Notes 

## Variables

| Primitive                 | Reference                    |
|---------------------------|------------------------------|
| 8 types (see table below) | Unlimited (user defined)     |
| Stores data               | Stores an address            |
| Can only hold 1 value     | Could hold more than 1 value |
| Needs less memory         | Needs more memory            |
| Fast                      | Slower                       |


| Data types | Size    | Primitive/Reference | Value                                                    |
|------------|---------|---------------------|----------------------------------------------------------|
| boolean    | 1 bit   | Primitive           | `true` or `false`                                        |
| byte       | 1 byte  | Primitive           | -128 to 127                                              |
| short      | 2 bytes | Primitive           | -32,768 to 32,767                                        |
| int        | 4 bytes | Primitive           | -2 billion to 2 billion                                  |
| long       | 8 bytes | Primitive           | -9 quintilion to 9 quintilion                            |
| float      | 4 bytes | Primitive           | fractional number up to 6-7 digits ec `3.141592f`        |
| double     | 8 bytes | Primitive           | fractional number up to 15 digits ex `3.141592653589793` |
| char       | 2 bytes | Primitive           | single character/letter/ASCII value ex. `'a'`            |
| String     | varies  | Reference           | a sequence of characters ex. `"Hello World"`             |

### Different way to create a variable

```java
int x;         // declaration
x = 123;       // assignment 
int x = 123;   // initialzation 
```

## Constructors
> In some respects, a constructor can be likened to a midwife: it is responsible for ensur-
> ing that the new object comes into existence properly. Once an object has been created,
> the constructor plays no further role in that object’s life and cannot be called again.


The **new** operation does two things:
1. It creates a new object of the named class (here, NumberDisplay).
2. It executes the constructor of that class.

## Parameters & Fields
```java
public class TicketMachine{
    // These are feilds
    int age = 18;
    boolean isHappy = true;

    // NOTICE: Constructors dont have return-types
    public TicketMachine(int cost) {
      // Formal parameter--^
      // Actual parameter------^
    }

    // The line below is the HEADER of this method
    public int getPrice(){
        // This is
        // the method's
        // body
    }
}
```
### Scope of parameters and fields
- Parameters - restricted to the body of the constructor
- Fields - it can be accessed from anywhre in the same class

## Methods
- accesors = getters => are used to return the value of a **private field** (ex. `getPrice()`)
- mutators = setters => are used to mutate/change values (ex. `setBalance("100")`)

## Arrays (not ArrayList)
Arrays are able to sore either objects or primitive-type values. Flexible-size collections
(ArrayLists) can store only objects.

