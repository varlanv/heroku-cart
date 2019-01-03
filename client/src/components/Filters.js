import React, {Component} from 'react';
import Filter from './Filter';

class Filters extends Component {
    constructor(props) {
        super(props);
        this.submitForm = this.submitForm.bind(this);
    }

    state = {};


    submitForm() {
        var myForm = document.getElementById("filter-form");

        myForm.addEventListener('submit', function () {
            var allInputs = myForm.getElementsByTagName('input');

            for (var i = 0; i < allInputs.length; i++) {
                var input = allInputs[i];

                if (input.name && !input.value) {
                    input.name = '';
                }
            }
        });
    }
    render() {
        return (
            <div>
                <form action="/api/products/filter" method="get" id="filter-form">
                    <Filter label={"Name"} filterType={"name"}/>
                    <Filter label={"Country"} filterType={"country"}/>
                    <Filter label={"Manufacturer"} filterType={"manufacturer"}/>
                    <button type="submit">CCCC</button>
                </form>
            </div>
        )
    }
}

export default Filters