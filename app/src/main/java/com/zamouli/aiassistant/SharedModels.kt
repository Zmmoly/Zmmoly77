package com.zamouli.aiassistant

/**
 * فئات البيانات المشتركة للتطبيق
 * يتم استخدام هذه النماذج في مختلف أجزاء التطبيق
 */

// نموذج نتائج تحليل الصور
data class ImageAnalysisResult(
    val objects: List<DetectedObject>,
    val sceneType: String,
    val dominantColors: List<String>,
    val confidence: Float
)

// نموذج الكائنات المكتشفة في الصور
data class DetectedObject(
    val name: String,
    val confidence: Float,
    val boundingBox: Rect
)

// نموذج المستطيل لتحديد المناطق
data class Rect(
    val left: Float,
    val top: Float,
    val right: Float,
    val bottom: Float
)

// نموذج الإحداثيات الجغرافية
data class Coordinates(
    val latitude: Double,
    val longitude: Double
)

// نموذج الأماكن
data class Place(
    val name: String,
    val address: String,
    val coordinates: Coordinates
)

// نموذج معلومات المسار
data class RouteInfo(
    val distance: Double,
    val duration: Int,
    val steps: List<String>
)

// نموذج معلومات الطقس
data class WeatherInfo(
    val temperature: Float,
    val condition: String,
    val humidity: Int,
    val windSpeed: Float,
    val location: String,
    val forecast: List<WeatherForecast>
)

// نموذج توقعات الطقس
data class WeatherForecast(
    val day: String,
    val minTemp: Float,
    val maxTemp: Float,
    val condition: String,
    val precipitation: Float
)

// نموذج بيانات النشاط
data class ActivityData(
    val steps: Int,
    val distance: Float,
    val calories: Int,
    val activeMinutes: Int
)

// نموذج بيانات النوم
data class SleepData(
    val totalDuration: Int,
    val deepSleep: Int,
    val lightSleep: Int,
    val remSleep: Int,
    val awake: Int,
    val sleepQuality: Float
)

// نموذج نتائج البحث
data class SearchResult(
    val title: String,
    val snippet: String,
    val url: String,
    val relevance: Float
)

// نموذج تفضيلات المستخدم
data class UserPreferences(
    val theme: String,
    val fontSize: Int,
    val language: String,
    val notifications: Boolean,
    val voiceControl: Boolean,
    val accessibilityOptions: Map<String, Boolean>
)

// نموذج الرؤى والاستنتاجات
data class Insight(
    val title: String,
    val description: String,
    val confidence: Float,
    val category: String,
    val timestamp: Long
)
