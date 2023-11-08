import java.util.ArrayList;
import java.util.List;
class Student {
	   private List<String> selectedCourses;

	    public Student() {
	        this.selectedCourses = new ArrayList<>();
	    }

	    public void addCourse() {
	        if (selectedCourses.size() < 10) {
	            selectedCourses.add("课程" + (selectedCourses.size() + 1));
	        } else {
	            System.out.println("无法选择更多课程，已达到上限。");
	        }
	    }

	    public int getNumberOfSelectedCourses() {
	        return selectedCourses.size();
	    }
	}

	public class course {
	    public static void main(String[] args) {
	        Student student1 = new Student();
	        Student student2 = new Student();

	        for (int i = 0; i < 5; i++) {
	            student1.addCourse();
	            student2.addCourse();
	        }
	    }
	}
