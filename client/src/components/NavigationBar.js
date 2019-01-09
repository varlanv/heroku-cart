import React, {Component} from "react";

class NagigationBar extends Component {
    constructor(props) {
        super(props);
    }

    state = {};

    render() {
        return (
            <nav id="main-navigation">
                <button onClick={this.props.handleDisplayMainContent}>Home</button>
                <a href="https://www.linkedin.com/in/varlan-vladislav-21274016a/">Linkedin</a>
                <button onClick={this.props.handleDisplayAboutInfo}>About</button>
                {/*<a href="/admin">Admin</a>*/}
            </nav>
        );
    }
}

export default NagigationBar;
