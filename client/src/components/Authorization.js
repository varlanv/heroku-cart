import React, { Component } from "react";

class Authorization extends Component {
  state = {};
  render() {
    return (
      <div id="authorization-button">
        <a href="/signup">Sign up</a>
        <a href="/login">Login</a>
      </div>
    );
  }
}

export default Authorization;
