import React, {Component} from 'react';

class LoginForm extends Component {
    constructor(props) {
        super(props);
    }

    state = {
    };


    render() {

        return (
            <div id="login-wrapper">
                <form className="login-form" method="post" action="/login">
                    <h2>Please login</h2>
                    <label htmlFor="username">Username</label>
                    <input type="text" name="username" placeholder="Username"
                           required autoFocus/>
                    <label htmlFor="password">Password</label>
                    <input type="password" name="password"
                           placeholder="Password" required/>
                    <input name="_csrf" type="hidden"/>
                    <button type="submit">Submit</button>
                </form>
            </div>

        );
    }
}

export default LoginForm;