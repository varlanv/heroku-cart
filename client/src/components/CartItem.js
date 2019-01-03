import React, {Component} from 'react';

class CartItem extends Component {
    constructor(props) {
        super(props);

    }

    state = {};

    render() {
        // hnd = () => this.props.handleRemoveFromCart(this.props.product);
        const {name, country, manufacturer, price, id, amountInCart, imageUrl} = this.props.product;
        return (
            <div className="cart-item">
                <div><img src={imageUrl}/></div>
                <div>Name: {name}</div>
                <div>Country: {country}</div>
                <div>Manufacturer: {manufacturer}</div>
                <div>Price: {price}</div>
                <div>Amount in cart: {amountInCart}</div>
                <div>Total price: {price * amountInCart}</div>
                <div>
                    <button onClick={() => this.props.handleAddOne(this.props.product)}>Add one</button>
                    <button onClick={() => this.props.handleRemoveOneFromCart(id)}>Remove one</button>
                    <button onClick={() => this.props.handleRemoveFromCart(id)}>Remove from cart</button>
                </div>
            </div>
        )
    }
}

export default CartItem;