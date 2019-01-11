import React, {Component} from 'react';
import Filter from './Filter';

class Filters extends Component {
    constructor(props) {
        super(props);
        this.submitForm = this.submitForm.bind(this);
    }

    state = {};


    submitForm() {
        let myForm = document.getElementById("filter-form");

        myForm.addEventListener('submit', function () {
            let allInputs = myForm.getElementsByTagName('input');

            for (let i = 0; i < allInputs.length; i++) {
                let input = allInputs[i];

                if (input.name && !input.value) {
                    input.name = '';
                }
            }
        });
    }
    render() {
        return (
            <div id="filters">
                Filters (currently only as json)
                <br/>
                <br/>
                <form action="/api/products/filter" method="get" id="filter-form">
                    <Filter label={"Name"} filterType={"name"}/>
                    <Filter label={"Country"} filterType={"country"}/>
                    <Filter label={"Manufacturer"} filterType={"manufacturer"}/>
                    <button type="submit">Apply</button>
                </form>
            </div>
        )
    }
}

export default Filters