# elite

user creation curl

curl --location 'localhost:8080/api/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "naresh",
    "lastName": "p",
    "email": "bna1@com"
}'
