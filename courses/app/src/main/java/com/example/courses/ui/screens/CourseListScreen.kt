import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.courses.data.Course
import androidx.compose.foundation.lazy.items
import com.example.courses.ui.theme.CoursesTheme


@Composable
fun CourseListScreen(courses: List<Course>) {
    LazyColumn(modifier = Modifier.fillMaxSize() .safeDrawingPadding()) {
        items(courses) { course ->
            CourseCard(course)
        }
    }
}
val sampleCourses = listOf(
    Course(
        "Object-Oriented Programming", "AS401", 5,
        "Introduces the principles of object-oriented programming, including classes, objects, inheritance, encapsulation, and polymorphism. Students will learn to design and implement software using OOP concepts.",
        "AS301"
    ),
    Course(
        "Modern Physics", "AS501", 4,
        "Covers topics in modern physics including quantum mechanics, relativity, and atomic structure. Students will explore the implications of modern physics on technology and society.",
        "AS101"
    ),
    Course(
        "Logic and Critical Thinking", "AS601", 3,
        "Enhances students' reasoning skills through the study of formal logic and critical analysis. Topics include logical fallacies, argument structure, and effective communication.",
        "None"
    )
)

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable

fun CourseListPreview() {
    CoursesTheme {
        CourseListScreen(sampleCourses)
    }
}
