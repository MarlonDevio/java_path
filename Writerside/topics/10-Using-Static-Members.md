# 10. Using Static Members
- [Overview](#10-1-overview)
- [Static Members](#10-2-static-members)
- [Enhancing Mathequation with Static Members](#10-3-enhancing-mathequation-with-static-members)
- [Static Imports](#10-4-static-imports)
- [Static Initializers](#10-5-static-initializers)
- [Summary](#10-6-summary)
- 
## 10.1. Overview
### Static Members in Java

**Wat zijn Static Members?**
- **Static Variabelen**: Een variabele die met `static` is gemarkeerd, behoort tot de klasse zelf, niet tot een specifiek object. Elk object van die klasse deelt dezelfde statische variabele.
- **Static Methoden**: Deze methoden kunnen worden aangeroepen zonder een object van de klasse te maken. Ze kunnen alleen directe toegang hebben tot andere statische leden.

**Waarom Gebruiken?**
- Om waarden te delen die gemeenschappelijk zijn voor alle objecten.
- Voor utility of helper-functies die niet afhankelijk zijn van objectstatus.

**Voorbeeld Code:**

```java
class Student {
    static int studentCount = 0;

    Student() {
        studentCount++;
    }

    static void printCount() {
        System.out.println("Aantal studenten: " + studentCount);
    }
}

public class Main {
    public static void main(String[] args) {
        new Student();
        new Student();
        Student.printCount(); // Output: Aantal studenten: 2
    }
}
```

**Belangrijk:**
- Static methoden kunnen geen niet-statische leden direct aanroepen.
- Static leden worden geladen bij het starten van het programma, niet wanneer een object wordt gemaakt.

## 10.2. Static Members

## 10.3. Enhancing Mathequation with Static Members

## 10.4. Static Imports

## 10.5. Static Initializers

## 10.6. Summary
Start typing here...
