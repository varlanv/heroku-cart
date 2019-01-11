import React, {Component} from 'react';

class LoginForm extends Component {
    constructor(props) {
        super(props);
    }

    state = {};


    render() {

        return (
            <div id="login-wrapper">
                <form className="login-form" method="post" action="/login">
                    <h2>Login:</h2>
                    <br/>
                    <div>
                        <label htmlFor="username">Username</label>
                    </div>
                    <input type="text" name="username"
                           required autoFocus/>
                    <div>
                        <label htmlFor="password">Password</label>
                    </div>
                    <input type="password" name="password"
                           required/>
                    <input name="_csrf" type="hidden"/>
                    <button type="submit">Submit</button>
                </form>
            </div>

        );
    }
}

export default LoginForm;