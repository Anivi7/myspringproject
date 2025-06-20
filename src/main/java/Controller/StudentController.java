package Controller;


import Service.StudentService;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;


    @PostMapping(" /add")
    public String postMethodName(@RequestBody Student student, Object service) {

        service.toString();

        return "user with " + student.getName() + " is added";

    }
}
