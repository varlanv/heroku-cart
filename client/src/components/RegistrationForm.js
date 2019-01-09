import React, {Component} from 'react';

class RegistrationForm extends Component {
    constructor(props) {
        super(props);
    }

    state = {};

    render() {
        return (
            <div id="registration-wrapper">
                <form className="registration-form" method="post" action="/registration-proceed">
                    <h2>Please sign up</h2>
                    <label htmlFor="username">Username</label>
                    <input type="text" name="username" placeholder="Username"
                           required autoFocus/>
                    <input type="email" name="email" placeholder="Email" required/>
                    <label htmlFor="password">Password</label>
                    <input type="password" name="password"
                           placeholder="Password" required/>
                    <input type="password" name="passwordConfirm"
                           placeholder="Confirm password" required/>
                    <input name="_csrf" type="hidden"/>
                    <button type="submit">Submit</button>
                </form>
            </div>
        );
    }
}

export default RegistrationForm;