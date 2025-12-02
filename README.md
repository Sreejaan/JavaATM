# 🏦 IIT GN Banking System – ATM Console Application (Java)

A simple **ATM Banking System** built using **Core Java** fundamentals.  
This mini-project allows users to register, login, and perform basic banking operations using a console interface.

---

## 🚀 Features

### 🔐 User Authentication
- Login using **Account Number** + **PIN**
- Register new user accounts
- Stores multiple accounts using a `HashMap<Integer, Accounts>`

### 👤 Account Operations
Once logged in, a user can:
- ✔ Check Balance  
- ✔ Deposit Money  
- ✔ Withdraw Money  
- ✔ Change Mobile Number  
- ✔ Change PIN  
- ✔ View Transaction History  
- ✔ Logout

### 📝 Transaction History
Every operation (deposit, withdrawal, PIN change, mobile number update) is stored inside a `List<String>`.

---

## 🧠 Java Concepts Used

| Concept | Usage |
|--------|-------|
| **OOP (Classes & Objects)** | Account structure & methods |
| **Collections (Map, List)** | Account database + transaction history |
| **Methods & Parameters** | deposit(), withdraw(), changePIN(), etc. |
| **Loops (do-while, while)** | Menus & repeated actions |
| **Conditionals (if-else, switch)** | User choices & validation |
| **Strings** | Transaction logging |
| **Scanner Input** | Console-based user input |



## 🧪 Sample Usage Flow

1. Start the program  
2. Register with:
   - Name
   - Mobile number
   - Initial balance
   - Account number
   - PIN  
3. Login using account number & PIN  
4. Use the menu to deposit/withdraw/change PIN/etc.  
5. View transaction history  
6. Logout  

---

## 👨‍💻 Author
**Sreejaan Gupta**

---
