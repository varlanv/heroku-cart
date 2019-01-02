import React, {Component} from 'react';


class CartContent extends Component {
    constructor(props) {
        super(props);
        this.handleRemoveFromCart = this.handleRemoveFromCart.bind(this)
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

    async handleRemoveFromCart(event) {
        fetch("cart/remove/1", {
                method: 'DELETE',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }

            }
        )
    }

    render() {
        const {cartContent} = this.state;
        return (
            <div id="cart-content">
                <ul>
                    {cartContent.map(prod => (
                        <li className={"single-cart-item"} key={prod.id}>
                            <img src={prod.imageUrl}/>
                            <br/>
                            Name: {prod.name}
                            <br/>
                            Country: {prod.country}
                            <br/>
                            Manufacturer: {prod.manufacturer}
                            <br/>
                            Price: ${prod.price}
                            <br/>
                            <button onClick={this.handleRemoveFromCart}>Remove from cart</button>
                        </li>
                    ))}
                </ul>
            </div>
        )
    }
}

export default CartContent;