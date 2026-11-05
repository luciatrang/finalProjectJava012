public class Room {
    private String name;           // Tên loại phòng (Ví dụ: Phòng VIP, Phòng Tiêu Chuẩn...)
    private double pricePerRoom;   // Giá tiền của 1 phòng
    private int quantity;          // Số lượng phòng khách muốn dùng

    // Constructor phụ: Hỗ trợ trường hợp chỉ truyền tên phòng và giá (mặc định số lượng phòng = 1)
    public Room(String name, double pricePerRoom) {
        this.name = name;
        this.pricePerRoom = pricePerRoom;
        this.quantity = 1; 
    }

    // Constructor chính: Nhận đầy đủ tên phòng, giá tiền và số lượng phòng
    public Room(String name, double pricePerRoom, int quantity) {
        this.name = name;
        this.pricePerRoom = pricePerRoom;
        this.quantity = quantity;
    }

    // Phương thức tính tổng tiền phòng (Giá 1 phòng nhân với số lượng phòng đặt)
    public double getTotalRoomPrice() {
        return this.pricePerRoom * this.quantity;
    }

    // Các phương thức Getter để lấy dữ liệu ra ngoài
    public String getName() { return name; }
    public double getPricePerRoom() { return pricePerRoom; }
    public int getQuantity() { return quantity; }
}