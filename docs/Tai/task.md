# TAI'S TASK - AI & Infrastructure

## 1. Core Infrastructure (Thiết lập nền móng)
- [ ] Khởi tạo Project Android với Jetpack Compose.
- [ ] Cấu trúc thư mục theo Clean Architecture: `data`, `domain`, `presentation`.
- [ ] Cấu hình Dependency Injection với Hilt.
- [ ] Thiết lập Retrofit Client và OkHttp cho các API bên ngoài.
- [ ] Cấu hình Room Database (các Entity cơ bản từ requirements).

## 2. Gemini AI Integration (Trái tim của ứng dụng)
- [ ] Đăng ký API Key và thiết lập trong `local.properties` (Bảo mật).
- [ ] Viết `GeminiService` để giao tiếp với các model Gemini 3.0/3.1.
- [ ] Xây dựng System Prompts chuẩn cho việc học tập.
- [ ] Triển khai Module 05: **AI Study Chatbot** (Giao diện Chat, lưu lịch sử).

## 3. Google Services & AI Utils
- [ ] Tích hợp Google SDK để đồng bộ Google Calendar.
- [ ] Viết `AIService` cung cấp hàm:
    - `generateFlashcards(text: String)`: Trả về list Flashcard.
    - `suggestSchedule(tasks: List<Task>)`: Trả về lịch học tối ưu.

---
*Cập nhật lần cuối: 2026-04-01*