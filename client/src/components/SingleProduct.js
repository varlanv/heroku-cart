import React, {Component} from "react";

class SingleProduct extends Component {
    constructor(props) {
        super(props);
        this.handleAddToCart = this.handleAddToCart.bind(this);
    }

    state = {};

    async handleAddToCart(event) {
        alert(JSON.stringify(this.props));
        await fetch("/test", {
                method: "POST",
                headers: {
                    "accept": "application/json",
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(this.props)
            });
    }

    render() {
        const {id, imageUrl, name, country, manufacturer} = this.props;

        return (
            <div className="single-product">
                <div className="product-image">
                    <img src={imageUrl}/>
                </div>
                <div className="product-info">
                    {name}
                    <br/>
                    {country}
                    <br/>
                    {manufacturer}
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
