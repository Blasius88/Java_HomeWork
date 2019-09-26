package Lector16.Task16_2;

import java.io.Serializable;

public class Computer implements Serializable {
    private String name;
    private String os;
    private String antivirus;

    public Computer(String name, String os, String antivirus) {
        this.name = name;
        this.os = os;
        this.antivirus = antivirus;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public String getAntivirus() {
        return antivirus;
    }
    public void setAntivirus(String antivirus) {
        this.antivirus = antivirus;
    }
}
