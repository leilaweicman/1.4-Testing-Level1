# 1.4-Testing-Level1

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercises:

### Exercise 1
Create a Java class to manage a collection of books in a library. The class must support the following operations:

- Add books to the collection.  
- Retrieve the complete list of books.  
- Get the title of a book given its position.  
- Add a book at a specific position.  
- Delete a book by title.  

#### Tests implemented with JUnit 5
- Verify that the list of books is not null after creating a new `Library`.  
- Confirm that the list is empty when the library is first created.  
- Confirm that the list has the expected size after adding books.  
- Ensure the library contains a specific book at the correct position.  
- Verify that no duplicate book titles can be added.  
- Confirm that a book title can be retrieved by its position.  
- Ensure that adding a book modifies the list correctly.  
- Confirm that the list remains alphabetically ordered after adding or removing books.  
- Ensure that deleting a book decreases the size of the list.  

### Exercise 2
Create a class called `DniCalculator` that calculates the letter of a Spanish DNI given its number.  
The DNI letter is obtained by calculating the remainder of the division of the number by 23 and mapping it to a fixed sequence of letters (`TRWAGMYFPDXBNJZSQVHLCKE`).  

#### Tests implemented with JUnit 5
- Parameterized tests that validate 10 predefined DNI numbers with their corresponding correct letters.  
- Verify that the method throws an `IllegalArgumentException` when the number is negative.  
- Verify that the method throws an `IllegalArgumentException` when the number has more than 8 digits.  

### Exercise 3
Create a class with a method that deliberately throws an `ArrayIndexOutOfBoundsException` by accessing an invalid index of an array.  

#### Tests implemented with JUnit 5
- Verify that the method throws an `ArrayIndexOutOfBoundsException` using `assertThrows`.  
- Ensure that the exception message is properly validated.

---

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA  
- Git & GitHub  

---

## 📋 Requirements
- JDK 17 or higher installed  
- IntelliJ IDEA (or any Java-compatible IDE)  
- Git  

---

## 🛠️ Installation
Clone the repository and access the project folder:

```sh
git clone https://github.com/leilaweicman/1.4-Testing-Level1.git
cd 1.4-Testing-Level1
```

---

## ▶️ Execution

### Exercise 1

#### Running the tests
You can run all JUnit tests with Maven:

```sh
mvn test
```
Or directly from IntelliJ IDEA by right-clicking on the `LibraryTest` class and selecting Run 'LibraryTest'.

### Exercise 2

#### Running the tests
Run the parameterized JUnit tests in `DniCalculatorTest` to validate multiple DNI numbers and error cases.

### Exercise 3

#### Running the tests
Run the JUnit test `ArrayExceptionExampleTest` to verify that the method correctly throws an `ArrayIndexOutOfBoundsException`.

---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
