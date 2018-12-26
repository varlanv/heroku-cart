import React, {Component} from "react";
import SingleProduct from "./SingleProduct";
import CartContent from "./CartContent";

class MainContent extends Component {
    state = {
        products: [],
    };

    async componentDidMount() {
        const query = await fetch("/api/products");
        const body = await query.json();

        this.setState({
            products: body,
        });
    }



    render() {
        const {products} = this.state;

        return (
            <section id="main-content">
                {this.props.displayCart ? <CartContent/> : null}
                {products.map(product => (
                    <SingleProduct key={product.id} id={product.id} name={product.name} country={product.country}
                                   manufacturer={product.manufacturer} imageUrl={product.imageUrl}/>
                ))}


            </section>
        );
    }
}

export default MainContent;
