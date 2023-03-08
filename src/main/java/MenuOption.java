public enum MenuOption {

    QUIT(0),

    CHECK_STUDENT_IN(1),

    ENROLL_STUDENT(2),

    UPDATE_MEMBERSHIP(3),

    UPDATE_STUDENT_INFO(4),

    VIEW_STUDENT_TRAINING_HISTORY(5),

    VIEW_STUDENTS_OF_RANK(6),

    VIEW_ALL_STUDENTS(7);







    private final int optionNumber;

    private MenuOption (int optionNum)
    {
        this.optionNumber = optionNum;
    }
}
