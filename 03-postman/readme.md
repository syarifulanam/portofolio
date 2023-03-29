https://market-final-project.herokuapp.com

// run newman
newman run collection/market-final-project.postman_collection.json -e environment/localhost.postman_environment.json -r htmlextra

newman run .\collection\Market-Final-200.postman_collection.json -e environment/localhost.postman_environment.json -r htmlextra

