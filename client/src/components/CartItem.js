import React, {Component} from 'react';

class CartItem extends Component {
    constructor(props) {
        super(props);

    }

    state = {};

    render() {
        // hnd = () => this.props.handleRemoveFromCart(this.props.product);
        const {name, country, manufacturer, price, id} = this.props.product;
        return (
            <div className="cart-item">
                <div>{name}</div>
                <div>{country}</div>
                <div>{manufacturer}</div>
                <div>{price}</div>
                <button onClick={() => this.props.handleRemoveFromCart(id)}>Remove from cart</button>
            </div>
        )
    }
}

export default CartItem;