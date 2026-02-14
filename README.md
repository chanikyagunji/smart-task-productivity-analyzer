# Smart Task & Productivity Analyzer

## Overview
**Smart Task & Productivity Analyzer** is a Java-based application designed to help users efficiently manage daily tasks and gain actionable insights into their productivity. The system enables users to create, track, and analyze tasks while monitoring time usage to improve focus, efficiency, and overall performance.

This project demonstrates strong fundamentals in **Java**, **Object-Oriented Programming (OOP)**, **Java Collections**, and **File Handling**, making it suitable for academic evaluation and entry-level software engineering portfolios.

---

## Problem Statement
Students and professionals often struggle with:
- Poor task organization  
- Lack of awareness of time usage  
- Absence of measurable productivity insights  

This application addresses these challenges by combining **task management** with **basic productivity analytics**, enabling users to better plan, execute, and evaluate their daily activities.

---

## Features

### Task Management
- Create tasks with:
  - **Title** (e.g., *Analyse the market with proper techniques*)
  - **Description**
  - **Priority** (Low / Medium / High)
  - **Deadline**
- Update existing task details
- Track task status:
  - Pending
  - In Progress
  - Completed
- Delete completed or unwanted tasks

---

###Time Tracking Feature Added
You implemented real productivity logic in your project.

Now the system can:

Record start time of a task

Record end time of a task

---

### Productivity Analysis
- Total number of tasks completed
- Comparison of time spent on:
  - High-priority tasks
  - Low-priority tasks
- Daily productivity summaries
- Identification of the most productive days

---

### Data Persistence
- Task data is stored using **File Handling (I/O)**
- Data remains available after restarting the application
- Ensures reliability and continuity of user information

---

## Technologies Used
- **Java**
- **Object-Oriented Programming (OOP)**
- **Java Collections Framework**
- **File Handling (I/O)**

---

## Project Structure
smart-task-productivity-analyzer/

│── src/

│ ├── Main.java

│ ├── Task.java

│ ├── TaskManager.java

│ └── ProductivityAnalyzer.java

│── data/

│ └── tasks.txt

│── README.md


---

## How to Run
1.Clone the repository:
```bash
git clone https://github.com/your-username/smart-task-productivity-analyzer.git

**2.Navigate to the project directory:**
cd smart-task-productivity-analyzer

3.Compile the source files:
javac src/*.java

4.Run the application:
java src.Main

##Future Enhancements

Graphical User Interface using JavaFX or Swing

Database integration (MySQL / PostgreSQL)

Weekly and monthly productivity reports

Data visualization using charts

Cloud-based task synchronization





