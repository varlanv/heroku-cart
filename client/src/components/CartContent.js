import React, {Component} from 'react';
import CartItem from './CartItem';

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

    async handleRemoveFromCart(id) {
        this.setState({
            cartContent: this.state.cartContent.filter(p => p.id !== id)
        });
        fetch("cart/remove/"+id, {
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
                            <CartItem product={prod} handleRemoveFromCart={this.handleRemoveFromCart}/>
                        </li>
                    ))}
                </ul>
            </div>
        )
    }
}

export default CartContent;