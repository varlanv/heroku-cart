import React, {Component} from "react";

class AuthorizationMenu extends Component {
    state = {};

    render() {
        return (
            <div id="authorization-button">
                <button onClick={this.props.handleRegistrationForm}>Sign up</button>
                <button onClick={this.props.handleLoginForm}>Login</button>
                <a href="/logout">Logout</a>
            </div>
        );
    }
}

export default AuthorizationMenu;
