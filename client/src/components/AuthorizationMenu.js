import React, {Component} from "react";

class AuthorizationMenu extends Component {
    constructor(props){
        super(props);
    }
    state = {};


    render() {
        return (
            <div id="authorization-button">
                {this.props.username === "Anonymous" ?
                    <button id="registration-display" onClick={this.props.handleRegistrationForm}>Sign
                        up</button> : null}
                {this.props.username === "Anonymous" ? <button id="login-display"
                                                               onClick={this.props.handleLoginForm}>Login</button> : "Welcome " + this.props.username}
                {this.props.username === "Anonymous" ? null : <a href="/logout">Logout</a>}

            </div>
        );
    }
}

export default AuthorizationMenu;
