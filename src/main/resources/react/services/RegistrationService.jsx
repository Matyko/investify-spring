export default class RegistrationService {
    register() {
        let email = document.getElementById("email").value;
        let firstName = document.getElementById("first-name").value;
        let lastName = document.getElementById("last-name").value;
        let password = document.getElementById("pwd").value;

        let result = new Promise((resolve, reject) => {
            let xhr = new XMLHttpRequest();

            xhr.open('POST', 'adduser');
            xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
            xhr.onload = function() {
                if (xhr.status !== 200) {
                    alert('A user already exists with this email adress!');
                    return;
                }
            };
            resolve('true');
            let encoded = encodeURI('firstName=' + firstName + '&lastName=' + lastName + '&email=' + email + '&password=' + password);
            xhr.send(encoded);
        });
        return result;
    }
}