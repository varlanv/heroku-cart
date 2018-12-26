import React, {Component} from "react";

class CartIcon extends Component {
    constructor(props) {
        super(props);
    }

    state = {};

    render() {
        return (
            <div className="cart">
                <button onClick={this.props.handleCartActivation}><i className="fas fa-shopping-cart fa-2x"></i>
                </button>
            </div>
        );
    }
}

export default CartIcon;
