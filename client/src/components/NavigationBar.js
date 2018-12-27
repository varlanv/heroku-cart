import React, { Component } from "react";

class NagigationBar extends Component {
  state = {};
  render() {
    return (
      <nav id="main-navigation">
        <a href="#">github</a>
        <a href="#">linkedin</a>
        <a href="#">technologies used</a>
        <a href="/admin">ADMIN PAGE</a>
      </nav>
    );
  }
}

export default NagigationBar;
