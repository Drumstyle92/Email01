# Services - Email 01
* use a service like SendGrid
* write a Spring Boot application with the necessary dependencies that:
* has all necessary e-mail SMTP configuration in application.yml
* defines a Student entity with the following string properties:
* id
* first name
* surname
* e-mail
* defines a StudentService that has:
* a list of 4 Students, where you are the first (with your email)
* a getStudentById method that returns the Student if present in the list
* exposes under the mapping notification an endpoint for sending an email to a specific student
* use a try/catch in the dedicated controller
* if the student ID is already in the list, send the email to that user
* otherwise, respond with a BAD_REQUEST message
* if the request is incorrect, respond with a 500 error HTTP response
* defines a NotificationDTO consisting of the following strings:
* Contact ID
* title
* text
* test the endpoint with Postman:
* send emails to a user on the list (you!)
* try to send email to a user who is not in the list
* try to send email with wrong payload