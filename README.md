# weather-api-springboot
🌤️ Spring Boot Weather App
A user-friendly weather application built with Spring Boot and Thymeleaf that fetches real-time weather data from the OpenWeatherMap API. Users can search for any city worldwide to view current weather conditions, including temperature, humidity, and a brief description.

# 🚀 Features
🔍 Search weather by city name

🌡️ Display current temperature, humidity, and weather conditions

🎨 Responsive and clean UI using Thymeleaf templates

🔗 Integration with OpenWeatherMap API for real-time data

# 🛠️ Tech Stack
Backend: Java 17+, Spring Boot, Spring MVC

Frontend: Thymeleaf, HTML, CSS

API Integration: OpenWeatherMap API

Build Tool: Maven

# ⚙️ Setup and Installation
# Prerequisites
Java 17 or higher

Maven

An IDE (e.g., IntelliJ IDEA, Eclipse)

OpenWeatherMap API Key (Sign up here)

# Steps
# 1.Clone the Repository:

bash
Copy
Edit
git clone https://github.com/yourusername/weather-app.git
cd weather-app
# 2.Configure the API Key:

Open the application.properties file located in src/main/resources/ and add your OpenWeatherMap API key:

properties
Copy
Edit
openweathermap.api.key=YOUR_API_KEY
# 3.Build and Run the Application:

bash
Copy
Edit
mvn clean install
mvn spring-boot:run
# 4.Access the Application:

Navigate to http://localhost:8080 in your web browser.


