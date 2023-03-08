package Activity;

import StudentInfo.Rank;
import dynamodb.MembershipDao;
import dynamodb.StudentDao;
import dynamodb.models.Membership;
import dynamodb.models.Student;

public class StudentAppActivity {
    private StudentDao studentDao;
    private MembershipDao membershipDao;

    public boolean checkStudentIntoClass(Student student) {
        return false;
    }

    public Student enrollNewStudent(String firstName, String lastName, Rank rank) {
        return new Student();
    }

    public boolean updateMembership (Student student, Membership membership) {
        return false;
    }
}
