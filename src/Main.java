import java.util.Scanner;

public class Main {
    // Hàm chọn trà dùng tại chỗ (giá theo ấm)
    public static Product chooseDineInTea(Scanner scanner) {
        int group = 0;
        while (true) {
            System.out.println("\n--- CHỌN NHÓM TRÀ DÙNG TẠI CHỖ (GIÁ THEO ẤM) ---");
            System.out.println("1. Nhóm Trà Xanh / Trà Mộc");
            System.out.println("2. Nhóm Trà Ô Long / Thanh Trà");
            System.out.println("3. Nhóm Bạch Trà & Hồng Trà");
            System.out.println("4. Nhóm Trà Phổ Nhĩ");
            System.out.println("5. Nhóm Trà Ướp Hương / Độc Bản VIP");
            System.out.print("Chọn nhóm trà muốn dùng (1-5): ");
            if (scanner.hasNextInt()) {
                group = scanner.nextInt();
                if (group >= 1 && group <= 5) break;
            } else {
                scanner.next();
            }
            System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 5!");
        }

        switch (group) {
            case 1: {
                int t1 = 0;
                while (true) {
                    System.out.println("\n-- 1. Nhóm Trà Xanh / Trà Mộc --");
                    System.out.println("1. Trà Shan Tuyết Cổ Thu - 180k/ấm");
                    System.out.println("2. Trà Tân Cương Thái Nguyên - 150k/ấm");
                    System.out.print("Chọn loại trà (1-2): ");
                    if (scanner.hasNextInt()) {
                        t1 = scanner.nextInt();
                        if (t1 >= 1 && t1 <= 2) break;
                    } else {
                        scanner.next();
                    }
                    System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 2!");
                }
                if (t1 == 1) return new Product(1, "Trà Shan Tuyết Cổ Thu", "Trà Xanh", 180000, "Ấm");
                else return new Product(2, "Trà Tân Cương TN", "Trà Xanh", 150000, "Ấm");
            }
            case 2: {
                int t2 = 0;
                while (true) {
                    System.out.println("\n-- 2. Nhóm Trà Ô Long / Thanh Trà --");
                    System.out.println("1. Ô Long Thúy Ngọc - 100k/ấm");
                    System.out.println("2. Ô Long Tứ Quý - 120k/ấm");
                    System.out.println("3. Thiết Quan Âm - 190k/ấm");
                    System.out.println("4. Đông Phương Mỹ Nhân - 300k/ấm");
                    System.out.println("5. Đại Hồng Bào - 350k/ấm");
                    System.out.print("Chọn loại trà (1-5): ");
                    if (scanner.hasNextInt()) {
                        t2 = scanner.nextInt();
                        if (t2 >= 1 && t2 <= 5) break;
                    } else {
                        scanner.next();
                    }
                    System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 5!");
                }
                if (t2 == 1) return new Product(3, "Ô Long Thúy Ngọc", "Ô Long", 100000, "Ấm");
                else if (t2 == 2) return new Product(4, "Ô Long Tứ Quý", "Ô Long", 120000, "Ấm");
                else if (t2 == 3) return new Product(5, "Thiết Quan Âm", "Ô Long", 190000, "Ấm");
                else if (t2 == 4) return new Product(6, "Đông Phương Mỹ Nhân", "Ô Long", 300000, "Ấm");
                else return new Product(7, "Đại Hồng Bào", "Ô Long", 350000, "Ấm");
            }
            case 3: {
                int t3 = 0;
                while (true) {
                    System.out.println("\n-- 3. Nhóm Bạch Trà & Hồng Trà --");
                    System.out.println("1. Bạch Trà Mây - 220k/ấm");
                    System.out.println("2. Bạch Muốt - 380k/ấm");
                    System.out.println("3. Hồng Trà Shan Tuyết - 180k/ấm");
                    System.out.println("4. Hồng Trà Cổ Thu - 200k/ấm");
                    System.out.print("Chọn loại trà (1-4): ");
                    if (scanner.hasNextInt()) {
                        t3 = scanner.nextInt();
                        if (t3 >= 1 && t3 <= 4) break;
                    } else {
                        scanner.next();
                    }
                    System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 4!");
                }
                if (t3 == 1) return new Product(8, "Bạch Trà Mây", "Bạch Trà", 220000, "Ấm");
                else if (t3 == 2) return new Product(9, "Bạch Muốt", "Bạch Trà", 380000, "Ấm");
                else if (t3 == 3) return new Product(10, "Hồng Trà Shan Tuyết", "Hồng Trà", 180000, "Ấm");
                else return new Product(11, "Hồng Trà Cổ Thu", "Hồng Trà", 200000, "Ấm");
            }
            case 4: {
                int t4 = 0;
                while (true) {
                    System.out.println("\n-- 4. Nhóm Trà Phổ Nhĩ --");
                    System.out.println("1. Phổ Nhĩ Chín - 200k/ấm");
                    System.out.println("2. Phổ Nhĩ Sống - 350k/ấm");
                    System.out.println("3. Phổ Nhĩ Quýt - 250k/ấm");
                    System.out.print("Chọn loại trà (1-3): ");
                    if (scanner.hasNextInt()) {
                        t4 = scanner.nextInt();
                        if (t4 >= 1 && t4 <= 3) break;
                    } else {
                        scanner.next();
                    }
                    System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 3!");
                }
                if (t4 == 1) return new Product(12, "Phổ Nhĩ Chín", "Phổ Nhĩ", 200000, "Ấm");
                else if (t4 == 2) return new Product(13, "Phổ Nhĩ Sống", "Phổ Nhĩ", 350000, "Ấm");
                else return new Product(14, "Phổ Nhĩ Quýt", "Phổ Nhĩ", 250000, "Ấm");
            }
            case 5: {
                int t5 = 0;
                while (true) {
                    System.out.println("\n-- 5. Nhóm Trà Ướp Hương / Độc Bản VIP --");
                    System.out.println("1. Bạch Trà Ướp Trầm - 500k/ấm");
                    System.out.println("2. Trà Sen Tây Hồ - 600k/ấm");
                    System.out.println("3. Trà Ướp Hoa Nhài/Cúc - 150k/ấm");
                    System.out.print("Chọn loại trà (1-3): ");
                    if (scanner.hasNextInt()) {
                        t5 = scanner.nextInt();
                        if (t5 >= 1 && t5 <= 3) break;
                    } else {
                        scanner.next();
                    }
                    System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 3!");
                }
                if (t5 == 1) return new Product(15, "Bạch Trà Ướp Trầm", "Ướp Hương", 500000, "Ấm");
                else if (t5 == 2) return new Product(16, "Trà Sen Tây Hồ", "Ướp Hương", 600000, "Ấm");
                else return new Product(17, "Trà Ướp Hoa Nhài/Cúc", "Ướp Hương", 150000, "Ấm");
            }
        }
        return null;
    }

    // Hàm chọn sản phẩm mang về
    public static Product chooseTakeawayTea(Scanner scanner) {
        int mainChoice = 0;
        while (true) {
            System.out.println("\n--- CHỌN HÌNH THỨC MANG VỀ ---");
            System.out.println("1. Mua Trà (Theo 100g)");
            System.out.println("2. Mua Trà Cụ & Phụ Kiện (Theo cái/bộ/chén)");
            System.out.print("Lựa chọn của bạn (1-2): ");
            if (scanner.hasNextInt()) {
                mainChoice = scanner.nextInt();
                if (mainChoice == 1 || mainChoice == 2) break;
            } else {
                scanner.next();
            }
            System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn 1 hoặc 2!");
        }

        if (mainChoice == 1) {
            int tGroup = 0;
            while (true) {
                System.out.println("\n--- CHỌN NHÓM TRÀ MANG VỀ (100G) ---");
                System.out.println("1. Nhóm Trà Xanh / Trà Mộc");
                System.out.println("2. Nhóm Trà Ô Long / Thanh Trà");
                System.out.println("3. Nhóm Bạch Trà & Hồng Trà");
                System.out.println("4. Nhóm Trà Phổ Nhĩ");
                System.out.println("5. Nhóm Trà Ướp Hương / Độc Bản VIP");
                System.out.print("Chọn nhóm trà (1-5): ");
                if (scanner.hasNextInt()) {
                    tGroup = scanner.nextInt();
                    if (tGroup >= 1 && tGroup <= 5) break;
                } else {
                    scanner.next();
                }
                System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 5!");
            }

            switch (tGroup) {
                case 1: {
                    int t1 = 0;
                    while (true) {
                        System.out.println("\n-- 1. Trà Xanh Mang Về --");
                        System.out.println("1. Trà Shan Tuyết Cổ Thu - 250k/100g");
                        System.out.println("2. Trà Tân Cương Thái Nguyên - 180k/100g");
                        System.out.print("Chọn loại (1-2): ");
                        if (scanner.hasNextInt()) {
                            t1 = scanner.nextInt();
                            if (t1 >= 1 && t1 <= 2) break;
                        } else {
                            scanner.next();
                        }
                        System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 2!");
                    }
                    if (t1 == 1) return new Product(101, "Trà Shan Tuyết (100g)", "Trà Xanh", 250000, "100g");
                    else return new Product(102, "Trà Tân Cương (100g)", "Trà Xanh", 180000, "100g");
                }
                case 2: {
                    int t2 = 0;
                    while (true) {
                        System.out.println("\n-- 2. Trà Ô Long Mang Về --");
                        System.out.println("1. Ô Long Thúy Ngọc - 120k/100g");
                        System.out.println("2. Ô Long Tứ Quý - 130k/100g");
                        System.out.println("3. Thiết Quan Âm - 200k/100g");
                        System.out.println("4. Đông Phương Mỹ Nhân - 350k/100g");
                        System.out.println("5. Đại Hồng Bào - 400k/100g");
                        System.out.print("Chọn loại (1-5): ");
                        if (scanner.hasNextInt()) {
                            t2 = scanner.nextInt();
                            if (t2 >= 1 && t2 <= 5) break;
                        } else {
                            scanner.next();
                        }
                        System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 5!");
                    }
                    if (t2 == 1) return new Product(103, "Ô Long Thúy Ngọc (100g)", "Ô Long", 120000, "100g");
                    else if (t2 == 2) return new Product(104, "Ô Long Tứ Quý (100g)", "Ô Long", 130000, "100g");
                    else if (t2 == 3) return new Product(105, "Thiết Quan Âm (100g)", "Ô Long", 200000, "100g");
                    else if (t2 == 4) return new Product(106, "Đông Phương Mỹ Nhân (100g)", "Ô Long", 350000, "100g");
                    else return new Product(107, "Đại Hồng Bào (100g)", "Ô Long", 400000, "100g");
                }
                case 3: {
                    int t3 = 0;
                    while (true) {
                        System.out.println("\n-- 3. Bạch Trà & Hồng Trà Mang Về --");
                        System.out.println("1. Bạch Trà Mây - 280k/100g");
                        System.out.println("2. Bạch Muốt - 450k/100g");
                        System.out.println("3. Hồng Trà Shan Tuyết - 220k/100g");
                        System.out.println("4. Hồng Trà Cổ Thu - 240k/100g");
                        System.out.print("Chọn loại (1-4): ");
                        if (scanner.hasNextInt()) {
                            t3 = scanner.nextInt();
                            if (t3 >= 1 && t3 <= 4) break;
                        } else {
                            scanner.next();
                        }
                        System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 4!");
                    }
                    if (t3 == 1) return new Product(108, "Bạch Trà Mây (100g)", "Bạch Trà", 280000, "100g");
                    else if (t3 == 2) return new Product(109, "Bạch Muốt (100g)", "Bạch Trà", 450000, "100g");
                    else if (t3 == 3) return new Product(110, "Hồng Trà Shan Tuyết (100g)", "Hồng Trà", 220000, "100g");
                    else return new Product(111, "Hồng Trà Cổ Thu (100g)", "Hồng Trà", 240000, "100g");
                }
                case 4: {
                    int t4 = 0;
                    while (true) {
                        System.out.println("\n-- 4. Trà Phổ Nhĩ Mang Về --");
                        System.out.println("1. Phổ Nhĩ Chín - 250k/100g");
                        System.out.println("2. Phổ Nhĩ Sống - 380k/100g");
                        System.out.println("3. Phổ Nhĩ Quýt - 300k/100g");
                        System.out.print("Chọn loại (1-3): ");
                        if (scanner.hasNextInt()) {
                            t4 = scanner.nextInt();
                            if (t4 >= 1 && t4 <= 3) break;
                        } else {
                            scanner.next();
                        }
                        System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 3!");
                    }
                    if (t4 == 1) return new Product(112, "Phổ Nhĩ Chín (100g)", "Phổ Nhĩ", 250000, "100g");
                    else if (t4 == 2) return new Product(113, "Phổ Nhĩ Sống (100g)", "Phổ Nhĩ", 380000, "100g");
                    else return new Product(114, "Phổ Nhĩ Quýt (100g)", "Phổ Nhĩ", 300000, "100g");
                }
                case 5: {
                    int t5 = 0;
                    while (true) {
                        System.out.println("\n-- 5. Trà Ướp Hương Mang Về --");
                        System.out.println("1. Bạch Trà Ướp Trầm - 600k/100g");
                        System.out.println("2. Trà Sen Tây Hồ - 800k/100g");
                        System.out.println("3. Trà Ướp Hoa Nhài/Cúc - 250k/100g");
                        System.out.print("Chọn loại (1-3): ");
                        if (scanner.hasNextInt()) {
                            t5 = scanner.nextInt();
                            if (t5 >= 1 && t5 <= 3) break;
                        } else {
                            scanner.next();
                        }
                        System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 3!");
                    }
                    if (t5 == 1) return new Product(115, "Bạch Trà Ướp Trầm (100g)", "Ướp Hương", 600000, "100g");
                    else if (t5 == 2) return new Product(116, "Trà Sen Tây Hồ (100g)", "Ướp Hương", 800000, "100g");
                    else return new Product(117, "Trà Ướp Hoa Nhài/Cúc (100g)", "Ướp Hương", 250000, "100g");
                }
            }
        } else {
            int toolGroup = 0;
            while (true) {
                System.out.println("\n--- CHỌN NHÓM TRÀ CỤ MANG VỀ ---");
                System.out.println("1. Các bộ dụng cụ pha trà chính (Ấm Tử Sa, Ấm Sứ, Khải, Tống...)");
                System.out.println("2. Chén thưởng trà / Chén quân (Chén lẻ, Bộ 6 chén...)");
                System.out.println("3. Phụ kiện và trà cụ hỗ trợ (Khay trà, Bếp mini, Lọc...)");
                System.out.print("Chọn nhóm trà cụ (1-3): ");
                if (scanner.hasNextInt()) {
                    toolGroup = scanner.nextInt();
                    if (toolGroup >= 1 && toolGroup <= 3) break;
                } else {
                    scanner.next();
                }
                System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 3!");
            }

            switch (toolGroup) {
                case 1: {
                    int tool1 = 0;
                    while (true) {
                        System.out.println("\n-- CÁC BỘ DỤNG CỤ PHA TRÀ CHÍNH --");
                        System.out.println("1. Ấm Tử Sa - 850,000 VNĐ / cái");
                        System.out.println("2. Ấm Sứ - 350,000 VNĐ / cái");
                        System.out.println("3. Bộ Khải (Gaiwan) - 250,000 VNĐ / bộ");
                        System.out.println("4. Tống trà - 120,000 VNĐ / cái");
                        System.out.print("Chọn dụng cụ (1-4): ");
                        if (scanner.hasNextInt()) {
                            tool1 = scanner.nextInt();
                            if (tool1 >= 1 && tool1 <= 4) break;
                        } else {
                            scanner.next();
                        }
                        System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 4!");
                    }
                    if (tool1 == 1) return new Product(201, "Ấm Tử Sa", "Trà Cụ", 850000, "Cái");
                    else if (tool1 == 2) return new Product(202, "Ấm Sứ", "Trà Cụ", 350000, "Cái");
                    else if (tool1 == 3) return new Product(203, "Bộ Khải (Gaiwan)", "Trà Cụ", 250000, "Bộ");
                    else return new Product(204, "Tống trà", "Trà Cụ", 120000, "Cái");
                }
                case 2: {
                    int tool2 = 0;
                    while (true) {
                        System.out.println("\n-- CHÉN THƯỞNG TRÀ (CHÉN QUÂN) --");
                        System.out.println("1. Chén lẻ - 45,000 VNĐ / chén");
                        System.out.println("2. Bộ 6 Chén quân - 250,000 VNĐ / bộ");
                        System.out.print("Chọn loại chén (1-2): ");
                        if (scanner.hasNextInt()) {
                            tool2 = scanner.nextInt();
                            if (tool2 >= 1 && tool2 <= 2) break;
                        } else {
                            scanner.next();
                        }
                        System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 2!");
                    }
                    if (tool2 == 1) return new Product(205, "Chén lẻ thưởng trà", "Trà Cụ", 45000, "Chén");
                    else return new Product(206, "Bộ 6 Chén quân", "Trà Cụ", 250000, "Bộ");
                }
                case 3: {
                    int tool3 = 0;
                    while (true) {
                        System.out.println("\n-- PHỤ KIỆN VÀ TRÀ CỤ HỖ TRỢ --");
                        System.out.println("1. Khay trà - 450,000 VNĐ / cái");
                        System.out.println("2. Bếp pha trà mini - 750,000 VNĐ / cái");
                        System.out.println("3. Trà đạo lục quân - 150,000 VNĐ / bộ");
                        System.out.println("4. Hũ đựng trà - 120,000 VNĐ / cái");
                        System.out.println("5. Lọc trà - 75,000 VNĐ / cái");
                        System.out.print("Chọn phụ kiện (1-5): ");
                        if (scanner.hasNextInt()) {
                            tool3 = scanner.nextInt();
                            if (tool3 >= 1 && tool3 <= 5) break;
                        } else {
                            scanner.next();
                        }
                        System.out.println("-> Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 5!");
                    }
                    if (tool3 == 1) return new Product(207, "Khay trà", "Trà Cụ", 450000, "Cái");
                    else if (tool3 == 2) return new Product(208, "Bếp pha trà mini", "Trà Cụ", 750000, "Cái");
                    else if (tool3 == 3) return new Product(209, "Trà đạo lục quân", "Trà Cụ", 150000, "Bộ");
                    else if (tool3 == 4) return new Product(210, "Hũ đựng trà", "Trà Cụ", 120000, "Cái");
                    else return new Product(211, "Lọc trà", "Trà Cụ", 75000, "Cái");
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PHẦN MỀM QUẢN LÝ TRÀ QUÁN ===");
        int mainChoice = 0;
        while (true) {
            System.out.println("Nhập lựa chọn của khách:");
            System.out.println("1. Dùng ở lại");
            System.out.println("2. Mang về (Trà & Trà cụ)");
            System.out.println("3. Cả hai (Dùng ở lại & Mua mang về tính chung 1 bill)");
            System.out.print("Lựa chọn của bạn (1-3): ");
            if (scanner.hasNextInt()) {
                mainChoice = scanner.nextInt();
                if (mainChoice >= 1 && mainChoice <= 3) break;
            } else {
                scanner.next();
            }
            System.out.println("-> Lựa chọn không hợp lệ, vui lòng nhập từ 1 đến 3!");
        }

        Room selectedRoom = null;
        String serviceStr = "";

        if (mainChoice == 1 || mainChoice == 3) {
            serviceStr = (mainChoice == 1) ? "Dùng ở lại" : "Dùng ở lại & Mua mang về";
            int roomType = 0;
            while (true) {
                System.out.println("\n--- A. CHỌN PHÒNG ---");
                System.out.println("1. Phòng Tiêu Chuẩn (500,000 VNĐ)");
                System.out.println("2. Phòng Ấm Cúng (1,000,000 VNĐ)");
                System.out.println("3. Phòng Sang Trọng (1,500,000 VNĐ)");
                System.out.println("4. Phòng VIP (2,000,000 VNĐ)");
                System.out.print("Chọn loại phòng (1-4): ");
                if (scanner.hasNextInt()) {
                    roomType = scanner.nextInt();
                    if (roomType >= 1 && roomType <= 4) break;
                } else {
                    scanner.next();
                }
                System.out.println("-> Lựa chọn phòng không hợp lệ, vui lòng chọn từ 1 đến 4!");
            }

            int roomQty = 0;
            while (true) {
                System.out.print("Nhập số phòng muốn dùng: ");
                if (scanner.hasNextInt()) {
                    roomQty = scanner.nextInt();
                    if (roomQty > 0) break;
                    System.out.println("-> Số lượng phòng phải lớn hơn 0!");
                } else {
                    scanner.next();
                    System.out.println("-> Vui lòng nhập vào một số nguyên hợp lệ!");
                }
            }

            double roomPrice = 0;
            String roomName = "";
            if (roomType == 1) { roomName = "Phòng Tiêu Chuẩn"; roomPrice = 500000; }
            else if (roomType == 2) { roomName = "Phòng Ấm Cúng"; roomPrice = 1000000; }
            else if (roomType == 3) { roomName = "Phòng Sang Trọng"; roomPrice = 1500000; }
            else if (roomType == 4) { roomName = "Phòng VIP"; roomPrice = 2000000; }

            selectedRoom = new Room(roomName, roomPrice, roomQty);
        } else {
            serviceStr = "Mang về";
        }

        Order order = new Order(selectedRoom, serviceStr);

        // Phần gọi trà tại chỗ
        if (mainChoice == 1 || mainChoice == 3) {
            boolean addingDineIn = true;
            while (addingDineIn) {
                Product p = chooseDineInTea(scanner);
                if (p != null) {
                    int qty = 0;
                    while (true) {
                        System.out.print("Nhập số lượng ấm: ");
                        if (scanner.hasNextInt()) {
                            qty = scanner.nextInt();
                            if (qty > 0) break;
                            System.out.println("-> Số lượng ấm phải lớn hơn 0!");
                        } else {
                            scanner.next();
                            System.out.println("-> Vui lòng nhập vào một số nguyên hợp lệ!");
                        }
                    }
                    order.addItem(new OrderItem(p, qty, false));
                    System.out.println("-> Đã thêm trà tại chỗ thành công!");
                }
                
                while (true) {
                    System.out.print("Khách có muốn gọi thêm trà tại chỗ nữa không? (1. Có / 2. Không): ");
                    if (scanner.hasNextInt()) {
                        int c = scanner.nextInt();
                        if (c == 2) {
                            addingDineIn = false;
                            break;
                        } else if (c == 1) {
                            break;
                        }
                    } else {
                        scanner.next();
                    }
                    System.out.println("-> Lựa chọn không hợp lệ! Vui lòng chỉ nhập 1 (Có) hoặc 2 (Không).");
                }
            }
        }

        // Phần mua mang về (Trà hoặc Trà cụ)
        if (mainChoice == 2 || mainChoice == 3) {
            if (mainChoice == 2) serviceStr = "Mang về";
            boolean addingTakeAway = true;
            while (addingTakeAway) {
                Product p = chooseTakeawayTea(scanner);
                if (p != null) {
                    int qty = 0;
                    while (true) {
                        System.out.print("Nhập số lượng (100g hoặc số lượng cái/bộ/chén): ");
                        if (scanner.hasNextInt()) {
                            qty = scanner.nextInt();
                            if (qty > 0) break;
                            System.out.println("-> Số lượng phải lớn hơn 0!");
                        } else {
                            scanner.next();
                            System.out.println("-> Vui lòng nhập vào một số nguyên hợp lệ!");
                        }
                    }
                    order.addItem(new OrderItem(p, qty, true));
                    System.out.println("-> Đã thêm sản phẩm mang về thành công!");
                }
                
                while (true) {
                    System.out.print("Khách có muốn mua thêm sản phẩm mang về nữa không? (1. Có / 2. Không): ");
                    if (scanner.hasNextInt()) {
                        int c = scanner.nextInt();
                        if (c == 2) {
                            addingTakeAway = false;
                            break;
                        } else if (c == 1) {
                            break;
                        }
                    } else {
                        scanner.next();
                    }
                    System.out.println("-> Lựa chọn không hợp lệ! Vui lòng chỉ nhập 1 (Có) hoặc 2 (Không).");
                }
            }
        }

        order.printBill();
        scanner.close();
    }
}