# Persona CRUD API
 Persona CRUD API for Hacker Rank test
 
 ## How to run app
 
 The app use maven, for run you need execute these commands in the project folder which contains the pom.xml file. 
 For build:
 ```
 maven package
 mvn install
 ```
 For run app with java command:
```
java -jar target/Persona-0.0.1-SNAPSHOT.jar
```

## Examples URL Calls
### For Create

```
POST to localhost:8080/persona/create
```

and give a JSON object of Persona, like this:

```
{
"id":5,
"name":"Sebastian",
"lastname":"Riquelme",
"address":"Av.Argentina 2321",
"phoneNumber":9454566,
"hairColour":"red"
}
```

Example images in POSTMAN:
Create
![Create](https://i.imgur.com/sSWIjBf.png)

 
### For Read

```
GET to localhost:8080/persona/
```
and
```
GET to http://localhost:8080/persona/get/{id}
```

Example images in POSTMAN:

Get All
![Get All](https://i.imgur.com/RaxivQV.png)

Get By ID
![Get by ID](https://i.imgur.com/T5I9G1w.png)

 ### For Update

```
PUT to localhost:8080/persona/update/{id}
```

and give a JSON object of Persona, like this:

```
{
"id":5,
"name":"Sebastian",
"lastname":"Riquelme",
"address":"Av.Argentina 2321",
"phoneNumber":9454566,
"hairColour":"red"
}
```
Example images in POSTMAN:

Update
![Update](h https://i.imgur.com/fDQNZ67.png)

 
 ### For Delete
 
```
DELETE to localhost:8080/persona/delete/{id}
```

Example images in POSTMAN:

Delete
![Delete](https://i.imgur.com/iXCGEXM.png)

