import React, {Component} from 'react';
import CartItem from './CartItem';

class CartContent extends Component {
    constructor(props) {
        super(props);
        this.handleRemoveFromCart = this.handleRemoveFromCart.bind(this);
       this.handleRemoveOneFromCart = this.handleRemoveOneFromCart.bind(this);
        this.handleAddOne = this.handleAddOne.bind(this);
        this.handleRemoveOneFromCart = this.handleRemoveOneFromCart.bind(this);
        this.handleEmail = this.handleEmail.bind(this);

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
        const body = await fetch("cart/remove/" + id, {
                method: 'DELETE',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }

            }
        ).then(response => response.json());
        this.setState({
            cartContent: body
        })
    }

    async handleAddOne(product) {
        const body = await fetch("/cart/add-one", {
            method: "POST",
            headers: {
                "accept": "application/json",
                "Content-Type": "application/json"
            },
            body: JSON.stringify(product)
        }).then(response => response.json());

        this.setState({
            cartContent: body
        })
    }

    async handleRemoveOneFromCart(id) {
        const body = await fetch("cart/remove-one/" + id, {
                method: 'DELETE',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }

            }
        ).then(response => response.json()).catch();

        this.setState({
            cartContent: body
        })
    }


    async handleSubmitPurchase(products) {
        await fetch("/cart/submit", {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(products)
        });
        await this.setState({
            cartContent: [],
            email: ""
        })
    }

    handleEmail(e) {
        this.setState({
            email: e.value
        })
    }

    render() {
        const {cartContent} = this.state;
        const showCart = cartContent.length <= 0 ? "hide-cart" : null;
        return (
            <div id="cart-content" className={showCart}>
                <ul>
                    {this.state.cartContent.map(prod => (
                        <li className={"single-cart-item"} key={prod.id}>
                            <CartItem product={prod} handleRemoveFromCart={this.handleRemoveFromCart}
                                      handleRemoveOneFromCart={this.handleRemoveOneFromCart}
                                      handleAddOne={this.handleAddOne}/>
                        </li>
                    ))}
                </ul>
                <button onClick={() => this.handleSubmitPurchase(cartContent)}>Submit purchase</button>
            </div>
        )
    }


}

export default CartContent;