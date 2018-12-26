import React, { Component } from "react";
import SearchBar from "./SearchBar";
import Authorization from "./Authorization";
import NavigationBar from "./NavigationBar";
import CartIcon from "./CartIcon";

class Header extends Component {
    constructor(props) {
        super(props);
    }
  state = {};
  render() {
    return (
      <header id="header">
        <SearchBar />
        <Authorization />
        <NavigationBar />
        <CartIcon handleCartActivation={this.props.handleCartActivation}/>
      </header>
    );
  }
}

export default Header;
