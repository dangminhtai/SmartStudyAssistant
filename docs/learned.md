# LEARNED.md - Bài học kinh nghiệm

Dưới đây là các bài học, kiến thức thu thập được trong quá trình phát triển dự án **Smart Study Assistant**.

## 1. Quản lý dự án & Teamwork
- [x] Lên kế hoạch phân chia nhiệm vụ sớm cho 3 thành viên giúp tối ưu hóa tiến độ.
- [x] Sử dụng nhánh Git riêng cho từng người (`dangminhtai`, `duongminhduy`, `nguyenvubao`) giúp quản lý code song song hiệu quả.
- [x] Chia nhỏ task theo module chức năng (End-to-End) giúp mỗi thành viên nắm bắt trọn vẹn nghiệp vụ.

## 2. Quy trình Agentic AI
- [x] Phân chia tệp tin `task.md` vào từng thư mục cá nhân giúp Agent dễ dàng hỗ trợ đúng người đúng việc.

## 3. Kiến thức về AI & Model (Năm 2026)
- [x] Luôn sử dụng các model Gemini thế hệ mới nhất:
    - `gemini-3.1-flash-lite-preview`
    - `gemini-2.5-flash-lite`
    - `gemini-2.5-flash`
    - `gemini-3-flash-preview`

## 4. Gradle Version Catalog (libs.versions.toml)
- [x] Không sử dụng `version.literal`. Gradle chỉ chấp nhận `version`, `version.ref`, hoặc các ràng buộc (strictly, prefer, ...).
- [x] Cách tốt nhất là luôn khai báo version trong mục `[versions]` và dùng `version.ref` để quản lý tập trung.

---
*Cập nhật lần cuối: 2026-04-01*
