package lsp1.view;

import lsp1.shape.Quadrliteral;

public class ShapeView {
    private final Quadrliteral rectangle;

    public ShapeView(Quadrliteral rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(rectangle.getArea());
    }
}
