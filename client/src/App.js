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
        displayLoginForm: false,
        username: "Anonymous"
    };

    handleCartActivation() {
        this.setState({
            displayCart: !this.state.displayCart
        })
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

   async componentWillMount() {
        const query = await fetch("/user-info").then(response => response.text());
        this.setState({
            username: query
        })
    }

    render() {
        return (
            <div id="main-grid">
                <Header handleCartActivation={this.handleCartActivation}
                        handleRegistrationForm={this.handleRegistrationForm}
                        handleLoginForm={this.handleLoginForm}
                        username={this.state.username}
                />

                <SideBar handleFilter={this.handleFilter}/>
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
