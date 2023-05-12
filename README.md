# Spring Boot Blog-Rest-API Application

This is a Spring Boot application that provides REST API endpoints for managing blog posts.

## Requirements

To run this application, you will need the following:

- Java 8 or higher
- Maven 3.6 or higher

## Installation

1. Clone the repository to your local machine:
```diff
+git clone https://github.com/<username>/spring-boot-blog-rest-api.git 
```
2. Navigate to the project directory:
```diff
+cd spring-boot-blog-rest-api
```
3. Build the project using Maven:
```diff
+mvn clean install
```
4. Run the application:

```diff
+mvn spring-boot:run
```
5. The application will start running on http://localhost:8080.

## API Endpoints

The following endpoints are available:

- `GET /posts`: Get a list of all blog posts.
- `POST /posts`: Create a new blog post.
- `GET /posts/{id}`: Get a specific blog post by ID.
- `PUT /posts/{id}`: Update a specific blog post by ID.
- `DELETE /posts/{id}`: Delete a specific blog post by ID.

## Request and Response Formats

### GET /posts

Response Body:
```json
[
  {
    "id": 1,
    "title": "My First Blog Post",
    "content": "This is the content of my first blog post.",
    "createdAt": "2023-05-10T10:05:23.000Z",
    "updatedAt": "2023-05-10T10:05:23.000Z"
  },
  {
    "id": 2,
    "title": "My Second Blog Post",
    "content": "This is the content of my second blog post.",
    "createdAt": "2023-05-11T08:20:15.000Z",
    "updatedAt": "2023-05-11T08:20:15.000Z"
  }
]
```



 ## Pull requests are welcome, Here's a quick checklist for a good PR, more details below: 

1. A discussion around the change.
2. A GitHub Issue with a good description associated with the PR
3. One feature/change per PR
4. One commit per PR
5. PR rebased on main (`git pull`) 
5. [Good descriptive commit message, with link to issue](#commit-messages-and-issue-linking)
6. No changes to code not directly related to your PR
7. Includes functional/integration test
8. Includes documentation
# Author
This repository was created by @tsaransh. If you have any questions or feedback, feel free to reach out to me.
