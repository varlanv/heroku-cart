import React, {Component} from 'react';
import Filter from './Filter';

class Filters extends Component {
    constructor(props) {
        super(props);
    }

    state = {};

    render() {
        return (
            <div>
                <form action={"/api/products/filter"} method="get">
                    <Filter label={"Name"} filterType={"name"}/>
                    <Filter label={"Country"} filterType={"country"}/>
                    < Filter label={"Manufacturer"} filterType={"manufacturer"}/>
                    <input type="submit" value="Apply"/>
                </form>
            </div>
        )
    }
}

export default Filters