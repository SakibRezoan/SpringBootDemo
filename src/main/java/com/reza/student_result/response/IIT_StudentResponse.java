package com.reza.student_result.response;

import com.reza.student_result.entities.IIT_Student;
import com.reza.student_result.enums.SemesterStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IIT_StudentResponse {
    private Long id;
    private Long roll;
    private String name;
    private String studentEmail;
    private Integer passingYear;
    private SemesterStatus semesterStatus;
    private Double cgpa;

    public static IIT_StudentResponse from(IIT_Student IITStudent) {
        IIT_StudentResponse IITStudentResponse = new IIT_StudentResponse();
        BeanUtils.copyProperties(IITStudent, IITStudentResponse);
        return IITStudentResponse;
    }

}
