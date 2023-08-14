# 🎥 Cinema App 🎥

This is a simple server program designed to organize the operation of the cinema and supports all the most necessary functions, such as:

* New user registration and login for registered users
* Add and remove movies, movie sessions, and cinema halls
* Add the tickets to the shopping cart and complete the order

The program supports two types of roles: `ADMIN` and `USER`.
The user has the opportunity to view sessions, movies, manage their orders.
Admin can add or remove movies, sessions and so on.

Information is sent and received in `JSON` format.
The program is written in compliance with SOLID principles,
interfaces as example for comply the Dependency inversion principle,
and mappers for the Single-responsibility principle.

## 🧑‍💻 Technologies
| Technology             | Version      |
|:-----------------------|:-------------|
| JDK                    | 11           |
| Maven                  | 4.0.0        |
| Tomcat                 | 9.0.76       |
| MySQL                  | 8.0.22       |
| Spring (WEB, Security) | 5.3.20       |
| Hibernate              | 5.6.14.Final |

## ⚙ Architecture
|       3-layer architecture       |
|:--------------------------------:|
| Controllers (Presentation layer) |
|                ↓↑                |
|   Services (Application layer)   |
|                ↓↑                |
|     DAO (Data access layer)      |

## 🚀 Features
|  Role   | Possibility                                                                                      | Endpoints                                                                                                                                                                                                                                   |
|:-------:|:-------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `ADMIN` | Get and add movies, cinema halls<br/>Get, add and delete movie sessions<br/>Find users by email  | GET: `/cinema-halls`<br/>POST: `/cinema-halls`<br/>GET: `/movies`<br/>POST: `/movies`<br/>GET: `/movie-sessions/available`<br/>POST: `/movie-sessions`<br/>PUT: `/movie-sessions/{id}`<br/>DELETE: `/movie-sessions/{id}`<br/>GET: `/users/by-email` |
| `USER`  | Get movies, movie sessions and cinema halls<br/>Add tickets to shopping card<br/>Complete orders | GET: `/cinema-halls`<br/>GET: `/movies`<br/>GET: `/movie-sessions/available`<br/>GET: `/orders`<br/>POST: `/orders/complete`<br/>PUT: `/shopping-carts/movie-sessions`<br/>GET: `/shopping-carts/by-user`                                          |

There is also another endpoint for registering new users, which is available to everyone: `/register`
A user without an `ADMIN` role cannot perform operations, defined exclusively for users with `ADMIN` roles.

## 🔨 How To Run And Test This Web Application?
1. Install the necessary software: JDK, Maven, MySQL, and Tomcat.
2. Clone the project from GitHub
3. Configure `/resources/db.properties` with your own URL, username, password and JDBC driver
4. Configure Tomcat server (it is recommended to use [version 9.0.76](https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.76/bin/))
5. First user with the role of `ADMIN` will be created automatically with the following parameters: email - `admin@i.ua`, password - `admin123`
6. Run and enjoy the program 😉

## ✨ UML Diagram
![UML Diagram](img/uml.png)
