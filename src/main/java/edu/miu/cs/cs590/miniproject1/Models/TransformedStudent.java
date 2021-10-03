package edu.miu.cs.cs590.miniproject1.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransformedStudent {
    private String firstName;
    private String lastName;

    @Digits(integer = 1, fraction = 1)
    @Max(value = 4)
    private double GPA;

    private Date DOB; // First day of the year

}

