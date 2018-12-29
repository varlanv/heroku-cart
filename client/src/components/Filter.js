import React, {Component} from 'react';

class Filter extends Component {
    constructor(props) {
        super(props);
    }

    state = {};

    render() {
        return (
            <div>
                    <label>
                        {this.props.label}<input type="text" name={this.props.filterType}/>
                    </label>
            </div>

        )
    }
}

export default Filter