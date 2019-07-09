package api.data.course.data.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String id) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findById(id);
		return courses;
	}

	public Optional<Course> getCourses(String id) {
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course topic) {
		courseRepository.save(topic);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
