import React, {Component} from "react";
import Header from "./components/Header";
import SideBar from "./components/SideBar";
import Footer from "./components/Footer";
import MainContent from "./components/MainContent";

class App extends Component {
    constructor(props) {
        super(props);

        this.handleCartActivation = this.handleCartActivation.bind(this);
    }

    state = {
        displayCart: false
    };

    handleCartActivation() {
        this.setState({displayCart: !this.state.displayCart})
    }

    render() {
        return (
            <div id="main-grid">
                <Header handleCartActivation={this.handleCartActivation}/>
                <SideBar/>
                <MainContent displayCart={this.state.displayCart}/>

                <Footer/>
            </div>
        );
    }
}

export default App;
