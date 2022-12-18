/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author User
 */
@Builder
@Getter
@Setter
public class TimelineCaseByProvinces {
    
    private Integer year;
    private Integer weeknum;
    private Integer new_case;
    private Integer total_case;
    private Integer new_case_excludeabroad;
    private Integer total_case_excludeabroad;
    private Integer new_death;
    private Integer total_death;

    
}
