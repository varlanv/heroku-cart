import React, {Component} from "react";
import Filters from './Filters';

class SideBar extends Component {

    render() {
        return (
            <aside id="side-bar">
                Filters (currently only as json)
                <br/>
                <br/>
                <Filters />

            </aside>
        );
    }
}

export default SideBar;
