import React, {Component} from "react";
import Header from "./components/Header";
import SideBar from "./components/SideBar";
import Footer from "./components/Footer";
import MainContent from "./components/MainContent";

class App extends Component {
    constructor(props) {
        super(props);

        this.handleCartActivation = this.handleCartActivation.bind(this);
        this.handleRegistrationForm = this.handleRegistrationForm.bind(this);
        this.handleLoginForm = this.handleLoginForm.bind(this);
    }

    state = {
        displayCart: false,
        displayRegistrationForm: false,
        displayLoginForm: false
    };

    handleCartActivation() {
        if (this.state.displayCart === false) {
            this.setState({
                displayCart: true
            })
        } else {
            this.setState({
                displayCart: false
            })
        }
    }


    handleRegistrationForm() {
        if (this.state.displayLoginForm === false) {
            this.setState({
                displayRegistrationForm: !this.state.displayRegistrationForm
            })
        }
    }

    handleLoginForm() {
        if (this.state.displayRegistrationForm === false) {
            this.setState({
                displayLoginForm: !this.state.displayLoginForm
            })
        }
    }

    render() {
        return (
            <div id="main-grid">
                <Header handleCartActivation={this.handleCartActivation}
                        handleRegistrationForm={this.handleRegistrationForm}
                        handleLoginForm={this.handleLoginForm}
                />

                <SideBar/>
                <MainContent displayCart={this.state.displayCart}
                             displayRegistrationForm={this.state.displayRegistrationForm}
                             displayLoginForm={this.state.displayLoginForm}
                />
                <Footer/>
            </div>
        );
    }
}

export default App;
