# LapXpert

## 📌 Tổng Quan
LapXpert là một ứng dụng web thương mại điện tử chuyên bán laptop. Dự án được thiết kế để đảm bảo tốc độ, khả năng mở rộng và dễ bảo trì, sử dụng các công nghệ hiện đại trong cả phát triển backend và frontend.

## 🛠 Công Nghệ Sử Dụng

### **Backend (Spring Boot)**
- **Spring Boot + GraphQL** - Phát triển API RESTful
- **Spring Security + JWT** - Xác thực & bảo mật
- **Spring Data JPA + Hibernate** - Tương tác với cơ sở dữ liệu
- **PostgreSQL** - Cơ sở dữ liệu chính
- **Redis (Tuỳ chọn)** - Caching để tối ưu hiệu suất
- **Cloud Storage (Cloudinary/AWS S3)** - Lưu trữ ảnh sản phẩm

### **Frontend (Vue 3 + Vite)**
- **Vue 3 + Vite** - Phát triển UI nhanh, hiện đại
- **Pinia** - Quản lý state
- **Vue Router** - Điều hướng trang
- **Axios** - Gọi API
- **Tailwind CSS (hoặc Vuetify)** - Thiết kế UI đẹp

### **DevOps & Triển Khai**
- **Docker** - Đóng gói backend
- **Nginx / Caddy** - Reverse proxy cho frontend & backend
- **CI/CD (GitHub Actions/GitLab CI)** - Tự động hoá triển khai
- **Cloud Hosting (Render/VPS/Hetzner/AWS)** - Chạy backend
- **Vercel/Netlify** - Deploy frontend

### **Tuỳ Chọn Mở Rộng**
- **Thanh toán online**? (Stripe, VNPay, Momo...)
- **WebSockets hoặc SSE**? (Nếu cần thông báo real-time)
- **Logging & Monitoring**? (Prometheus, Grafana, ELK Stack)
- **SEO & Hiệu suất**? (Nuxt.js nếu cần SSR, hoặc Vue SEO plugins)

## 📂 Cấu Trúc Dự Án

### **Backend (Spring Boot - Gradle Modular Monolithic)**
```
lapxpert-backend/
│── build.gradle  (Gradle chính)
│── settings.gradle (Khai báo danh sách module)
│
├── modules/
│   ├── users/
│   │   ├── build.gradle
│   │   ├── src/main/java/com/lapxpert/users/
│   │   ├── src/main/resources/graphql/ (Chứa schema GraphQL)
│   │   ├── src/main/resources/application.properties
│   │
│   ├── products/
│   │   ├── build.gradle
│   │   ├── src/main/java/com/lapxpert/products/
│   │   ├── src/main/resources/graphql/
│   │   ├── src/main/resources/application.properties
│   │
│   ├── orders/
│   │   ├── build.gradle
│   │   ├── src/main/java/com/lapxpert/orders/
│   │   ├── src/main/resources/graphql/
│   │   ├── src/main/resources/application.properties
│   │
│   ├── payments/
│   │   ├── build.gradle
│   │   ├── src/main/java/com/lapxpert/payments/
│   │   ├── src/main/resources/graphql/
│   │   ├── src/main/resources/application.properties
│
├── common/
│   ├── build.gradle  (Chứa các class dùng chung như DTO, Exception)
│   ├── src/main/java/com/lapxpert/common/
│
└── application/
    ├── build.gradle  (Module chính, chạy Spring Boot)
    ├── src/main/java/com/lapxpert/application/
    ├── src/main/resources/
```

### **Frontend (Vue 3 + Vite)**
```
frontend/
├── src/
│   ├── assets/        # Static assets (icons, logos, etc.)
│   ├── components/    # Reusable Vue components
│   ├── pages/         # Views cho từng route
│   ├── router/        # Cấu hình Vue Router
│   ├── store/         # Pinia store (quản lý state)
│   ├── utils/         # Hàm helper
│   ├── App.vue        # Main Vue app component
│   ├── main.js        # Application entry point
├── public/
│   ├── index.html     # Root HTML file
├── package.json       # Project dependencies
├── vite.config.js     # Cấu hình Vite
```

## 🏛 Kiến Trúc Dự Án
LapXpert sử dụng kiến trúc **Modular Monolithic**, chia backend thành các module riêng biệt trong cùng một project, giúp dễ dàng bảo trì và mở rộng. 

- **Backend**: Spring Boot với Gradle, chia thành các module (users, products, orders, payments...)
- **Frontend**: Vue 3 + Vite, SPA hiện đại
- **Database**: PostgreSQL, lưu trữ dữ liệu tập trung
- **Lưu trữ ảnh**: Cloud Storage (Cloudinary, AWS S3...)
- **Triển khai**: Docker, CI/CD, hosting trên VPS hoặc cloud

## 🚀 Hướng Dẫn Triển Khai

### **Triển Khai Backend**
1. Build và chạy Spring Boot:
   ```sh
   ./gradlew build
   java -jar application/build/libs/lapxpert-0.0.1-SNAPSHOT.jar
   ```
2. Hoặc chạy bằng Docker:
   ```sh
   docker build -t lapxpert-backend .
   docker run -p 8080:8080 lapxpert-backend
   ```

### **Triển Khai Frontend**
1. Cài đặt dependencies và chạy local:
   ```sh
   cd frontend
   npm install
   npm run dev
   ```
2. Build cho production:
   ```sh
   npm run build
   ```
3. Deploy lên Vercel/Netlify:
   ```sh
   vercel --prod  # Nếu dùng Vercel
   ```

## 📌 Kết Luận
LapXpert là một nền tảng thương mại điện tử có kiến trúc rõ ràng, hiện đại và dễ mở rộng. Các công nghệ được chọn giúp cân bằng giữa hiệu suất, bảo mật và khả năng bảo trì. Trong tương lai, có thể mở rộng thêm WebSockets/SSE để hỗ trợ thông báo real-time, tích hợp cổng thanh toán, và tối ưu SEO với SSR.

# 📌 Chi tiết dự án
## ERD
- [Draw.io](https://drive.google.com/file/d/1sZ6hDHrX0rYvk3Z9J72mfrLQJxkR1QLv/view)
