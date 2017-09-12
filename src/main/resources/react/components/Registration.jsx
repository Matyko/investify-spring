import React from 'react';
import RegistrationService from '../services/RegistrationService';
import Home from './Login';
import Link from "react-router-dom/es/Link";

export default class Registration extends React.Component {
    constructor(props) {
        super(props);
    }




    render() {
        this.registration = new RegistrationService;
        return (
            <div className="container">
                <div className="col-lg-4 col-md-4 col-sm-6 col-sx-12">
                    <h1>Registration</h1>
                    <form>
                        <div className="form-group">
                            <label htmlFor="first-name">First name:</label>
                            <input type="text" className="form-control" id="first-name"/>
                        </div>
                        <div className="form-group">
                            <label htmlFor="last-name">Last name:</label>
                            <input type="text" className="form-control" id="last-name"/>
                        </div>
                        <div className="form-group">
                            <label htmlFor="email">Email address:</label>
                            <input type="email" className="form-control" id="email"/>
                        </div>
                        <div className="form-group">
                            <label htmlFor="pwd">Password:</label>
                            <input type="password" className="form-control" id="pwd"/>
                        </div>
                        <button type="submit" className="btn btn-default" onClick={this.registration.register.bind(this)}>Submit</button>
                        <br/>
                    </form>
                </div>
            </div>
        );
    }
}
