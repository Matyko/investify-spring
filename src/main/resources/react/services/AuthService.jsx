export default class AuthService {
    authenticate(email, password) {
        let result = new Promise((resolve, reject) => {
            let xhr = new XMLHttpRequest();
            xhr.open("POST", "/authenticate");
            xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
            xhr.onload = function () {
                if (xhr.status !== 200) {
                    alert('NO!');
                    return;
                }
            };
            let encoded = encodeURI('email=' + email + '&password=' + password);
            xhr.send(encoded);
            console.log(xhr.responseText);
            resolve(xhr.responseText);
        });
        return result;
    }
}