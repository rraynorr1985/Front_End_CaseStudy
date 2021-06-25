To make this project working - you do need to create DB with the name "lapmed_final", that predefined in the configuration in the "application.properties" file(jdbc:mysql://localhost:3306/lapmed_final).Path: "Case_Study/src/main/resources/application.properties" (also in that file you might need to change "login" and "password" credentials to yours personal, if it's not "root" and "password")

You need to launch one simple query for that:
 CREATE DATABASE `lapmed_final`,
or change DB name in that file to any,that already exist,or was just created in your Database by you.
After that everything else would be created automatically using JPA at a runtime - all you need to do - is run project as a Java Application.


System Purpose:
System will help to provide customer features to store all his medical info in one place, including his medical history, documents, his last visit dates.
System would be able to provide for doctor’s tools, for promote their services to customers, and manage their schedule, placing available timeslot into system.
Besides, it will provide to customer clear and understandable information about pricing, in case if customer want to pay out-of-pocket, and searching affordable Medical Care.(not implemented yet).

First created User - would be Admin automatically, all Users after that would be Users, and if you need to switch them to Admin - you'd need to do it Manually - changing it,using SQL Queries.

Technologies that has been used:
- Java Core 8 EE	
- SQL DB(MariaDB)
- Hibernate Framework for JPA implementation
- Spring Boot
- Spring Security
- Servlets/JSP
- HTML/CSS/Bootstrap
- File I/O, NiO
- JavaScript
- Maven
- Junit
- TomCat as a server

Technical Description:
- App has Full CRUD functionality
- The project has RDBMS model and the schema is included in the project folder with file name: Final_WorkFlow_LapMED.pdf
- App has 11 implemented .JSP pages.
- App using external CSS and JS files for styling and JS functions
- Used JUNIT to test "DoctorsService" full CRUD functionality
- Included Sign up/login functionality, with encrypted passwords, autologin & authorization with bcrypt
- App using Model, through "entitites" package, with Java classes that represent an entity and are used to tranfer data related to an entity, create multiple queries and represent the database as an object-oriented model.
- App also using Custom Exceptions to describe an error.
- App contain contant variables - that defining role name,that is necessary - because Spring Security recognizing only particular role name format.
- App using Spring Boot, that is responsible for responding to a request made by user by tools such as: different type of sessions, annotation-based controller, exception handling, models and model attributes.


The System is divided into parts,some was implemented already,and someneed to be implemented in future:
User stories, that already has been implemented:
1.As a Customer I can Login/Signup.
2.As a Customer I can review and search Doctor information.
3.As a Customer and an Admin, I can Upload medical history documentation.
4.As an Admin I can Login/Signup to get access for an extra abilities.
5.As an Admin I can Managing Information on the Web-Page(Adding, Editing, Deletion doctors/insurances, Assigning Insurance to Doctor).


First created User - would be Admin automatically, all Users after that would be Users, and if you need to switch them to Admin - you'd need to do it Mannually - changing it,using SQL Queries.

Project features Step-By-Step explanation:
-“Search Doctors” That button is for searching Doctor – you need to find, by any Field(Name, Last name, Phone, Address, Insurance),cannot be accessed without logged in as a user or admin.
-Login Form going to pop up if you’d press any button on the Main page
-Registration form going to pop up, if you press Create and account from the Login page
-"Upload documents" "For Admin" These two buttons for admins functionality and files uploading feature. 
You need to be Logged in with the Role Admin to be able to access “Admins” operations(Delete, Edit, Add, Insurance assign)
You need to be logged with the Role Admin or User to be able to upload Files

“Admin View” – you do have ability to Edit, Delete, Add, Assign Insurance, as well as Logout and Search in the table
“User view” – you do not have the ability to Add, Edit, Delete. You only can search Doctor by any info you have 
When you logged as an admin you might add new Doctor,Doctor's Form, having Validations for some fields(Not Empty, or Null) it is also have Validations for correct data input

“Assign Insurance” button led you to Insurance table. If you have Admin Role you can add new Insurance, Edit and Delete Insurance, as well as searching from the list.

"Upload documents" Button going to render file Uploading page – you do have the ability to upload the file, list of the uploaded files is rendering in the end of the page(you can’t upload empty file), it’ going to throw you exception and render an error page if you'd try.


Additional Features:
- User, Doctor and patient entities has Timestamp, when it was created and updated for keep track and Report downloading purposes in future.
- Using JavaScript for Select All/Unselect all Checkboxes for feedback, and an Alert message with choosing “Feedbacks”
- Using Bootstrap for Front-End
- Using Junit for Testing

Challenges:
1. Spring Security Implementation with different roles has been overcame by understanding “ROLE_USER” is mandatory name for SPRING Security
2. Spring Boot Implementation – have been overcame by reading an extra information, watching video and understanding how is it work.
3. File Uploading Implementation – Have been overcame by searching and watching extra materials, that is beyond the basic course Scope.
4. DB architecture building scope, when was at the start of the project it was difficult to estimate how much time you need and how complex your idea,have been overcame by splitting project into small pierces, and defining scope for being able to deliver necessary deliverables – on time.
5.Tables relationship implementation for JPA such as @ManyToMany. Have been overcame by going through the code repeatedly, reading extra material, requesting extra consultation from the instructor.
