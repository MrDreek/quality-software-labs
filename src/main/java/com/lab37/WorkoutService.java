package com.lab37;

import com.lab37.models.Workout;

import java.util.Scanner;

public class WorkoutService {
    private final Workout workout;
    private final StopWatch stopWatch;

    public WorkoutService(Workout workout) {
        this.workout = workout;
        this.stopWatch = new StopWatch();
    }

    public double run() {
        double coloriesCount = 0.0;
        boolean isRunning = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Выбрана тренировка: " + this.workout.getName());
        System.out.println("Калорий в час: " + this.workout.getColories());
        System.out.println("Для начала тренировки введите 1, для возвращения на этап выбора тренировки введите back");

        while (sc.hasNext()) {
            switch (sc.next()) {
                case "back" -> {
                    return coloriesCount;
                }
                case "1" -> {
                    if (!isRunning) {
                        this.stopWatch.start();
                        System.out.println("Таймер пошёл, чтобы завершить тренировку введите 2");
                        isRunning = true;
                    } else {
                        System.out.println("Таймер уже идёт!");
                    }
                }
                case "2" -> {
                    if (isRunning) {
                        this.stopWatch.stop();
                        isRunning = false;

                        var elapsed = this.stopWatch.getElapsedTimeSecs();
                        var countedColories = this.workout.calcCalories(elapsed);
                        coloriesCount += countedColories;

                        System.out.println("Тренировка завершена, результат = " + String.format("%.2f", countedColories) + " калорий за " + elapsed + " секунд");
                        System.out.println("Для начала тренировки введите 1, для возвращения на этап выбора тренировки введите back");
                    } else {
                        System.out.println("Сначала запустите таймер!");
                    }

                }
                default -> System.out.println("Не правильная команда!");
            }
        }

        return coloriesCount;
    }
}
