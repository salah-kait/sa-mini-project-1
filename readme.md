# Mini-Project 1
## Team: Salah Khudirate,Shahjahan Rasel, Nejed Hatamleh

### Steps for starting project:
- Run the following command ``docker-compose up``.


- **You can skip this step, we already created that user for you**
  Create a user with admin role, using this endpoint using a post method ``http://localhost:8080/api/auth/signup``, with JSON body of the following schema: {
  "name": "Test",
  "username": "TestName",
  "password": 1234,
  "email": "test@gmail.com",
  "role": "ROLE_ADMIN"
  }


- After successfully creating a user, sign in using the following endpoint ``http://localhost:8080/api/auth/signin``, to receive the JWT and place it in the authentication header to be authenticated.



- Then perform a GET request to `` http://localhost:8080/batch/start `` to ignite the batch processing.

