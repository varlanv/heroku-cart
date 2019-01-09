import React, {Component} from "react";
import SingleProduct from "./SingleProduct";
import CartContent from "./CartContent";
import RegistrationForm from "./RegistrationForm";
import LoginForm from "./LoginForm";

class MainContent extends Component {
    state = {
        products: [],
        displayRegistrationForm: this.props.displayRegistrationForm,
        displayLoginForm: this.props.displayLoginForm
    };

    async componentWillMount() {
        const query = await fetch("/api/products");
        const body = await query.json();

        this.setState({
            products: body,
        });
    }

    render() {
        const {products} = this.state;
        const display = this.props.displayMainContent === true ? null : "display-main-content";

        return (
            <section id="main-content" className={display}>
                {this.props.displayCart ? <CartContent/> : null}
                {products.map(product => (
                    <SingleProduct key={product.id} id={product.id} name={product.name} country={product.country}
                                   manufacturer={product.manufacturer} imageUrl={product.imageUrl}
                                   price={product.price}/>
                ))}

                {this.props.displayRegistrationForm === true && this.props.displayLoginForm === false ?
                    <RegistrationForm/> : null}

                {this.props.displayLoginForm === true && this.props.displayRegistrationForm === false ?
                    <LoginForm/> : null}


                {/*{this.props.displayRegistrationForm ? <RegistrationForm/> : null}*/}
                {/*{this.props.displayLoginForm ? <LoginForm/> : null}*/}
            </section>
        );
    }
}

export default MainContent;
