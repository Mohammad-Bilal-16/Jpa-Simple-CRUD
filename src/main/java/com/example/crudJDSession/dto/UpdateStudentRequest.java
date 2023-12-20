package com.example.crudJDSession.dto;

import com.example.crudJDSession.models.Branch;
import com.example.crudJDSession.models.Language;
import com.example.crudJDSession.models.Student;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateStudentRequest {
    private Branch branch;
    private Language language;
    private String address;
    private int age;

    public Student to() {
        return Student.builder()
                .branch(this.branch)
                .language(this.language)
                .address(this.address)
                .age(this.age)
                .build();
    }
}
