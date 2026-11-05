public class OrderItem {
    private Product product;   // Đối tượng sản phẩm mà khách gọi
    private int quantity;      // Số lượng khách gọi (số ấm, số 100g, hoặc số cái/bộ)
    private boolean isTakeAway; // Phân biệt hình thức: false = dùng tại chỗ, true = mang về

    // Constructor khởi tạo mục chi tiết sản phẩm được gọi
    public OrderItem(Product product, int quantity, boolean isTakeAway) {
        this.product = product;
        this.quantity = quantity;
        this.isTakeAway = isTakeAway;
    }

    // Phương thức tính thành tiền cho riêng dòng sản phẩm này (Giá đơn vị * Số lượng)
    public double getSubTotal() {
        return this.product.getPrice() * this.quantity;
    }

    // Các phương thức Getter
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public boolean isTakeAway() { return isTakeAway; }
}