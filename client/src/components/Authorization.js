import React, { Component } from "react";

class Authorization extends Component {
  state = {};
  render() {
    return (
      <div id="authorization-button">
        <a href="/registration">Sign up</a>
        <a href="/login">Login</a>
        <a href="/logout">Logout</a>
      </div>
    );
  }
}

export default Authorization;
