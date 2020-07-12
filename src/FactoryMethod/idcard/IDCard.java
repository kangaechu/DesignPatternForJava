package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

public class IDCard extends Product {
    private int id;
    private String owner;

    public IDCard(int id, String owner) {
        System.out.println("id:" + id + "," + owner + "のカードを作ります。");
        this.id = id;
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("id:" + id + "," + owner + "のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }
}
