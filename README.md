# PassKey Validation API

API build in [Spring](https://spring.io/) - [Kotlin](https://kotlinlang.org/)


This project exposes a web api that validates that a password is valid.<br>
Input: a password decrypted.<br>
Output: json indicating if the password (input) is valid.

Validations:
* Nine or more characters
* At least 1 lowercase letter
* At least 1 capital letter
* At least 1 special character (!@#$%^&*()-+)

------------------

## Docker image URL

[https://hub.docker.com/repository/docker/stephanogiuseppe/passkey-validation/](https://hub.docker.com/repository/docker/stephanogiuseppe/passkey-validation/)


## Pre requirements

[Docker](https://docs.docker.com/) installed at the PC

## Run the project

Just only run command below in terminal

```sh
sudo docker run --name passkey-validation -p 8080:8080 stephanogiuseppe/passkey-validation
```

## Documentation

After the project starts, go to [PassKey Validation Swagger DOC](http://localhost:8080/api/v1/swagger-ui/index.html)

### MVP Features

* Password verification
* Simple error handler and response

## Future Release

* 0.0.2
    * Receive an encrypted password

## Contributing

1. Fork it (<https://github.com/stephanogiuseppe/passkey-validation>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request
