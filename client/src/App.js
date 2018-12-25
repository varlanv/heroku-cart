import React, { Component } from "react";
import Header from "./components/Header";
import SideBar from "./components/SideBar";
import Footer from "./components/Footer";
import MainContent from "./components/MainContent";

class App extends Component {
  constructor(props) {
    super(props);
  }

  state = {};

  render() {
    return (
      <div id="main-grid">
        <Header />
        <SideBar />
        <MainContent />

        <Footer />
      </div>
    );
  }
}

export default App;
