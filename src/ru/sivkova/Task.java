package ru.sivkova;

public class Task {
    private String name;
    private String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "name: " + name + ", description: " + description;
    }

}
