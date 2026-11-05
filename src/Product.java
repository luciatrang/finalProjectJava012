public class Product {
    private int id;          // Mã định danh sản phẩm
    private String name;     // Tên sản phẩm (Trà hoặc Trà cụ)
    private String category; // Nhóm sản phẩm (Trà Xanh, Ô Long, Trà Cụ...)
    private double price;    // Giá tiền (theo ấm hoặc theo 100g hoặc theo cái/bộ)
    private String unit;     // Đơn vị tính ("Ấm", "100g", "Cái", "Bộ")

    // Constructor khởi tạo đầy đủ thông tin cho sản phẩm
    public Product(int id, String name, String category, double price, String unit) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.unit = unit;
    }

    // Các phương thức Getter trả về thông tin sản phẩm
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public String getUnit() { return unit; }
}