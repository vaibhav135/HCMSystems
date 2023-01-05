package helpers;

import HCM.*;
import java.util.List;

public class validation {
    private String input;

    validation(String input) {
        this.input = input;
    }

    public void name(List<? extends CommonInfo> list) {
        for (int index = 0; index < list.size(); index++) {
            String name = list.get(index).getName();
        }
    }
}
