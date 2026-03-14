package com.example.schoolERP.project.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.schoolERP.project.model.Student;
import com.example.schoolERP.project.service.AttendanceService;
import com.example.schoolERP.project.service.CourseService;
import com.example.schoolERP.project.service.CustomUserDetails;
import com.example.schoolERP.project.service.ExamScoreService;
import com.example.schoolERP.project.service.FeeService;
import com.example.schoolERP.project.service.StudentService;
import com.example.schoolERP.project.service.TimetableService;

@Controller
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;
    private final CourseService courseService;
    private final AttendanceService attendanceService;
    private final ExamScoreService examScoreService;
    private final FeeService feeService;
    private final TimetableService timetableService;

    public StudentController(StudentService studentService,
                             CourseService courseService,
                             AttendanceService attendanceService,
                             ExamScoreService examScoreService,
                             FeeService feeService,
                             TimetableService timetableService) {
        this.studentService = studentService;
        this.courseService = courseService;
        this.attendanceService = attendanceService;
        this.examScoreService = examScoreService;
        this.feeService = feeService;
        this.timetableService = timetableService;
    }

    // Helper: get logged-in student's profile
    private Student getLoggedInStudent(CustomUserDetails userDetails) {
        Student student = studentService.getStudentByUser(userDetails.getUser());

        // Debug line to check if student exists
        System.out.println("Logged User ID: " + userDetails.getUser().getId());
        System.out.println("Student Found: " + student);

        return student;
    }

    // ─────────────────────────────────────────
    // DASHBOARD
    // ─────────────────────────────────────────

    @GetMapping("/dashboard")
    public String studentDashboard(@AuthenticationPrincipal CustomUserDetails userDetails,
                                   Model model) {

        if(userDetails == null){
            return "redirect:/login";
        }

        Student student = getLoggedInStudent(userDetails);

        if (student == null) {
            return "redirect:/login";
        }

        model.addAttribute("student", student);
        model.addAttribute("attendancePercentage",
                attendanceService.calculateAttendancePercentage(student));
        model.addAttribute("presentDays",
                attendanceService.countPresentDays(student));
        model.addAttribute("totalDays",
                attendanceService.countTotalDays(student));
        model.addAttribute("scores",
                examScoreService.getScoresByStudent(student));
        model.addAttribute("fee",
                feeService.getFeeByStudent(student));
        model.addAttribute("courses",
                courseService.getCoursesByClass(student.getClassNumber()));

        return "student/student_dashboard";
    }
    // ─────────────────────────────────────────
    // COURSES
    // ─────────────────────────────────────────

    @GetMapping("/courses")
    public String viewCourses(@AuthenticationPrincipal CustomUserDetails userDetails,
                              Model model) {

        Student student = getLoggedInStudent(userDetails);

        if (student == null) {
            return "redirect:/login";
        }

        model.addAttribute("student", student);
        model.addAttribute("courses",
                courseService.getCoursesByClass(student.getClassNumber()));

        return "student/view_courses";
    }

    // ─────────────────────────────────────────
    // ATTENDANCE
    // ─────────────────────────────────────────

    @GetMapping("/attendance")
    public String viewAttendance(@AuthenticationPrincipal CustomUserDetails userDetails,
                                 Model model) {

        Student student = getLoggedInStudent(userDetails);

        if (student == null) {
            return "redirect:/login";
        }

        model.addAttribute("student", student);
        model.addAttribute("attendanceList",
                attendanceService.getAttendanceByStudent(student));
        model.addAttribute("attendancePercentage",
                attendanceService.calculateAttendancePercentage(student));
        model.addAttribute("presentDays",
                attendanceService.countPresentDays(student));
        model.addAttribute("totalDays",
                attendanceService.countTotalDays(student));

        return "student/view_attendance";
    }

    // ─────────────────────────────────────────
    // SCORES
    // ─────────────────────────────────────────

    @GetMapping("/scores")
    public String viewScores(@AuthenticationPrincipal CustomUserDetails userDetails,
                             Model model) {

        Student student = getLoggedInStudent(userDetails);

        if (student == null) {
            return "redirect:/login";
        }

        model.addAttribute("student", student);
        model.addAttribute("scores",
                examScoreService.getScoresByStudent(student));

        return "student/view_scores";
    }

    // ─────────────────────────────────────────
    // FEES
    // ─────────────────────────────────────────

    @GetMapping("/fees")
    public String viewFees(@AuthenticationPrincipal CustomUserDetails userDetails,
                           Model model) {

        Student student = getLoggedInStudent(userDetails);

        if (student == null) {
            return "redirect:/login";
        }

        model.addAttribute("student", student);
        model.addAttribute("fee",
                feeService.getFeeByStudent(student));
        model.addAttribute("remainingBalance",
                feeService.getRemainingBalance(student));

        return "student/view_fees";
    }

    // ─────────────────────────────────────────
    // TIMETABLE
    // ─────────────────────────────────────────

    @GetMapping("/timetable")
    public String viewTimetable(@AuthenticationPrincipal CustomUserDetails userDetails,
                                Model model) {

        Student student = getLoggedInStudent(userDetails);

        if (student == null) {
            return "redirect:/login";
        }

        model.addAttribute("student", student);
        model.addAttribute("timetable",
                timetableService.getTimetableByClass(student.getClassNumber()));

        return "student/view_timetable";
    }
}