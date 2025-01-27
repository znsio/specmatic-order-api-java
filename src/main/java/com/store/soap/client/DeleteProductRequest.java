package com.store.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteProductRequest", propOrder = {
        "productId"
})
@XmlRootElement(name = "DeleteProductRequest")
public class DeleteProductRequest {

    protected String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String value) {
        this.productId = value;
    }
}
