# Smart Study Assistant (SSA) 🚀

**Smart Study Assistant (SSA)** là ứng dụng Android hiện đại, trợ lý học tập thông minh được xây dựng trên nền tảng Kotlin, Jetpack Compose và AI (Gemini). Dự án giúp sinh viên tối ưu hóa việc học thông qua thuật toán lặp lại ngắt quãng (Spaced Repetition), quản lý thời gian (Pomodoro) và cá nhân hóa lộ trình học tập.

## 🛠 Công Nghệ Sử Dụng

- **Ngôn ngữ:** Kotlin (Coroutines, Flow)
- **UI Framework:** Jetpack Compose + Material Design 3
- **Kiến trúc:** Clean Architecture (Domain, Data, Presentation) + MVVM
- **Dependency Injection:** Hilt
- **Local Database:** Room Database
- **Networking:** Retrofit + OkHttp
- **AI Integration:** Google Gemini SDK (Model 3.1 Flash)
- **Tính năng trọng tâm:** Offline-first, Gamification, AI Study Chatbot.

## 📁 Cấu Trúc Dự Án (Clean Architecture)

```text
app/src/main/java/com/dangminhtai/ssa/
├── data/           # Repository implementations, DAO, API Services, Mappers
├── domain/         # Use Cases, Repository Interfaces, Models
└── presentation/   # ViewModels, UI Screens (Compose), Themes
```

## 🚀 Hướng Dẫn Cài Đặt

1. **Clone dự án:**
   ```bash
   git clone https://github.com/dangminhtai/SmartStudyAssistant.git
   ```
2. **Cấu hình API Key:**
   - Tạo file `local.properties` tại thư mục gốc.
   - Thêm dòng: `GEMINI_API_KEY=YOUR_API_KEY_HERE`.
3. **Build & Run:** Mở dự án bằng Android Studio (Ladybug trở lên) và nhấn Run.

## 👥 Nhóm Phát Triển

- **Anh Tai (@Tai):** AI Chatbot & Core Infrastructure.
- **Duy (@Duy):** Dashboard & Task Management.
- **Bảo (@Bao):** Flashcards, Pomodoro & Gamification.

---
*Dự án đang trong quá trình phát triển tích cực.*
