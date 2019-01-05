import React, {Component} from "react";

class AuthorizationMenu extends Component {
    state = {
        username: "qwe"
    };

    async componentWillMount() {
        const query = await fetch("/user-info").then(response => response.text());
        this.setState({
            username: query
        })
    }

    render() {
        return (
            <div id="authorization-button">
                <button id="registration-display" onClick={this.props.handleRegistrationForm}>Sign up</button>
                <button id="login-display" onClick={this.props.handleLoginForm}>Login</button>
                <a href="/logout">Logout</a>
                {this.state.username}

            </div>
        );
    }
}

export default AuthorizationMenu;
