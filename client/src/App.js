import React, {Component} from "react";
import Header from "./components/Header";
import SideBar from "./components/SideBar";
import Footer from "./components/Footer";
import AboutInfo from "./components/AboutInfo";
import MainContent from "./components/MainContent"

class App extends Component {
    constructor(props) {
        super(props);

        this.handleCartActivation = this.handleCartActivation.bind(this);
        this.handleRegistrationForm = this.handleRegistrationForm.bind(this);
        this.handleLoginForm = this.handleLoginForm.bind(this);
        this.handleDisplayAboutInfo = this.handleDisplayAboutInfo.bind(this);
        this.handleDisplayMainContent = this.handleDisplayMainContent.bind(this);
    }

    state = {
        displayCart: false,
        displayRegistrationForm: false,
        displayLoginForm: false,
        displayAboutInfo: false,
        displayMainContent: true,
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

    handleDisplayAboutInfo() {
        this.setState({
            // displayAboutInfo: !this.state.displayAboutInfo


            displayMainContent: false,
            displayAboutInfo: true
        })
    }

    handleLoginForm() {
        if (this.state.displayRegistrationForm === false) {
            this.setState({
                displayLoginForm: !this.state.displayLoginForm
            })
        }
    }

    handleDisplayMainContent() {
        this.setState({
            displayMainContent: true,
            displayAboutInfo: false
            // displayMainContent: !this.state.displayMainContent
        })
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
                        handleDisplayAboutInfo={this.handleDisplayAboutInfo}
                        handleDisplayMainContent={this.handleDisplayMainContent}
                        username={this.state.username}
                />

                <SideBar handleFilter={this.handleFilter}/>
                <AboutInfo displayAboutInfo={this.state.displayAboutInfo}/>
                <MainContent
                    displayCart={this.state.displayCart}
                    displayRegistrationForm={this.state.displayRegistrationForm}
                    displayLoginForm={this.state.displayLoginForm}
                    displayMainContent={this.state.displayMainContent}
                />
                <Footer/>
            </div>
        );
    }
}

export default App;
