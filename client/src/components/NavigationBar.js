import React, { Component } from "react";

class NagigationBar extends Component {
  state = {};
  render() {
    return (
      <nav id="main-navigation">
        <a href="#">Home</a>
        <a href="#">Linkedin</a>
        <a href="#">About</a>
        <a href="/admin">Admin</a>
      </nav>
    );
  }
}

export default NagigationBar;
