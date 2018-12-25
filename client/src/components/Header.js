import React, { Component } from "react";
import SearchBar from "./SearchBar";
import Authorization from "./Authorization";
import NavigationBar from "./NavigationBar";
import Cart from "./Cart";

class Header extends Component {
  state = {};
  render() {
    return (
      <header id="header">
        <SearchBar />
        <Authorization />
        <NavigationBar />
        <Cart />
      </header>
    );
  }
}

export default Header;
