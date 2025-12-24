# 🧱 1. Tạo PROJECT DEMO (10 phút)

## 📁 Cấu trúc project

```
qa-ai-demo/
├─ src/
│  ├─ main/
│  │  └─ java/
│  │     └─ core/
│  │        ├─ driver/
│  │        ├─ api/
│  │        └─ utils/
│  └─ test/
│     └─ java/
│        └─ tests/
│           ├─ LoginTest.java
│           └─ ApiHealthTest.java
├─ pom.xml
└─ README.md
```

---

## 🚀 Tạo project nhanh

```
Ctrl + Shift + P
→ Java: Create Java Project
→ Maven
→ Java 17
→ Artifact: qa-ai-demo
```

---

# 🤖 2. CÁCH 1 – GitHub Copilot (Sinh code)

👉 **Vai trò:** _Code generator chính_

---

## ✨ Demo 1: Sinh test Web

Mở `LoginTest.java`, gõ **comment trước**:

```java
// Write a Selenium test using TestNG
// Open login page
// Input username/password
// Assert login success
```

⏳ **Chờ 1–2 giây**
👉 Copilot tự sinh code → `Tab` để accept

📌 **Thói quen đúng**

- Viết comment rõ
- Không gõ code trước Copilot

---

## ✨ Demo 2: Sinh helper class

Tạo `DriverFactory.java`, gõ:

```java
// Factory class to initialize Chrome WebDriver
// Support headless mode
// Singleton pattern
```

👉 Copilot sinh full class

---

## 🧠 Khi nào dùng Copilot?

✔ Sinh test case
✔ Sinh framework skeleton
✔ Sinh helper / util

❌ Không dùng để giải thích dài

---

# 🤖 3. CÁCH 2 – Tabnine (Autocomplete thông minh)

👉 **Vai trò:** _Code nhanh – ít lỗi_

---

## ✨ Demo: Gõ nửa dòng

Trong `ApiHealthTest.java`:

```java
public void checkApiHealth() {
    HttpResponse<String> response =
```

⏳ **Không nhấn gì**, Tabnine sẽ:

- Gợi ý phần còn lại
- Điền đúng kiểu biến

📌 **Cảm nhận:**

- Nhẹ
- Không “spam” code
- Phù hợp lúc bạn đã biết mình viết gì

---

## 🧠 Khi nào dùng Tabnine?

✔ Viết code quen tay
✔ Hoàn thiện method
✔ Tránh typo

❌ Không dùng để thiết kế kiến trúc

---

# 🤖 4. CÁCH 3 – ChatGPT (Explain / Design / Refactor)

👉 **Vai trò:** _Senior QA trong IDE_

---

## ✨ Demo 1: Explain code

Bôi đen 1 method → Right click → **Ask ChatGPT**
Prompt:

```
Explain this method and suggest improvements for test stability
```

👉 ChatGPT:

- Giải thích logic
- Gợi ý wait / retry / timeout

---

## ✨ Demo 2: Design framework

Prompt:

```
Suggest a clean architecture for a test framework
supporting Web, API, Mobile
```

👉 Bạn **KHÔNG code**, chỉ đọc & chỉnh

---

## 🧠 Khi nào dùng ChatGPT?

✔ Hiểu code
✔ Refactor
✔ Viết README / document
✔ Review framework

❌ Không dùng liên tục khi code nhanh

---

# 🔀 5. KẾT HỢP 3 AI – WORKFLOW CHUẨN

### 🧩 Ví dụ 1 task:

> “Viết test login + maintainable”

1️⃣ **ChatGPT**

> “Design test structure for login test”

2️⃣ **Copilot**

> Sinh code theo design

3️⃣ **Tabnine**

> Gõ nhanh phần còn lại

---

# 🧪 6. GIT DEMO (cực quan trọng)

## Init Git

```
Ctrl + `
git init
git add .
git commit -m "Initial test framework"
```

---

## Dùng AI để viết commit message

Bôi đen diff → Ask ChatGPT:

```
Write a clean git commit message
```

---

## Review PR (tập thói quen senior)

Prompt:

```
Review this change as a QA architect
```

---

# 📌 7. CHECKLIST NÊN BẬT / TẮT

### ✅ BẬT

✔ Copilot
✔ Inline Suggest (VS Code)
✔ Git integration

### ❌ TẮT

❌ Multiple ChatGPT plugin cùng lúc
❌ Autocomplete popup truyền thống (nếu nhiễu)

---

# 🧠 TỔNG KẾT DỄ NHỚ

| AI      | Dùng khi                    |
| ------- | --------------------------- |
| Copilot | Chưa biết code              |
| Tabnine | Biết mình muốn viết gì      |
| ChatGPT | Muốn hiểu, thiết kế, review |
