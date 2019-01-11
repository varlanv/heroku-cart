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
                    <h2>Sign up:</h2>
                    <br/>
                    <div>
                        <label htmlFor="username">Username</label>
                    </div>
                    <input type="text" name="username" minLength="4" maxLength="20"
                           required autoFocus/>
                    <div>
                        Email
                        <br/>
                        (not necessary, cart content will be sent on this email in json format on purchase
                        confirmation)
                    </div>
                    <input type="email" name="email"/>
                    <div>
                        <label htmlFor="password">Password</label>
                    </div>
                    <input type="password" name="password" minLength="6" maxLength="60" required/>
                    <div>
                        <label htmlFor="passwordConfirm">Confirm password</label>
                    </div>
                    <input type="password" name="passwordConfirm" minLength="6" maxLength="60" required/>
                    <input name="_csrf" type="hidden"/>
                    <br/>
                    <button type="submit">Submit</button>
                </form>
            </div>
        );
    }
}

export default RegistrationForm;