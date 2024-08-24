package org.coursesjava;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Fighter {
    private String name;
    private int health, damagePerAttack;
}
