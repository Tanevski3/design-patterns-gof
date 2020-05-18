package com.mtanevski.designpatterns.gof.visitor.v1;

public class ShoppingCartVisitor implements Visitor {

    private double totalCost;

    public double getTotalCost() {
        return totalCost;
    }

    public void incrementTotalCost(double elementCost) {
        totalCost += elementCost;
    }

    @Override
    public void visit(Element element) {
        if(element instanceof Book){
            System.out.println("Visited book");
            Book book = (Book) element;
            this.incrementTotalCost(book.getCost());
            System.out.println("Add book to shopping cart");
        }

        if(element instanceof Fruit){
            System.out.println("Visited Fruit");
            Fruit fruit = (Fruit) element;
            this.incrementTotalCost(fruit.getCost());
            System.out.println("Add fruit to shopping cart");
        }
    }
}
