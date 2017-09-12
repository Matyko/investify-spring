import React from 'react';
import Link from "react-router-dom/es/Link";
import AuthService from "../services/AuthService";

export default class Welcome extends React.Component {
    constructor(props) {
        super(props);
        this.state = {loggedIn:false, user:null};
        this.mainControllerSetState = this.mainControllerSetState.bind(this);
    }

    login() {
        let email = document.getElementById("email").value;
        let password = document.getElementById("pwd").value;
        this.authservice = new AuthService();
        this.authservice.authenticate(email, password).then(r => this.mainControllerSetState(r));
    }

    mainControllerSetState(newState) {
        if (!newState.loggedIn) {
            alert("Invalid username or password!");
            return;
        }
        this.setState(newState);
    }

    render() {
        let content;
        if (!this.state.loggedIn) {
            content = (
                <div className="container">
                    <div className="col-lg-4 col-md-4 col-sm-6 col-sx-12">
                        <h1>Welcome</h1>
                        <form>
                            <div className="form-group">
                                <label htmlFor="email">Email address:</label>
                                <input type="email" className="form-control" id="email"/>
                            </div>
                            <div className="form-group">
                                <label htmlFor="pwd">Password:</label>
                                <input type="password" className="form-control" id="pwd"/>
                            </div>
                            <button type="submit" className="btn btn-default" onClick={this.login.bind(this)}>Submit</button>
                            <br/>
                            <br/>
                            <button className="btn btn-default"><Link to='/registration'>Sign up</Link></button>
                        </form>
                    </div>
                </div>
            )
        }
        else if (this.state.loggedIn) {
                content = (<h1>Logged in!</h1>)
        }
        return (
            <div>
                {content}
            </div>

        )
    }
}
