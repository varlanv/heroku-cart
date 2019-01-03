import React, {Component} from 'react';

class CartItem extends Component {
    constructor(props) {
        super(props);

    }

    state = {};

    render() {
        // hnd = () => this.props.handleRemoveFromCart(this.props.product);
        const {name, country, manufacturer, price, id, amountInCart} = this.props.product;
        return (
            <div className="cart-item">
                <div>{name}</div>
                <div>{country}</div>
                <div>{manufacturer}</div>
                <div>{price}</div>
                <div>{amountInCart}
                    <button onClick={() => this.props.handleAddOne(this.props.product)}>Add one</button>
                    <button onClick={() => this.props.handleRemoveOneFromCart(id)}>Remove one</button>
                </div>
                <button onClick={() => this.props.handleRemoveFromCart(id)}>Remove from cart</button>
            </div>
        )
    }
}

export default CartItem;