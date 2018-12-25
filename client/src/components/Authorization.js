import React, { Component } from "react";

class Authorization extends Component {
  state = {};
  render() {
    return (
      <div id="authorization-button">
        <a href="/a">Sign up</a>
        <a href="/login">Login</a>
      </div>
    );
  }
}

export default Authorization;
