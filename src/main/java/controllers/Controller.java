package controllers;
import db.Seeds;

import static spark.SparkBase.staticFileLocation;

public class Controller {

    public static void main(String[] args) {

        staticFileLocation("/public");

//        generate my seed data on load
        Seeds.generateSeeds();

//        load up my Model Controllers
        CourseController courseController = new CourseController();
        StudentController studentController = new StudentController();
        InstructorController instructorController = new InstructorController();
        LessonController lessonController = new LessonController();

    }
}
