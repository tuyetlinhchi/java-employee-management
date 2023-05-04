package com.asifekbal.management.Shema;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name = "dev")
@DiscriminatorValue("DEV")
public class Dev extends Employee {

//    ArrayList<String> techStack = new ArrayList<String>();
//    public ArrayList<String> getTechStack() {
//        return techStack;
//    }
    private String techStack;
    public String getTechStack() {
        return techStack;
    }
    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }
}
