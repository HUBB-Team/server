var nameEmail = {
    "name": "Richard Strauss",
    "email": "richard.strauss@gmail.com"
};

var jsonTest = {
    "name": "api",
    "version": "0.0.1",
    "description": "Ourclothe API",
    "main": "index.js",
    "scripts": {
        "test": "node ./node_modules/.bin/mocha --reporter spec test/main.js"
    },
    "repository": {
        "type": "git",
        "url": "git@git.udom.tk:ourclothe/ourclothe-api.git"
    },
    "keywords": [
        "api",
        "server"
    ],
    "author": "Grigorii Horos",
    "license": "SEE LICENSE IN LICENSE.md",
    "dependencies": {
        "body-parser": "^1.14.1",
        "cookie-parser": "^1.4.0",
        "express": "^4.13.3",
        "express-session": "^1.12.1",
        "moment": "^2.10.6",
        "multer": "^1.1.0",
        "mysql": "^2.9.0",
        "serve-favicon": "^2.3.0",
        "validator": "^4.2.1"
    },
    "devDependencies": {
        "mocha": "^2.3.3",
        "prettyjson": "^1.1.3",
        "request": "^2.67.0",
        "supertest": "^1.1.0",
        "supervisor": "^0.9.1"
    }
};


function loadNameEmailValue() {
    document.getElementById("textArea").value = JSON.stringify(nameEmail);
}

function loadJsonValue() {
    document.getElementById("textArea").value = JSON.stringify(jsonTest);
}

function sendCredentials() {
    var textAreaText = $('textArea').val();

    $.ajax({
        url: 'CredentialsServlet',
        type: "post",
        dataType: 'json',
        data: textAreaText,
        contentType: 'application/json',
        mimeType: 'application/json',

        success: function (data) {
            document.getElementById("textArea").value = data.toString();
        },

        error: function (data, status, er) {
            console.log("error: " + data + ";\nstatus: " + status + "; \ner: " + er);
        }

    });
}

function send() {
    var textAreaText = $('textArea').val();

    $.ajax({
        url: 'JsonTestServlet',
        type: "post",
        dataType: 'json',
        data: textAreaText,
        contentType: 'application/json',
        mimeType: 'application/json',

        success: function (data) {
            document.getElementById("textArea").value = data.toString();
        },

        error: function (data, status, er) {
            console.log("error: " + data + ";\nstatus: " + status + "; \ner: " + er);
        }

    });
}
