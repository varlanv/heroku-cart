import React, {Component} from "react";

class AuthorizationMenu extends Component {
    state = {};

    render() {
        return (
            <div id="authorization-button">
                <button id="registration-display" onClick={this.props.handleRegistrationForm}>Sign up</button>
                <button id="login-display" onClick={this.props.handleLoginForm}>Login</button>
                <a href="/logout">Logout</a>
            </div>
        );
    }
}

export default AuthorizationMenu;
