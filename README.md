# LapXpert

## 📌 Tổng Quan
LapXpert là một ứng dụng web thương mại điện tử chuyên bán laptop. Dự án được thiết kế để đảm bảo tốc độ, khả năng mở rộng và dễ bảo trì, sử dụng các công nghệ hiện đại trong cả phát triển backend và frontend.

## 🛠 Công Nghệ Sử Dụng

### **Backend (Spring Boot)**
- **Spring Boot ** - Phát triển API RESTful
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

## 📌 Bảng so sánh công nghệ trong dự án LapXpert

| **Yếu tố**           | **Công nghệ đã chọn** | **Lựa chọn thay thế** | **Lý do chọn** |
|----------------------|----------------------|----------------------|----------------|
| **Backend Framework** | Spring Boot (Java)  | Express.js (Node.js), Django (Python) | **Spring Boot mạnh mẽ, dễ mở rộng**, hỗ trợ Modular Monolithic tốt. Java cũng phù hợp với môi trường doanh nghiệp. |
| **API Design** | GraphQL | REST API | **GraphQL linh hoạt hơn REST**, giúp **frontend lấy đúng dữ liệu cần thiết**, giảm số request API, tối ưu hiệu suất. |
| **Frontend Framework** | Vue 3 + Vite | React, Angular | Vue 3 có **hiệu suất cao, dễ học, dễ thiết kế giao diện**, Vite giúp build nhanh hơn Webpack. |
| **Database** | PostgreSQL | MySQL, MongoDB | PostgreSQL có **hiệu suất tốt**, hỗ trợ **JSON, full-text search**, mạnh về giao dịch. |
| **Lưu trữ ảnh** | Cloud Storage (AWS S3, Cloudinary) | Lưu trong PostgreSQL, Local Storage | **Lưu ảnh trong DB làm chậm truy vấn**. Cloud Storage giúp **tải nhanh, tối ưu chi phí, dễ mở rộng**. |
| **Authentication** | JWT (JSON Web Token) | Session-based, OAuth2 | JWT **nhẹ, nhanh, stateless**, phù hợp với API-first architecture. |
| **Thanh toán** | Stripe, VNPay, Momo | Chuyển khoản ngân hàng, COD | Stripe và VNPay hỗ trợ **giao dịch nhanh, bảo mật cao, phổ biến**. |
| **Real-time Updates** | WebSockets / SSE | Polling API | **WebSockets & SSE cập nhật dữ liệu ngay lập tức**, polling gây **tốn tài nguyên server**. |
| **Logging & Monitoring** | ELK Stack (Elasticsearch, Logstash, Kibana) | Chỉ log file truyền thống | ELK Stack giúp **giám sát hệ thống real-time, dễ phân tích log**. |
| **SEO & Hiệu suất** | Vue SEO Plugins (hoặc Nuxt.js) | Không dùng SSR | Nếu cần SEO tốt, Nuxt.js hỗ trợ **Server-Side Rendering (SSR)**, còn Vue SEO Plugins giúp tối ưu thẻ meta. |
| **Deployment** | Docker + Kubernetes | Chạy trực tiếp trên server | Docker giúp **môi trường nhất quán**, dễ **scale với Kubernetes** nếu cần. |
| **CI/CD** | GitHub Actions | Jenkins, GitLab CI/CD | GitHub Actions **tích hợp sẵn trên GitHub**, dễ dùng, mạnh mẽ. |

---

### **🔥 Tại sao chọn GraphQL thay vì REST API?**

| **Tiêu chí**      | **GraphQL** | **REST API** |
|------------------|------------|-------------|
| **Dữ liệu trả về** | Chỉ trả về đúng dữ liệu cần thiết | Trả về toàn bộ response (có thể thừa dữ liệu) |
| **Số request API** | Một request có thể lấy nhiều dữ liệu khác nhau | Phải gọi nhiều API để lấy đủ dữ liệu |
| **Performance** | Tối ưu hơn khi cần query dữ liệu phức tạp | Có thể gây tốn băng thông do dữ liệu thừa |
| **Tính linh hoạt** | Frontend tự định nghĩa dữ liệu cần lấy | Backend phải fix cứng response của API |
| **Caching** | Khó caching hơn do query động | Dễ caching hơn (RESTful endpoints cố định) |
| **Học và triển khai** | Cần học cách viết schema, resolver | Dễ triển khai hơn (chỉ cần định nghĩa routes) |

### **👉 Tóm lại:**
- **Dùng GraphQL giúp tối ưu performance, giảm request API không cần thiết.**  
- **Nhưng nếu API đơn giản, REST có thể dễ triển khai hơn.**  
- **Với dự án LapXpert (e-commerce), GraphQL giúp frontend lấy dữ liệu nhanh hơn mà không cần nhiều API.**  

---

## 📂 Cấu Trúc Dự Án

### **Backend (Spring Boot - Gradle Modular Monolithic + DDD)**
```
LapXpert/
│── build.gradle  (Gradle chính)
│── settings.gradle (Khai báo danh sách module)
│
├── src/main/java/com/lapxpert/
│   ├── hoadon/  (Module Hoá đơn - Tách theo domain)
│   │   ├── application/  (Lớp Application - Entry Point API)
│   │   │   ├── controller/  (REST + GraphQL Adapter)
│   │   │   ├── graphql/  (Schema GraphQL)
│   │   │   ├── dto/  (Data Transfer Objects)
│   │   │   ├── exception/  (Exception riêng)
│   │   │   ├── event/  (Domain Events - Kafka)
│   │   │   ├── security/  (JWT, OAuth, Spring Security)
│   │   │   ├── config/  (Cấu hình CORS, Security)
│   │
│   │   ├── domain/  (Lớp Business Logic - Không phụ thuộc Spring)
│   │   │   ├── entity/  (JPA Entities / Aggregate Roots)
│   │   │   ├── service/  (Business Logic - Application Service)
│   │   │   ├── repository/  (Chỉ chứa Interface)
│   │
│   │   ├── infrastructure/  (Lớp Infrastructure - Công nghệ)
│   │   │   ├── persistence/  (PostgreSQL Repository Implementations)
│   │   │   │   ├── HoaDonJpaRepository.java  (Implement repository interface)
│   │   │   │   ├── HoaDonJpaMapper.java  (Chuyển đổi Entity <-> DTO)
│   │   │   │   ├── persistence-config.properties  (Config DB)
│   │   │   ├── messaging/  (Kafka / RabbitMQ Implementations)
│   │   │   │   ├── HoaDonKafkaProducer.java  (Gửi event)
│   │   │   │   ├── HoaDonKafkaConsumer.java  (Nhận event)
│   │   │   │   ├── kafka-config.properties  (Config Kafka)
│   │   │   ├── cache/  (Redis Implementations)
│   │   │   │   ├── HoaDonRedisRepository.java  (Lưu cache hoadon)
│   │   │   │   ├── redis-config.properties  (Config Redis)
│
│   ├── products/  (Module Sản phẩm - Tương tự hoadon)
│   │   ├── application/
│   │   ├── domain/
│   │   ├── infrastructure/
│
│   ├── users/  (Module Người dùng - Tương tự hoadon)
│   │   ├── application/
│   │   ├── domain/
│   │   ├── infrastructure/
│
│   ├── common/  (Chứa các class dùng chung giữa các module)
│   │   ├── exception/  (Global Exception Handler)
│   │   ├── security/  (JWT, OAuth)
│   │   ├── dto/  (DTO dùng chung)
│   │   ├── util/  (Helper functions)
│
├── src/main/resources/
│   ├── application.yml  (Cấu hình Spring Boot)
│   ├── graphql/  (Schema GraphQL)
│   ├── sql/  (Scripts khởi tạo Database)
│
├── src/test/java/com/lapxpert/
│   ├── hoadon/
│   │   ├── HoaDonServiceTest.java  (Unit Test)
│   │   ├── HoaDonIntegrationTest.java  (Integration Test)
│
└── docker-compose.yml  (Chạy PostgreSQL, Redis, Kafka bằng Docker)
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
