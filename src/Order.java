import java.util.ArrayList;
import java.util.List;

public class Order {
    private Room room;              // Lưu thông tin phòng (có thể null nếu khách chỉ mua mang về)
    private String serviceType;     // Hình thức phục vụ (Dùng ở lại, Mang về, hoặc Cả hai)
    private List<OrderItem> items;  // Danh sách chứa các mục sản phẩm khách đã gọi

    // Constructor khởi tạo hóa đơn
    public Order(Room room, String serviceType) {
        this.room = room;
        this.serviceType = serviceType;
        this.items = new ArrayList<>(); // Khởi tạo danh sách món rỗng ban đầu
    }

    // Phương thức thêm một mục sản phẩm vào danh sách hóa đơn
    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    // Phương thức tính tổng tiền toàn bộ hóa đơn (Tiền phòng + Tiền tất cả các sản phẩm đã gọi)
    public double calculateTotal() {
        double total = 0;
        // Nếu có thuê phòng, cộng thêm tổng tiền phòng
        if (this.room != null) {
            total += this.room.getTotalRoomPrice();
        }
        // Duyệt vòng lặp cộng dồn tiền của từng sản phẩm trong danh sách
        for (OrderItem item : items) {
            total += item.getSubTotal();
        }
        return total;
    }

    // Phương thức in hóa đơn gộp chung duy nhất 1 bill ra màn hình console
    public void printBill() {
        System.out.println("\n================ HÓA ĐƠN THANH TOÁN CHUNG ================");
        // Nếu có thông tin phòng thì in ra dòng tiền phòng
        if (room != null) {
            System.out.println("Loại phòng: " + room.getName() + " | Số lượng: " + room.getQuantity() + " phòng | Tiền phòng: " + room.getTotalRoomPrice() + " VNĐ");
        }
        System.out.println("Hình thức phục vụ: " + serviceType);
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-22s | %-10s | %-5s | %-12s\n", "Tên sản phẩm", "Hình thức", "SL", "Thành tiền");
        System.out.println("----------------------------------------------------------");
        
        // Duyệt qua từng sản phẩm để in chi tiết từng dòng (hỗ trợ in lặp nếu gọi thêm món)
        for (OrderItem item : items) {
            String typeStr = item.isTakeAway() ? "Mang về" : "Tại chỗ";
            System.out.printf("%-22s | %-10s | %-5d | %-12.0f\n", 
                    item.getProduct().getName(), 
                    typeStr, 
                    item.getQuantity(), 
                    item.getSubTotal());
        }
        System.out.println("----------------------------------------------------------");
        System.out.printf("TỔNG CỘNG THANH TOÁN: %.0f VNĐ\n", calculateTotal());
        System.out.println("==========================================================\n");
    }
}