package it.wojtas.boot.roomwebapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Room {
    private long id;
    private String number;
    private String name;
    private String info;
}
