import React, {Component} from "react";

class SideBar extends Component {
    constructor(props) {
        super(props);

        this.handleNameChange = this.handleNameChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleCountryChange = this.handleCountryChange.bind(this);
        this.handleManufacturerChange = this.handleManufacturerChange.bind(this);
    }

    state = {
        name: "",
        country: "",
        manufacturer: "",
        imageUrl: ""
    };

    handleNameChange(event) {
        // this.setState({ name: event.target.value });
        this.setState({
            name: event.target.value
        });
    }

    handleCountryChange(event) {
        this.setState({
            country: event.target.value
        });
    }

    handleManufacturerChange(event) {
        this.setState({
            manufacturer: event.target.value
        });
    }

    async handleSubmit(event) {
        await fetch("/api/products/add", {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                name: this.state.name,
                country: this.state.country,
                manufacturer: this.state.manufacturer,
                imageUrl: this.state.imageUrl
            })
        }).then((res) => res.json());

    }

    render() {
        return (
            <aside id="side-bar">
                <form onSubmit={this.handleSubmit}>
                    <label>
                        <input type="text" onChange={this.handleNameChange}/>
                    </label>
                    <label>
                        <input type="text" onChange={this.handleCountryChange}/>
                    </label>
                    <label>
                        <input type="text" onChange={this.handleManufacturerChange}/>
                    </label>
                    <input type="submit" value="Submit"/>
                </form>
            </aside>
        );
    }
}

export default SideBar;
