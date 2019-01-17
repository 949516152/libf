package com.libf.factoryAbstract;

import com.libf.factoryAbstract.impl.FactoryProducer;
import com.libf.factoryAbstract.impl.ProductFactory1;
import com.libf.factoryAbstract.impl.ProductFactory2;
import com.libf.factoryAbstract.interfaces.IProduct1;
import com.libf.factoryAbstract.interfaces.ProductFactory;

public class TestDemon {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        ProductFactory factory = factoryProducer.getFactory(FactoryProducer.PRODUCTFIRST);
        IProduct1 product1 = factory.getProduct1(ProductFactory1.PRODUCTA);
        IProduct1.setName("===");
        product1.getProduct();

        product1 = factory.getProduct1(ProductFactory1.PRODUCTB);
        IProduct1.setName("实施测试");
        product1.getProduct();

        factory = factoryProducer.getFactory(FactoryProducer.PRODUCTSECOND);

        factory.getProduct2(ProductFactory2.PRODUCT1).getProduct();
    }
}
