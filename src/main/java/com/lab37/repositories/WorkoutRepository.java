package com.lab37.repositories;

import com.lab37.models.Workout;

import java.util.ArrayList;

public class WorkoutRepository {
    private final ArrayList<Workout> workouts = new ArrayList<>();

    public WorkoutRepository() {
        this.workouts.add(new Workout("Отжимания", 500));
        this.workouts.add(new Workout("Приседания", 250));
        this.workouts.add(new Workout("Скакалка", 375));
    }

    public Workout find(String name) throws Exception {
        var workout = this.workouts.stream()
                .filter(w -> w.getName().equals(name))
                .findAny()
                .orElse(null);

        if (workout == null) {
            throw new Exception("тренировка не найдена");
        }

        return workout;
    }
}
