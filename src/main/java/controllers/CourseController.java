package controllers;

import db.DBCourse;
import models.Course;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;

public class CourseController {

    public CourseController() {
        this.setupEndpoints();
    }

    private void setupEndpoints(){

//        index
        get("/university/courses", (req, res) -> {

            HashMap<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/courses/index.vtl");

            List<Course> courses = DBCourse.getCourses();
            model.put("courses", courses);

            return new ModelAndView(model, "templates/layout.vtl");

        }, new VelocityTemplateEngine());

//        create new

//        view course lessons


    }
}
