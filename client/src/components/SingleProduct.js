import React, {Component} from "react";

class SingleProduct extends Component {
    constructor(props) {
        super(props);
        this.handleAddToCart = this.handleAddToCart.bind(this);
    }

    state = {};

    async handleAddToCart(event) {
        await fetch("/cart/add", {
            method: "POST",
            headers: {
                "accept": "application/json",
                "Content-Type": "application/json"
            },
            body: JSON.stringify(this.props)

        });
    }

    render() {
        const {imageUrl, name, country, manufacturer, price} = this.props;

        return (
            <div className="single-product">
                <div className="product-image">
                    <img src={imageUrl}/>
                </div>
                <div className="product-info">
                    Name: {name}
                    <br/>
                    Country: {country}
                    <br/>
                    Manufacturer: {manufacturer}
                    <br/>
                    Price: ${price}
                </div>
                <div className="add-to-cart">
                    <button type="submit" onClick={this.handleAddToCart}>
                        Add to cart
                    </button>
                </div>
            </div>
        );
    }
}

export default SingleProduct;
