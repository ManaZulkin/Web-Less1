package org.lesson2;

public class Candy {
    String name, swetnes, teste, type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSwetnes() {
        return swetnes;
    }

    public void setSwetnes(String swetnes) {
        this.swetnes = swetnes;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy: " +
                "name='" + name + '\'' +
                ", swetnes='" + swetnes + '\'' +
                ", teste='" + teste + '\'' +
                ", type='" + type + '\'';
    }
}
