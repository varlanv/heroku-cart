import React, {Component} from 'react';


class CartContent extends Component {
    constructor(props) {
        super(props);
    }

    async componentWillMount(event) {
        // await fetch("/cart/add", {
        //     method: 'POST',
        //     headers: {
        //         'Accept': 'application/json',
        //         'Content-Type': 'application/json'
        //     },
        //     body: JSON.stringify({
        //         id:  "1",
        //         name: "qwe",
        //         country: "wasdz",
        //         manufacturer: "mqwea",
        //         imageUrl: "reulasq"
        //     })
        // });

        const query = await fetch("/cart/get", {
            method: "GET",
            headers: {
                "accept": "application/json",
                "Content-Type": "application/json"
            }
        });



        const body = await query.json();

        this.setState({cartContent: body})
    }

    state = {
        cartContent: [],
    };




    render() {
        const {cartContent} = this.state;
        return (
            <div id="cart-content">
                <ul>
                    {cartContent.map(prod => (
                        <li key={prod.id}>
                            {prod.name}
                            {prod.country}
                            {prod.manufacturer}
                        </li>
                    ))}
                </ul>
            </div>
        )
    }
}

export default CartContent;