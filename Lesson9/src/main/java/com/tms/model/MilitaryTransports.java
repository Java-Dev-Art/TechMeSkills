package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class MilitaryTransports extends AirTransports {
    private boolean ejection;
    private int numberOfRocket;

    public void shut(int shuts) {
        this.numberOfRocket -= shuts;
        if (getNumberOfRocket() < 0) {
            System.out.println("Боеприпасы отсутствуют");
        } else {
            System.out.println("Ракета пошла...");
        }
    }

    public void ejectionOn() {
        if (isEjection()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
