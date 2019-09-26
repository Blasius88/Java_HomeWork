package Lector16.Task16_3;

import Lector16.Task16_2.Computer;

public class Notebook extends Computer {
    transient String comint;
    public String model;

    public Notebook(String name, String os, String antivirus, String comint, String model) {
        super(name, os, antivirus);
        this.comint = comint;
        this.model = model;
    }

    public String getComint() {
        return comint;
    }
    public void setComint(String comint) {
        this.comint = comint;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
