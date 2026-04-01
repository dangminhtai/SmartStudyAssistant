# BƯỚC TIẾP THEO (NEXT STEPS)

Dưới đây là các đề xuất cải thiện và phát triển tiếp theo cho dự án **Smart Study Assistant**.

## 1. Cho Anh Tai (@Tai) - AI Chatbot & Core
- [ ] Xây dựng `AIHistoryRepository` để quản lý việc lưu/tải lịch sử chat từ Room.
- [ ] Thiết kế `GeminiUseCase` để xử lý logic prompt (ví dụ: thêm system prompt "Bạn là một trợ lý học tập thông minh...").
- [ ] Triển khai giao diện Chat cơ bản với Jetpack Compose (Streaming UI).

## 2. Cho Duy (@Duy) - Dashboard & Task
- [ ] Thiết kế UI cho `GreetingCard` động trên Dashboard.
- [ ] Xây dựng màn hình danh sách Task sử dụng `TaskDao` đã có.
- [ ] Áp dụng ma trận Eisenhower để phân loại mức độ ưu tiên của Task.

## 3. Cho Bảo (@Bao) - Flashcards & Focus
- [ ] Cài đặt thuật toán SM-2+ trong `FlashcardUseCase` để tính toán ngày ôn tập tiếp theo.
- [ ] Xây dựng `ForegroundService` cho Pomodoro Timer để đảm bảo ứng dụng không bị kill khi chạy ngầm.

## 4. Cải tiến hạ tầng
- [ ] Bổ sung `WorkManager` để tự động đồng bộ dữ liệu lên Firebase (Offline-first).
- [ ] Thiết lập `DataStore` để lưu cấu hình ứng dụng (Dark mode, Cài đặt Pomodoro).

---
*Cập nhật lần cuối: 2026-04-01*
