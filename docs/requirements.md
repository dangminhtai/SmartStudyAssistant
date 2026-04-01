

# BẢNG ĐẶC TẢ YÊU CẦU DỰ ÁN (REQUIREMENTS SPECIFICATION)
**Tên dự án:** Smart Study Assistant (SSA)
**Nền tảng:** Android (Native)
**Năm:** 2025

---

## 1. TỔNG QUAN DỰ ÁN (PROJECT OVERVIEW)
**Smart Study Assistant (SSA)** là một ứng dụng Android toàn diện kết hợp trí tuệ nhân tạo (AI), khoa học nhận thức và thiết kế UX hiện đại nhằm cá nhân hóa trải nghiệm học tập, giải quyết tình trạng thiếu phương pháp học tập hiệu quả, khó khăn trong quản lý thời gian và mất tập trung của học sinh/sinh viên.

*   **Tầm nhìn:** Trở thành người bạn đồng hành học tập đáng tin cậy nhất cho sinh viên Việt Nam.
*   **Sứ mệnh:** Cung cấp hệ sinh thái học tập thông minh, gamified, giúp học nhanh hơn 3x, nhớ lâu hơn 5x nhờ Spaced Repetition và AI.

### Các vấn đề cốt lõi cần giải quyết (Pain points)
- [x] Khó khăn tổ chức lịch học & deadline.
- [x] Thiếu phương pháp ôn tập khoa học.
- [x] Mất tập trung khi tự học (điện thoại, MXH).
- [x] Không theo dõi được tiến độ học tập.
- [x] Flashcard & ghi chú không được tổ chức tốt.
- [x] Thiếu động lực duy trì thói quen học tập.

---

## 2. YÊU CẦU CHỨC NĂNG (FUNCTIONAL REQUIREMENTS)

Dự án bao gồm 6 module chính, có thể phát triển và deploy độc lập:

### Module 01: Smart Dashboard (Mức độ ưu tiên: P0 - Critical)
*Trung tâm điều khiển tổng hợp dữ liệu thời gian thực.*
- [ ] **Greeting card động:** Chào người dùng theo tên, thời gian, thời tiết.
- [ ] **Today's Focus:** Hiển thị 3 task quan trọng nhất trong ngày (AI gợi ý).
- [ ] **Study Streak Counter:** Bộ đếm chuỗi ngày học liên tục kèm hiệu ứng (animation).
- [ ] **Progress Ring Chart:** Biểu đồ tiến độ môn học/flashcard.
- [ ] **Upcoming Deadlines:** Timeline hiển thị deadline 7 ngày tới (phân loại màu sắc).
- [ ] **Quick Actions:** Nút FAB mở rộng (New Task, New Flashcard, Start Pomodoro).
- [ ] **AI Daily Tip:** Lời khuyên học tập cá nhân hóa.
- [ ] **Widget:** Hỗ trợ Widget màn hình chính Android (2x2 và 4x1).

### Module 02: AI Flashcard System (Mức độ ưu tiên: P0 - Critical)
*Hệ thống flashcard tích hợp AI và thuật toán lặp lại ngắt quãng (SM-2+).*
- [ ] **Tạo thủ công:** Rich text editor, hỗ trợ LaTeX, code syntax highlighting.
- [ ] **AI Auto-Generate:** Tự động tạo câu hỏi/đáp án từ đoạn văn bản nhập vào.
- [ ] **Import OCR:** Trích xuất nội dung từ PDF/Hình ảnh để tạo flashcard (ML Kit).
- [ ] **Quản lý Deck:** Sắp xếp theo môn học, tags, phân cấp thư mục.
- [ ] **Review Mode:** Flip animation, swipe gesture, thanh tiến độ. Áp dụng thuật toán SM-2+ để lên lịch ôn tập.
- [ ] **Thống kê:** Retention rate, review history, biểu đồ độ khó.
- [ ] **Share Deck:** Export dạng JSON/CSV, tạo link chia sẻ.
- [ ] **Offline First:** Lưu local, đồng bộ lên cloud khi có mạng.

### Module 03: Task & Schedule Manager (Mức độ ưu tiên: P0 - Critical)
*Quản lý lịch học thông minh tích hợp Google Calendar.*
- [ ] **Task CRUD:** Tạo, sửa, xóa task (Title, mô tả, deadline, độ ưu tiên theo ma trận Eisenhower).
- [ ] **Quản lý môn học:** Danh sách môn, màu sắc, tín chỉ.
- [ ] **Smart Scheduling:** AI gợi ý khung giờ học tối ưu.
- [ ] **Deadline Countdown:** Widget đếm ngược có cảnh báo.
- [ ] **Google Calendar:** Đồng bộ hóa 2 chiều.
- [ ] **Recurring Tasks:** Hỗ trợ lặp lại task (daily, weekly, custom).
- [ ] **Phân tích:** Tỷ lệ hoàn thành, chỉ số trì hoãn, giờ năng suất cao nhất.

### Module 04: Pomodoro Focus Timer (Mức độ ưu tiên: P1 - High)
*Đồng hồ tập trung nâng cao.*
- [ ] **Custom Timer:** Cấu hình work/break intervals.
- [ ] **Task Linking:** Gắn phiên Pomodoro với task cụ thể.
- [ ] **Focus Mode:** Chặn thông báo, làm mờ màn hình, tùy chọn khóa màn hình.
- [ ] **Ambient Sounds:** Phát âm thanh nền offline (Mưa, lofi, v.v.).
- [ ] **Breathing Exercises:** Hướng dẫn thiền trong thời gian nghỉ.
- [ ] **Foreground Service:** Chạy ngầm liên tục, hiển thị trên thanh thông báo.
- [ ] **Thống kê:** Báo cáo daily/weekly focus time, điểm focus.

### Module 05: AI Study Chatbot (Mức độ ưu tiên: P1 - High)
*Trợ lý AI 24/7 giải đáp thắc mắc.*
- [ ] **Conversational AI:** Chat theo ngữ cảnh với Gemini API.
- [ ] **Subject Context:** Đặt ngữ cảnh môn học cho AI.
- [ ] **Explain Concept:** Giải thích khái niệm với ví dụ thực tế.
- [ ] **Quiz Generator:** Tự động tạo bài trắc nghiệm từ một chủ đề.
- [ ] **Code Helper / Math Solver:** Giải thích code, debug, giải toán (hiển thị LaTeX).
- [ ] **Quản lý Chat:** Lưu lịch sử, tìm kiếm, xuất ra file PDF.

### Module 06: Gamification & Analytics (Mức độ ưu tiên: P1 - High)
*Tạo động lực học tập bền vững.*
- [ ] **Hệ thống điểm/Cấp độ:** Kiếm XP, thăng cấp (50 level).
- [ ] **Huy hiệu (Badges):** Hơn 80 điều kiện unlock khác nhau.
- [ ] **Streaks & Leaderboard:** Lịch streak có thẻ đóng băng (freeze), bảng xếp hạng bạn bè (Firebase).
- [ ] **Study Analytics:** Biểu đồ Heatmap (kiểu GitHub), biểu đồ tròn phân bổ thời gian.
- [ ] **Mục tiêu học tập:** Đặt mục tiêu tuần/tháng và theo dõi tiến độ.
- [ ] **Shareable Stats:** Tạo ảnh thống kê để chia sẻ MXH.

---

## 3. YÊU CẦU PHI CHỨC NĂNG (NON-FUNCTIONAL REQUIREMENTS)
### 3.1. Hiệu suất (Performance)
- **Cold start:** < 2 giây.
- **Memory usage:** < 150MB trong quá trình sử dụng bình thường.

### 3.2. Tính sẵn sàng & Đồng bộ (Reliability)
- Ứng dụng phải hoạt động theo cơ chế **Offline-first** (Sử dụng Room DB).
- Tự động đồng bộ ngầm (Background sync) qua WorkManager khi có kết nối Internet.

### 3.3. UI/UX
- Tuân thủ chuẩn **Material Design 3**.
- Hỗ trợ **Dark mode / Light mode** tự động theo hệ thống.
- Hỗ trợ **Accessibility** (Dành cho người khiếm khuyết).
- Hệ thống thông báo (Notification) thông minh với adaptive scheduling.

### 3.4. Chất lượng mã & Kiểm thử
- Đạt **Test coverage >= 70%** (Sử dụng Unit Tests và Instrumented Tests).

---

## 4. KIẾN TRÚC & YÊU CẦU KỸ THUẬT (TECHNICAL ARCHITECTURE)

### 4.1. Technology Stack
*   **Ngôn ngữ:** Kotlin (Coroutines, Flow).
*   **UI Framework:** Jetpack Compose + Material 3.
*   **Kiến trúc:** MVVM + Clean Architecture (3 Layers: Presentation, Domain, Data).
*   **Dependency Injection:** Hilt (Dagger2).
*   **Local Database:** Room 2.6+ (hỗ trợ SQL validation, migration).
*   **Network:** Retrofit 2 + OkHttp.
*   **Hình ảnh:** Coil 3.
*   **Điều hướng:** Navigation Compose.
*   **Testing:** JUnit5, MockK, Espresso.
*   **CI/CD:** GitHub Actions + Firebase App Distribution.

### 4.2. Cấu trúc Clean Architecture
*   **Presentation Layer (UI):** Screens (Composable stateless), ViewModels (StateFlow), UI States (Sealed class).
*   **Domain Layer:** Use Cases (Single-responsibility), Repository Interfaces, Pure Kotlin Domain Models, Business Rules (SM-2, XP calc).
*   **Data Layer:** Repository Implementations, Room DAO/DataStore, Retrofit/Firebase SDK, Mappers (Entity ↔ Domain ↔ DTO).

---

## 5. YÊU CẦU DỮ LIỆU & TÍCH HỢP (DATA & INTEGRATION)

### 5.1. Database Schema (Room) - 8 Thực thể chính
1.  `users`: id, name, email, avatar_url, xp, level, streak_count, created_at
2.  `subjects`: id, name, color, credits, user_id, created_at
3.  `tasks`: id, title, description, deadline, priority, status, subject_id, user_id
4.  `flashcard_decks`: id, name, description, subject_id, card_count, last_reviewed
5.  `flashcards`: id, front, back, deck_id, ease_factor, interval, next_review, review_count
6.  `pomodoro_sessions`: id, start_time, duration, task_id, focus_score, distraction_count
7.  `achievements`: id, name, description, icon, unlocked_at, user_id
8.  `chat_messages`: id, content, role, subject_context, timestamp, session_id

### 5.2. APIs & Dịch vụ tích hợp
*   **Gemini AI API:**
    *   Sử dụng Gemini 3.0 Flash Preview, 2.5/3.1 Flash Lite.
    *   Yêu cầu: Streaming support, Safety settings, System prompt templates, Rate limiting (exponential backoff), Token counting.
*   **Firebase Suite:**
    *   Auth: Email/Password, Google Sign-In, Anonymous.
    *   Firestore (Cloud backup, Leaderboard).
    *   Cloud Storage (Avatars, exported files).
    *   Analytics & Crashlytics.
    *   Remote Config (Feature flags, A/B testing).
*   **Google Services:**
    *   Google Calendar API (Đồng bộ 2 chiều).

---


---

## 6. PHÂN BỔ NHIỆM VỤ NHÓM (TEAM TASK ALLOCATION)

Dựa trên yêu cầu của Leader Anh Tai, dự án được chia theo các module chức năng trọn gói như sau:

### 6.1. Anh Tai (@Tai) - AI Chatbot & Core Infrastructure
- **Module 05: AI Study Chatbot** (Xử lý toàn bộ logic Gemini API, context môn học).
- **Core Infrastructure**: Thiết lập Clean Architecture (MVVM/MVI), Hilt DI, Retrofit.
- **AI Core Services**: Xây dựng các Service hỗ trợ AI (gợi ý task, tạo flashcard, trả lời nhanh).
- **Integration**: Google Calendar API 2-way sync.

### 6.2. Duy (@Duy) - Dashboard & Task Management
- **Module 01: Smart Dashboard** (Greeting, Charts, Widgets, Animation).
- **Module 03: Task & Schedule Manager** (CRUD Task, Ma trận Eisenhower, Phân tích năng suất).
- **UI Design System**: Phát triển Material Design 3, Theme, Design system dùng chung.

### 6.3. Bảo (@Bao) - Flashcards, Pomodoro & Gamification
- **Module 02: AI Flashcard System** (Hệ thống Spaced Repetition SM-2+, OCR ML Kit).
- **Module 04: Pomodoro Focus Timer** (Foreground Service, Ambient Sounds).
- **Module 06: Gamification & Analytics** (XP, Badges, Heatmap, Firebase Analytics).

---


---