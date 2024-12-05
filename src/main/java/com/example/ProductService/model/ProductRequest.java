package com.example.ProductService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequest {


        private long productId;
        private String productName;
        private long price;
        private long quantity;
        public ProductRequest() {
        }

        public ProductRequest(long productId, String productName, long price, long quantity) {
                this.productId = productId;
                this.productName = productName;
                this.price = price;
                this.quantity = quantity;
        }

        public long getProductId() {
                return productId;
        }

        public void setProductId(long productId) {
                this.productId = productId;
        }

        public String getProductName() {
                return productName;
        }

        public void setProductName(String productName) {
                this.productName = productName;
        }

        public long getPrice() {
                return price;
        }

        public void setPrice(long price) {
                this.price = price;
        }

        public long getQuantity() {
                return quantity;
        }

        public void setQuantity(long quantity) {
                this.quantity = quantity;
        }



}
