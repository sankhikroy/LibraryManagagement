# Library Management System (Java)

A simple console-based Library Management System built in Java using Object-Oriented Programming (OOP) principles. It allows users to add, view, borrow, and return books through an interactive menu.

## Features
- **Add Books:** Add new books with an ID, title, and author.
- **View All Books:** Display all books in the library along with their current availability status.
- **Borrow Books:** Check out an available book by its ID.
- **Return Books:** Return a borrowed book by its ID and mark it as available again.

## Project Structure
```text
├── Book.java      # Represents a book (ID, title, author, availability)
├── Library.java   # Manages the collection of books and core operations
└── Main.java      # Entry point with the interactive console menu
