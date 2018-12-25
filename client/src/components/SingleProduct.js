import React, { Component } from "react";

class SingleProduct extends Component {
  constructor(props) {
    super(props);
  }
  state = {};
  render() {
    return (
      <div className="single-product">
        <div className="product-image">
          <img src={this.props.url} />
        </div>
        <div className="product-info">
          some text some text some text some text some text some text some text
          some text some text some text some text some text some text some text
          some text some text some text some text some text some text some text
          some text some text some text some text some text some text some text
          some text some text some text some text some text some text some text
          some text some text some text some text some text some text some text
        </div>
        <div className="add-to-cart">
          <button type="submit" obClick="q">
            Add to cart
          </button>
        </div>
      </div>
    );
  }
}

export default SingleProduct;
