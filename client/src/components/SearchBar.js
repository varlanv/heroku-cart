import React, { Component } from "react";

class SearchBar extends Component {
  state = {};
  render() {
    return (
      <div id="search-main">
        <form action="q" value="qq">
          <input type="text" placeholder="Search" />
          <button type="submit">
             <i class="fas fa-search"></i>
          </button>
        </form>
      </div>
    );
  }
}

export default SearchBar;
