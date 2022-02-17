package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public enum Marks {
    BMW("БЭХАА", 1),
    MERCEDES("МЕРС", 2),
    AUDI("АУДИ", 3),
    BOING("БОИНГ", 4),
    AIROBUS("КИТ", 5),
    MAN("МАН", 6),
    MAZ("МАЗ", 7),
    VOLSWAGEN("ФОЛЬЦ", 8),
    VOLVO("ВОЛЬВО", 9),
    KAMAZ("КАМАЗ", 10);
    final String title;
    final int number;
}
